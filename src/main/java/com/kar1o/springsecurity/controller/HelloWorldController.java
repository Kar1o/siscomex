package com.kar1o.springsecurity.controller;

<<<<<<< HEAD
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
=======
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
<<<<<<< HEAD
import org.springframework.util.MultiValueMap;
=======
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
<<<<<<< HEAD
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

=======
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
import com.kar1o.springsecurity.service.FileService;
import com.kar1o.springsecurity.model.Xml;

@Controller
public class HelloWorldController {
<<<<<<< HEAD
	public String fileName;
	private static SessionFactory factory; 

	private static SessionFactory sessionFactory;

	@Autowired
	private FileService fileService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
=======

    @Autowired
    private FileService fileService;


	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
	public String homePage(ModelMap model) {

		model.addAttribute("name", getPrincipal());
		return "welcome";
	}

<<<<<<< HEAD
	@RequestMapping(value = "/importar", method = RequestMethod.GET)
	public String importarPage(ModelMap model) {

		model.addAttribute("user", getPrincipal());
		return "importar";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("file") MultipartFile multipartFile, ModelMap model) {
		fileName = multipartFile.getOriginalFilename();
		if (fileService.saveFile(multipartFile)) {
			model.addAttribute("fileName", fileName);
			return "redirect:/resultado";
		}
		return "upload-failed";
	}

	@RequestMapping(value = "/resultado", method = RequestMethod.GET)
	public String resultadoPage(/*@RequestParam("file") MultipartFile multipartFile,*/ ModelMap model) {
//		MultipartRequest multipartRequest = new MultipartRequest();
//		MultipartFile newFile = multipartRequest.getFile(fileName);
//		InputStream is = new newFile.
		//String fileText= multipartFile.toString();
		model.addAttribute("result", getResult());
		model.addAttribute("fileName", fileName);
		//model.addAttribute("fileText", fileText);
		
		return "resultado";
	}

	@RequestMapping(value = "mudaValor", method = RequestMethod.POST)
	public String saveXml(ModelMap model, Xml xml) {

		// XmlServiceImpl.save(xml);

		// Session session = sessionFactory.getCurrentSession();
		// session.beginTransaction();
		// session.save(xml);
		// session.getTransaction().commit();

		return "menu";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(ModelMap model, @ModelAttribute("xml") Xml xml) {
		factory = new Configuration().configure().buildSessionFactory();
=======
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
	public String adminPage(ModelMap model, @ModelAttribute("xml") Xml xml) {
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
		model.addAttribute("name", getPrincipal());

		return "admin";
	}

<<<<<<< HEAD
	@RequestMapping(value = { "/", "/menu" }, method = RequestMethod.GET)
	public String menuPage(ModelMap model) {

		model.addAttribute("user", getPrincipal());
		return "menu";
	}
=======
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menuPage(ModelMap model) {

        model.addAttribute("user", getPrincipal());
        return "menu";
    }
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

	@RequestMapping(value = "/db", method = RequestMethod.GET)
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

<<<<<<< HEAD
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
=======
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

<<<<<<< HEAD
	private String getPrincipal() {
=======


	private String getPrincipal(){
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
<<<<<<< HEAD
			userName = ((UserDetails) principal).getUsername();
=======
			userName = ((UserDetails)principal).getUsername();
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
		} else {
			userName = principal.toString();
		}
		return userName;
	}

<<<<<<< HEAD
	private int getResult() {
		Random num = new Random();
		int result = num.nextInt(4) + 1;
		return result;
	}

=======
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
}