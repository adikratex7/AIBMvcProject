package com.yogisoft.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Here InMemoryDB
		//this method is for providing authentication provider logic nothing but provide memomy to save authentication info provider
		
		auth.inMemoryAuthentication().withUser("Yogesh").password("{noop}Spark").roles("CUSTOMER");
		auth.inMemoryAuthentication().withUser("Manish").password("{noop}Manish").roles("CUSTOMER","MANAGER");
		auth.inMemoryAuthentication().withUser("Mangesh").password("{noop}Mangesh").roles("ADMIN");
		
	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//AUTHORIZE Request
		
		http.authorizeRequests().antMatchers("/").permitAll() //No Authentication no athurization
		.antMatchers("/offers").authenticated()   // Only Authentication 
		.antMatchers("/loanApprove").hasAnyRole("CUSTOMER","MANAGER","ADMIN") //authentication + authorization  having customer manager admin roles are ther
		.antMatchers("/balance").hasAnyRole("CUSTOMER")  //authentication + authorization for role
		.anyRequest().authenticated().and().formLogin().and().exceptionHandling().accessDeniedPage("/denied")
		
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).and().rememberMe();
		
		//specify the authentication mode use browser manage authentication mode 
		
	
	}
}
