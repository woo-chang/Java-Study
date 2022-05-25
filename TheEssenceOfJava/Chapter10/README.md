# Chapter 10 날짜와 시간 & 형식화

## 1. 날짜와 시간

### 1. Calendar와 Date

- Calendar는 추상 클래스이므로 인스턴스를 생성할 수 없고 따라서 내부 메서드를 이용해서 인스턴스 생성

```java
Calendar cl = Calendar.getInstance();
```

- `get()`을 통해 날짜 정보를 가져올 수 있고 `set()`을 통해 원하는 날짜로 지정할 수 있다.
- MONTH는 0~11 범위를 가지므로 주의해서 사용이 필요하다.
- `add()`를 통해 날짜 연산이 가능하다.
- 다음 달에서 하루를 빼면 이번 달의 마지막 일을 구할 수 있다.

<br>

## 2. 형식화 클래스

### 1. DecimalFormat

숫자 → 정수, 부동소수점, 금액 등 표현  
텍스트 → 숫자로 쉽게 변환

### 2. SimpleDateFormat

Date 인스턴스만 포맷에 사용 가능  
Date → Calendar 변환이 중요하다

### 3. ChoiceFormat

특정 범위에 속하는 값을 문자열로 변환

### 4. MessageFormat

`msg`에 `argument`를 넣는 방식  
parse : 데이터 추출  
format : 데이터 적용

<br>

## 3. java.time패키지

### 1. java.time패키지의 핵심 클래스

날짜간의 간격 `Period`  
시간간의 간격 `Duration`  
객체 생성하는 메서드 `now()`, `of()`

### 2. LocalDate와 LocalTime

데이터 무결성을 위해 불변 객체로 값이 새로 생긴다.

### 3. Instant

에포크 타임(1970-01-01 00:00:00 UTC)부터 경과된 시간을 나노초 단위로 표현

### 4. LocalDateTime과 ZonedDateTime

LocalTime + LocalDate → LocalDateTime  
LocalDateTime + 시간대 → ZonedDateTime

### 5. TemporalAdjusters

자주 쓰일만한 날짜 계산들을 대신 해주는 메서드를 정의해놓은 것

### 6. Period와 Duration

날짜 - 날짜 = Period  
시간 - 시간 = Duration

### 7. 파싱과 포맷

`DateTimeFormatter`가 핵심