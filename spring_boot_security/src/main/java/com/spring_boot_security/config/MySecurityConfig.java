package com.spring_boot_security.config;

@Configuration
public class MySecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf(AbstractHttpConfigurer::disable) // Disable CSRF for APIs
//            .authorizeHttpRequests(auth -> auth
//            .requestMatchers("/public/**")
//            .permitAll()  // Public endpoints
//            .anyRequest()
//            .authenticated())  // Secure all other endpoints
////            .formLogin(withDefaults());
//            .httpBasic(withDefaults());  // ✅ FIX: Use `Customizer.withDefaults()`
//
//        return http.build();
//    }
	
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for stateless APIs
            .authorizeHttpRequests()
                .anyRequest().authenticated() // Require auth for all endpoints
            .and()
                .httpBasic(); // Use Basic Authentication

        return http.build();
    }
}
