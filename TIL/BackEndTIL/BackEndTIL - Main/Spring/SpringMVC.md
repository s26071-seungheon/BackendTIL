# Spring MVC
 ### Spring Framework 안에 있는 웹 개발 구조
 ## MVC
  ### 웹을 만들 때 역할을 3개로 나누는 방식
  ###  Model, View, Controller

# Model(데이터 담당)
 ### 데이터 처리(DB조회, 저장 등)
 ### ex) 게시글 목록, 사용자 정보
 ### 스프링에서는 Service, Repository, DTO가 여기 해당

# View(화면 담당)
 ### 사용자에게 보여지는 UI(User Interface)
 ### ex) HTML, Thymeleaf

# Controller(중간 연결)
 ### Model과 View 사이를 연결해주는 역할

# 패턴
 ### 1. 사용자 요청 발생
 ### 2. DispatcherServlet이 요청 받음
 - DispatcherServlet : 모든 요청을 제일 먼저 받는 중앙 관리자
 ### 3. Controller 찾기 후 실행
 ### 4. Model에서 데이터 가져오기
 ### 5. View에 데이터 전달
 ### 6. 화면 출력