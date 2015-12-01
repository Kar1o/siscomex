package com.kar1o.springsecurity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import com.kar1o.springsecurity.service.FileService;

@Controller
public class HelloWorldController {


	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		model.addAttribute("greeting", "Hi, Welcome to mysite");
		model.addAttribute("password", getPassword());
		model.addAttribute("name", getPrincipal());
		return "welcome";
	}

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menuPage(ModelMap model) {

        model.addAttribute("user", getPrincipal());
        return "menu";
    }

    @RequestMapping(value = "/importar", method = RequestMethod.GET)
    public String importarPage(ModelMap model) {

        model.addAttribute("user", getPrincipal());
        return "importar";
    }

    /*@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String importarPost(ModelMap model, MultipartFile file) {
        try {
            file.transferTo(new File("/home/kar1o/Workspaces/spring/siscomex/" + file.getOriginalFilename()));
        } catch (Exception ex) {
            model.addAttribute("user", getPrincipal());
            return "importar";
        }
        model.addAttribute("resultado", getPrincipal());
        return "resultado";


    }*/

    //@AutoWired
    private FileService fileService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ModelAndView uploadFile(@RequestParam("file") MultipartFile multipartFile){
        long fileSize = multipartFile.getSize();
        String fileName = multipartFile.getOriginalFilename();
        ModelAndView modelAndView = new ModelAndView("upload-success");
        if(fileService.saveFile(multipartFile)){
            Map<String, Object> modelMap = new HashMap();
            modelMap.put("fileName", fileName);
            modelMap.put("fileSize", fileSize);
            modelAndView.addAllObjects(modelMap);
            return modelAndView;
        }
        return new ModelAndView("upload-failed");
    }


    @RequestMapping(value = "/resultado", method = RequestMethod.GET)
    public String resultadoPage(ModelMap model) {
        return "resultado";
    }

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(ModelMap model) {

		model.addAttribute("user", getPrincipal());
		return "admin";
	}

	@RequestMapping(value = "/dba", method = RequestMethod.GET)
	public String dbaPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "dba";
	}

	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "accessDenied";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}



	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	private String getPassword(){
		String userPassword = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails){
			userPassword = ((UserDetails)principal).getPassword();
		}
			else{
				userPassword = principal.toString();
			}

		return userPassword;
	}

}