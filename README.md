# java_study_Day02
****************************************************************************
### 메소드와 필드
메소드의 사용 목적
메소드의 정의
메소드 활용
재귀 호출(recursive call)
필드의 특징과 활용

### this와 this()
this 참조 변수
this()메소드 - 다른 생성자 호출

### 메소드 오버로딩
베소드 오버로딩 정의
메소드 오버로딩의 조건
메소드 오버로딩 연습

### 조건문과 switch문
스위치문 기본
계산기 만들기
-----------------------------------------------------------------------------------------------------------------------------
[연습문제 1] 시험 성적을 입력 받아 90~100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력 [선택사항] 성적이 잘못 입력된 경우 다시 입력 받도록 수정
-----------------------------------------------------------------------------------------------------------------------------
[연습문제 2] 세자리의 정수를 입력 받아 가장 큰 수 출력
-----------------------------------------------------------------------------------------------------------------------------
[연습문제 3] 행사 안내 메일 발송하기
************************************************************************
1. 사용자로부터 이름, 제목, 날짜(20230817), 시간(17) 정보를 입력 받습니다.
2. 입력된 날짜의 월을 추출하여 해당하는 계절을 판단합니다.
3. 계절에 따라 적절한 인사말과 입력된 일정 정보를 출력합니다.
************************************************************************
프로그램은 다음과 같은 방식으로 동작해야 합니다.
- 1월부터 12월까지의 월 정보를 입력 받습니다.
- 입력된 월에 따라 다음과 같은 계절에 맞는 인사말을 출력합니다.
    - 12월, 1월, 2월 → "한파의 연속인 1월 입니다."
    - 3월 → "봄의 기운이 느껴지는 3월 입니다."
    - 4월 → "새싹이 피어나는 4월 입니다."
    - 5월 → "계절의 여왕 5월 입니다."
    - 6월 → "활동하기 좋은 6월 입니다."
    - 7월 → "휴가가 기다려지는 7월 입니다."
    - 8월 → "무더운 8월 입니다."
    - 9월 → "선선한 9월 입니다."
    - 10월 → "천고마비의 계절 10월 입니다."
    - 11월 → "쓸쓸한 늦가을 11월 입니다."
- 입력된 이름, 제목, 날짜, 시간 정보와 계절 정보를 이용하여 다음과 같은 형식으로 일정 정보를 출력합니다.
  [출력형식]
[이름]님.
[계절에 맞는 인사말]
아래와 일정으로 [제목]를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.

===== 행사 안내 =====
행사 안내 : [제목]
일시 : [년]년 [월]월 [일]일
시간 : [시간]시
[힌트] 문자열의 substring을 이용하면 원하는 문자를 추출 할 수 있음.
date = “20230817”;
month = date.substring(4, 6);  // 인덱스는 0부터 시작, 그리고 두번째 인덱스는 미만 개념
-----------------------------------------------------------------------------------------------------------------------------
[연습문제 4] 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려고 마음 때문에 매일 학교를 지각하고 있다. 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
바로 "45분 일찍 알람 설정하기"이다.
[입력] 첫째 줄에 두 정수 H와 M이 주어진다.(0<= H <= 23, 0<= M <= 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다. 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음 날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
[출력] 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다.(입력과 같은 형태로 출력하면 된다.)
### 알고리즘 문제풀이

