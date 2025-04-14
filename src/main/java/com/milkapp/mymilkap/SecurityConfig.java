package com.milkapp.mymilkap;  // Adjust this package as needed

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()  // Disable CSRF if not needed
                .authorizeHttpRequests()
                .requestMatchers("/api/farmers/{id}").authenticated()  // Secure API endpoints
                .anyRequest().permitAll()  // Allow all other requests
                .and()
                .httpBasic();  // Enable basic authentication
        return http.build();
    }
}
