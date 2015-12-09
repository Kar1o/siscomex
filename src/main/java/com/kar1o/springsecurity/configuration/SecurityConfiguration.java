package com.kar1o.springsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("customUserDetailsService")
	UserDetailsService userDetailsService;

	@Autowired
	CustomSuccessHandler customSuccessHandler;

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
<<<<<<< HEAD
	    .antMatchers("/home").permitAll()
	    .antMatchers("/", "/menu").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers("/importar").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers("/resultado").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers(HttpMethod.POST, "/upload").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers(HttpMethod.POST, "validarValor").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	  	.antMatchers("/admin/**").access("hasRole('DBA') or hasRole('ADMIN')")
	  	.antMatchers("/db/**").hasRole("DBA")
	  	.and().formLogin().loginPage("/login").successHandler(customSuccessHandler)
	  	.usernameParameter("ssoId").passwordParameter("password")
	  	.and().exceptionHandling().accessDeniedPage("/accessDenied")
	    .and().csrf().disable();
=======
	    .antMatchers("/", "/home").permitAll()
	    .antMatchers("/menu").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers(HttpMethod.POST, "/importar").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers(HttpMethod.POST, "/resultado").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	    .antMatchers(HttpMethod.POST, "/upload").access("hasRole('DBA') or hasRole('ADMIN') or hasRole('USER')")
	  	//.antMatchers("/admin/**").access("hasRole('ADMIN')")
	  	.antMatchers("/admin/**").access("hasRole('DBA') or hasRole('ADMIN')")
	  	//.antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
	  	.antMatchers("/db/**").hasRole("DBA")
	  	.and().formLogin().loginPage("/login").successHandler(customSuccessHandler)
	  	.usernameParameter("ssoId").passwordParameter("password")
	  	.and().csrf()
	  	.and().exceptionHandling().accessDeniedPage("/accessDenied");
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
	}
}