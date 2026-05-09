package com.example.BackEndAssignment.member;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// domain/Member.java
@Entity //테이블 1ㄷ1
@Getter //안 내용 보여주는 거
@NoArgsConstructor // 빈 생성자 만드는 거 -> 빈 생성자에다 객체 담아야함
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키가 1씩 올라감
    private Long id; //id

    @Column(unique = true)
    private String username; // 아이디

    private String password; // 암호화된 비밀번호

    @Enumerated(EnumType.STRING)
    private Role role; // 권한 정보

    @Builder
    public Member(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}