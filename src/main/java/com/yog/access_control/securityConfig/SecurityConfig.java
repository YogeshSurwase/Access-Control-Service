package com.yog.access_control.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain basicAuth(HttpSecurity httpSecurity) {
		httpSecurity
		.authorizeHttpRequests(auth ->
				auth.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		
		return httpSecurity.build();
	}

}
