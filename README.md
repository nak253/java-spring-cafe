# 2022 Java Spring Cafe

2022년도 마스터즈 멤버스 백엔드 스프링 카페 프로젝트

## 스프링 카페 1단계 - 회원 가입 및 목록 기능

---

### 1. 회원 가입 기능 구현

#### API

| method |  url   |     기능      |
|:------:|:------:|:-----------:|
|  POST  | /users | 새로운 user 생성 |

<br>

#### 구현 사항
- [X] 가입하기 페이지를 templates로 이동
- [X] 회원가입하기 요청(POST) 메서드 추가 
- [X] 사용자가 전달한 값을 List에 저장
- [X] 사용자 추가 완료 후 ``/users``로 ``redirect``

<br>

### 2. 회원 목록 기능 구현

#### API

| method |  url   |     기능      |
|:------:|:------:|:-----------:|
|  GET   | /users | user 리스트 출력 |

<br>

#### 구현 사항
- [X] 목록 페이지를 templates로 이동(list.html)
- [X] 회원 목록 요청(GET) 메서드 추가
- [X] 사용자가 전달한 값을 List에 저장
- [X] Model을 메서드의 인자로 받은 후 여기에 사용자 목록을 `users`라는 이름으로 전달
- [X] user/list.html에서 사용자 목록을 출력한다.(using mustache)

<br>

### 3. 회원 프로필 정보 보기

#### API

| method |       url       |           기능           |
|:------:|:---------------:|:----------------------:|
|  GET   | /users/{userId} | userId를 통해 User 프로필 조회 |

<br>

#### 구현 사항
- [X] userId 기반 조회 기능 추가
- [X] html 중복 제거