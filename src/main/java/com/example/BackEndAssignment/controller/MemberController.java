package com.example.BackEndAssignment.controller;

import com.example.BackEndAssignment.member.Member;
import com.example.BackEndAssignment.member.Role;
import com.example.BackEndAssignment.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth") // SecurityConfig에서 permitAll() 해준 주소
public class MemberController {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder; // SecurityConfig에서 만든 암호화 기계

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        // 1. 비밀번호 암호화 (중요!)
        String encodedPassword = passwordEncoder.encode(request.getPassword());

        // 2. 회원 객체 생성 및 저장
        Member member = Member.builder()
                .username(request.getUsername())
                .password(encodedPassword) // 암호화된 비번 저장
                .role(Role.ROLE_USER)      // 기본 권한 부여
                .build();

        memberRepository.save(member);
        return "회원가입 성공!";
    }
}

// 회원가입 요청 데이터를 담을 간단한 클래스
@lombok.Getter
@lombok.Setter
class SignupRequest {
    private String username;
    private String password;
}