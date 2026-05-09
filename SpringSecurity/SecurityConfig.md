# SecurityConfig
- 어느정도까지 들어갈 수 있는 지 확인해주는 코드
- 비밀번호 해시 암호화
  - 해시 : 임의의 길이의 데이터를 고정된 길이의 데이터(문자열)로 변환

        - 주요 명령어
        .requestMatchers // 누가 어떤 주소에 들어올 수 있는지 규칙 정함
        .permitAll() //아무나 들어갈 수 있음
        .hasRole("권한") // "권한"이상이 있어야 들어갈 수 있음 (인가 역할)
        .anyRequest().authenticated() // 설정하고 남은 남은 요청들 일단 인증을 받아야 들어갈 수 있음 (인증 역할)

## 사용된 어노테이션들
- @Configuration : 스프링의 설정 정보담고 있음
- @EnableWebSecurity : 얘는 모든 요청 다 차단하고 누군지 확인하는 검문소 역할
- @RequiredArgsConstructor : 생성자 자동 생성
- @Bean : 객체를 스프링이 관리