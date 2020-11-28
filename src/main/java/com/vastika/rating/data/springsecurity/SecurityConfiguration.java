package com.vastika.rating.data.springsecurity;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	PustakariUserDetailService pustakariUserDetailService;
	
	@Override
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(pustakariUserDetailService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/admin").hasRole("Admin")
			.antMatchers("/user").hasAnyRole("Admin","User")
			.antMatchers("/").permitAll()
			.and().formLogin();
		
	}
	
}
*/