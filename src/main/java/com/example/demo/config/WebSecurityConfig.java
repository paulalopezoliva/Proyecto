package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.service.MyUsersDetailsService;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	MyUsersDetailsService myuserdetailsservice;
	
	@Autowired
	private DataSource datasource;
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myuserdetailsservice);
    }
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
				
				.antMatchers("/alumnos/insert","/alumnos/delete","/alumnos/update").hasAuthority("ADMIN")
				.antMatchers("/alumnos/list","/alumnos/get").hasAnyAuthority("ADMIN","APODERADO")
				.antMatchers("/","/login","/index","/home","/css/paginainicio.css","/fonts/colegio.jpg","/fonts/ColegioCancha_small.jpg","portada-editada.jpg","/fonts/logo.png","/fonts").permitAll();
		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login").permitAll() 
				.and()
			.logout()
				.permitAll()
	
		; 
		http.exceptionHandling().accessDeniedPage("/403")
		;
	
	}
	/*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth
			.jdbcAuthentication().dataSource(datasource).passwordEncoder(passwordEncoder())
			.usersByUsernameQuery("SELECT USERNAME, PASSWORD, ENABLE FROM USERS WHERE USERNAME=?")
			.authoritiesByUsernameQuery("SELECT U.USERNAME, A.AUTHORITY FROM AUTHORITIES A, USERS U WHERE USERNAME=? AND U.USERNAME=A.USERNAME");
		
	}
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	*/
	/*
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("1234")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
	*/
}
