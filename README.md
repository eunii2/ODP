<<<<<<< HEAD
# 🗒️파일 설명
## ./src
- spring boot로 구현한 파일들이 있는 폴더
- 이외의 폴더들은 spring boot initializr에서 기본적으로 제공되는 파일들
----
### ./src/main
- 주요 파일들이 있는 디렉토리
##### 1) ./java/com/login/member : 백엔드에서 주요한 파일들이 위치한 디렉토리
- **./controller** : 사용자의 HTTP 요청을 처리 반환하는 역할
- **./dto** : 데이터 전송을 위한 객체들을 정의하는 곳
- **./entity** : 데이터베이스의 테이블을 자바 클래스로 표현하는 곳, JPA에서 사용됨
- **./repository** : 데이터베이스와의 연결을 담당하는 인터페이스를 저장하는 곳
- **./service** : controller가 사용자의 요청을 받으면 실제 처리가 이루어지는 곳
- **./memberApplication.java** : Spring Boot 애플리케이션의 시작점, 이 파일이 실행되면서 애플리케이션을 시작함
  - 이 파일을 실행시켜야 **localhost**에서 페이지 작동가능
##### 2) ./resources : 프론트 파일들과 설정 파일들이 위치한 디렉토리
- **./static** : css, javascript, 이미지와 같은 정적 자원들 저장
- **./templates** : html 또는 템플릿 파일들을 저장
- **./apllication.yml** : 데이터베이스 연결, 서버포트 정보등 중요한 환경설정을 정의한 파일

### /src/test
- 테스트 코드를 위한 공간으로 사실상 사용하지 않았음

### ❗apllicaion.yml 파일
- port번호는 **8080**로 설정해 놓았음(수정해서 다른번호도 사용가능 ex : 8081)
- 주석대로 로컬환경의 DB 이름과 계정정보를 수정해서 사용하면 됨
----
## 📌실행법
1. 깃허브에 올라온 파일들을 한 폴더에 저장한다.
2. intellij에서 저장한 폴더를 지정하여 프로젝트를 연다.
3. 설치되는 것들이 많으므로 잠시 기다린다.
4. apllicaion.yml을 로컬 데이터베이스 환경에 맞게 수정한다.
   - 깃허브에 올린 것과 별개로 mysql을 설치해야함
5. ./src/main/java/com/login/member/MemberApplication 파일을 실행시킨다.
6. 애플리케이션 로그에서 오류없이 작동한다면 <http://127.0.0.1:8080/>(또는 <localhost:8080>)을 인터넷 주소창에 입력한다.
7. 접속했을 때, index.html이 문제없이 보인다면 정상적으로 실행된 것이다.


##### 생길 수 있는 문제점
- 데이터베이스를 설치하지 않았을 때
- 데이터베이스의 스키마 또는 회원 정보가 맞지 않았을 때
- JRD, JDK가 설치되어있지 않았을 때
=======
# ODP
Opensource Development project
>>>>>>> 0d52fe6e6949b3d107f8854227f013010f1c75f9
