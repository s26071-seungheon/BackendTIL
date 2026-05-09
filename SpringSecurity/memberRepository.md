# memberRepository
 - DB에 접근하여 데이터를 가져오는 통로
   - findByUserName : CustomUserDetailsService가 아이디 있는 지 물어보면서 DB에서 유저정보 찾음
   - JpaRepository 상속으로 기본적인 CRUD 기능을 자동으로 구현