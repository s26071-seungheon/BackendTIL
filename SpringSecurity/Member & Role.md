# Member
 - 데이터베이스의 테이블과 1:1로 매핑되는 실제 신분증 같은 거
 - SecurityConfig에서 등록한 해시로 암호화된 값을 담음

# Role
 - Enum 사용하여 USER, ADMIN 등 정해진 권한 외에 잘못된 값이 들어오는 것을 방지
   - Enum : 클래스처럼 보이게 하는 상수