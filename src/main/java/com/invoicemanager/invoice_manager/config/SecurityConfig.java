package com.invoicemanager.invoice_manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // H2 doesn't support CSRF tokens
            .headers(headers -> headers.frameOptions(frame -> frame.disable()))
            .authorizeHttpRequests(requests -> requests
                    .requestMatchers("/h2-console/**").permitAll() // allowlist H2 console
                    .anyRequest().authenticated())
            .formLogin(withDefaults()); // Enable login page for secured routes

        return http.build();
    }
}
