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


## IntelliJ 단축키 (이건 그냥 유용할 것 같음)

코드 자동완성 - `cmd + space`

스마트 자동완성 - `cmd + shift + space`

오류 해결 제안 - `option + enter`

라인 복사 - `cmd + D`

라인 삭제 - `cmd + delete`

이름 일괄 변경 - `shift + F6(fn)`

import 최적화 - `ctrl + option + O`

라이브 템플릿 - `cmd + J` ( 사용자 정의 - Settings/Preferences > Editor > Live Templetes

주석 처리 - `cmd + /`

여러줄 - `cmd + alt + /`

자바독 - `/** 작성후 Enter`
- @author 클래스나 인터페이스의 작성자를 지정
- @version 클래스나 인터페이스의 버전 지정
- @param 메서드의 매개변수에 대한 설명
- @return 메서드의 반환 값에 대한 설명
- @throws/@exception 메서드가 발생 시킬 수 있는 예외
- @deprecated 더 이상 사용되지 않는 클래스나 메서드에 대한 경고

  
파일 검색 - `cmd + shift + O`

클래스 검색 - `cmd + O`

메서드 및 기호 검색 (심볼) - `cmd + alt + O`

전체 검색 / 범위 검색 - `cmd + shift + F`

현재 파일에서 검색 - `cmd + F`

현재 결과로 이동 - `cmd + G`

현재 파일에서 찾기 및 바꾸기 - `cmd + R`

전체에서 찾기 및 바꾸기 - `cmd + shift + R`

프로젝트 내에서 원하는 모든 것을 검색 - `shift 2번`

코드 탐색 
- 선언 위치로 이동 - `cmd + B`
- 구현 위치로 이동 - `cmd + alt + B`
- 클래스 계층 구조 (클래스 및 인터페이스 간의 상속 관계 표시) - `ctrl + H`
- 메서드 계층 구조 (메서드 오버라이딩 및 인터페이스 구현간의 관계 표시)

  
코드 생성 - `cmd + N`
- 자주 사용되는 코드 패턴이나 구조를 빠르게 작성할 수 있도록 도와주는 기능
- Getter / Setter 생성
- 생성자 생성
- 오버라이딩 메서드 생성
- 델리게이션 메서드 생성
- 테스트 코드 생성

코드 정리 - `cmd + alt + L`
- 코드를 자동으로 정리하고 포멧팅하여 가독성을 높이고 일관된 스타일 유지
- 현재 파일 코드 정리 / 선택 영역 코드 정리

프로젝트 전체 코드 정리
- Code > Reformat Code


코드 스타일 설정 
- IntelliJ IDEA > Prefences

실행 - `ctrl + R`

브레이크 포인트 확인 - `cmd + shift + F8(fn)`

디버깅 모드로 실행 (`Run > Debug`) - `ctrl + D`

단계별 실행 
- Step over 다음 라인으로 이동 - `F8(fn)`
- Step into 현재 라인의 메서드나 함수로 진입 - `F7(fn)`
- Step out 현재 메서드나 함수에서 빠져나와 호출자로 넘어감 - `shift + F8(fn)`

Resume program ( 프로그램 계속 실행 ) - `cmd + alt + R`

조건부 브레이크 포인트

- 특정 조건이 만족될 때만 실행을 중지 시키는 브레이크포인트 설정
- 브레이크 포인트 우클릭 > Edit Breakpoint > Condition 에 조건 작성

Call Stack 검사
- 현재 실행중인 메서드 콜 스택 확인
- 디버거 창의 Frames 탭

