# 해야 할 일 관리(TODO) 프로그램 클론 코딩


과제 내용 : 해야 할 일을 생성, 상태 변경, 삭제하는 서비스를 구현하고 h2database 를 이용해 관리, Unittest, 디버깅


<li> PART1 </li> - 새로운 할 일을 DB 에 추가하는 API 기능 구현

- 필요한 gradle.build 설정과 프로젝트에 필요한 DB의 스키마 생성
- 테스트에 필요한 예시내용을 위해 data.sql 리소스 파일 생성 후 예시 내용 삽입
- 할 일을 추가하는 API 기능 구현 후 DB 에 잘 삽입 되었는지 PostMan 프로그램으로 요청 및 응답 테스트
- Git 의 add, commit, push 실습

<li> PART2 </li> - 할 일을 조회하는 API 기능 구현

- Git 의 branch 기능과 Issue, PR, Merge 에 대해 학습 및 실습 후 Merge 한 코드를 Pull 하는 방법 실습
- 할 일을 조회하는 API 기능 구현 후 요청 및 응답 테스트
- 예외 발생 시 logging 할 수 있는 메서드 추가

<li> PART3 </li> - 할 일의 내용 수정 기능과 리스트에서 할 일을 삭제하는 API 구현

- 할 일의 내용 수정 및 리스트에서 삭제하는 API 기능 구현 후 boolean 값을 리턴하는 메서드를 생성해 테스트
- 할 일의 내용을 수정 중 내용 수정값이 null 일 때 이전 데이터를 그대로 가져오는 기능 구현

<li> PART4 </li> - 테스트 코드 작성하기

- TaskService 의 add 메서드를 단위코드로 지정해 Junit5 프레임워크로 테스트코드 생성 및 작동방식에 대해 학습
- 정상적인 작동과 오류가 나는 경우를 상황별로 테스트

<li> PART5 </li> - 디버깅 실습

- 브레이킹포인트를 지정하여 디버그모드로 빌드 후 작동 방식에 대해 학습
- step into, step out, step over, resume 등을 사용했을 경우 상황별로 이루어지는 결과 테스트 

#### Language : JAVA

#### IDE : IntelliJ

#### Framework : SpringBoot, Junit5

#### DBTest : PostMan, h2database
