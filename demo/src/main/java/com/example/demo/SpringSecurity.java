package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurity extends WebSecurityConfigurerAdapter{

	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("abc").password("123").roles("ADMIN");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/rest/auth/Auth").fullyAuthenticated().and().httpBasic();
		//super.configure(http);
	}
	
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder(){
		
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}
