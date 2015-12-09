package com.kar1o.springsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.kar1o.springsecurity")
public class HelloWorldConfiguration extends WebMvcConfigurerAdapter {

	@Bean(name="HelloWorld")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

<<<<<<< HEAD
	@Bean(name="multipartResolver")
=======
	/*@Bean(name="multipartResolver")
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
	public CommonsMultipartResolver commonsMultipartResolver(){
	    CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
	    //10 MB
	    commonsMultipartResolver.setMaxUploadSize(10485760);
	    return commonsMultipartResolver;
<<<<<<< HEAD
	}
=======
	}*/
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

	/*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     *
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
}