package com.example.BackEndAssignment.service;

import com.example.BackEndAssignment.member.Member;
import com.example.BackEndAssignment.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 1. 리포지토리를 사용해 DB에서 아이디로 사용자를 찾습니다.
        Member member = memberRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("해당 아이디를 가진 사용자가 없습니다: " + username));

        // 2. Spring Security가 이해할 수 있는 'UserDetails' 객체로 변환하여 반환합니다.
        return User.builder()
                .username(member.getUsername())
                .password(member.getPassword())
                // Enum의 name()을 가져오되, 만약 "ROLE_USER"라면 "USER"만 추출해야 합니다.
                .roles(member.getRole().name().replace("ROLE_", ""))
                .build();
    }
}