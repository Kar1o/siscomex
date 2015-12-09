package com.kar1o.springsecurity.controller;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kar1o.springsecurity.service.FileService;
import com.kar1o.springsecurity.model.Xml;

@Controller
public class HelloWorldController {
	public String fileName;
	private static SessionFactory factory; 

	private static SessionFactory sessionFactory;

	@Autowired
	private FileService fileService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		model.addAttribute("name", getPrincipal());
		return "welcome";
	}

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
		model.addAttribute("name", getPrincipal());

		return "admin";
	}

	@RequestMapping(value = { "/", "/menu" }, method = RequestMethod.GET)
	public String menuPage(ModelMap model) {

		model.addAttribute("user", getPrincipal());
		return "menu";
	}

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

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	private int getResult() {
		Random num = new Random();
		int result = num.nextInt(4) + 1;
		return result;
	}

}