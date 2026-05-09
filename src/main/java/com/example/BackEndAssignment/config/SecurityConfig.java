package com.example.BackEndAssignment.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //스프링이 알아서 보안 환경 설정
@EnableWebSecurity // 얘는 모든 요청 다 차단하고 누군지 확인하는 검문소 역할
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // 외부 POST 요청을 허용하기 위해 잠시 끔
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/auth/**", "/login", "/signup").permitAll() // 인증 없이 접근 가능
                        .requestMatchers("/api/admin/**").hasRole("ADMIN") // 관리자만 접근 가능 (인가)
                        .anyRequest().authenticated() // 그 외 모든 요청은 로그인 필수 (인증)
                )
                .formLogin(form -> form
                        .defaultSuccessUrl("/api/home") // 로그인 성공 시 이동할 주소
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/login")
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 비밀번호를 해시 암호화하는 빈 등록 (BCrypt 방식)
        return new BCryptPasswordEncoder();
    }
}