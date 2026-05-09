package com.example.BackEndAssignment.repository;


import com.example.BackEndAssignment.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// JpaRepository<엔티티타입, ID타입>을 상속받습니다.
public interface MemberRepository extends JpaRepository<Member, Long> {

    // 로그인할 때 아이디로 회원을 찾아야 하므로 이 메서드가 꼭 필요합니다.
    // JPA가 메서드 이름을 보고 "select * from members where username = ?" 쿼리를 알아서 만듭니다.
    Optional<Member> findByUsername(String username);
}