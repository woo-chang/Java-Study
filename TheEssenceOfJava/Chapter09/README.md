# Chapter 09 java.lang 패키지와 유용한 클래스

## 1. java.lang패키지
- 자바 프로그램에서 가장 기본이 되는 패키지
- `import`문 없이 사용 가능

### 1) Object 클래스
- 멤버변수는 없고 11개의 메서드만 존재
- `equals(Object obj)`
  - 서로 다른 두 객체가 같은 주소를 가지는 것은 불가능, 서로 다른 참조변수가 같은 주소값을 가지는 것은 가능
- `hashCode()`
  - 해싱은 데이터관리기법 중 하나로 다량의 데이터 저장하고 검색하는데 유용
  - 객체의 주소값으로 해시코드를 만들어 반환
  - 32 bit JVM에서는 4byte 해시값이 중복될 수 없지만 64 bit JVM에서는 8byte이기에 중복이 발생
- `toString()`
  - 인스턴스 정보를 문자열로 제공하기 위해 만들어진 메서드
- `clone()`
  - 자신을 복제하여 새로운 인스턴스를 생성하는 메서드
  - 단순히 값만 복제하기 때문에 깊은 복사가 이루어지지 않는다
  - `Clonable` 인터페이스를 구현해야하며 예외처리가 필요하다
    - 인스턴스 데이터를 보호하기 위함
    - 인터페이스를 구현함으로 복제를 허용한다는 의미
- `공변 반환타입`
  - JDK 1.5부터 추가된 기능
  - 메서드 반환값을 자식 클래스 타입으로 변경 가능
- `얕은 복사와 깊은 복사`
  - 얕은 복사 : 원본을 변경하면 복사본도 영향
  - 깊은 복사 : 원본의 변경이 복사본에 영향을 미치지 않는다
- `getClass()`
  - 자신이 속한 클래스의 Class객체를 반환하는 메서드
  - Class객체는 이름이 Class인 클래스
  - Class객체는 Class의 모든 정보를 담고 있으며 Class당 1개 생성
  - 클래스 로더에 의해 메모리에 올라갈 때 자동으로 생성
    - 기존에 생성된 클래스 객체가 메모리에 존재하는지 확인
    - 있으면 객체의 참조를 반환, 없으면 클래스 패스의 경로의 클래스 파일 찾기
    - 못찾으면 `ClassNotFoundException`, 있으면 클래스 파일 읽어서 Class객체로
```java
Class cObj1 = new Card().getClass();
Class cObj2 = Card.class;
Class cObj3 = Class.forName("Card");
```

### 2) String 클래스
**변경 불가능한 클래스**
- 문자열 배열 참조변수를 인스턴스 변수로 정의
- 문자열 결합이나 추출이 많이 일어나면 변경 가능한 `StringBuffer` 클래스 이용

**문자열의 비교**
- 자바 소스파일에 포함된 모든 문자열 리터럴은 컴파일 시 클래스 파일에 저장
- 같은 내용의 문자열 리터럴은 한번만 저장
- 해당 클래스 파일이 클래스 로더에 의해 메모리에 올라갈 때 리터럴들이 JVM내의 `상수 저장소(constant pool)`에 저장

**빈 문자열(empty string)**
- 길이가 0인 배열 존재 가능
- String은 참조 타입의 기본값이 null보다는 빈 문자열로 초기화
- char은 기본값인 `\u0000` 보다는 공백으로 초기화

**join()과 StringJoiner Class**
```java
StringJoiner sj = new StringJoiner(",", "[", "]");
for(String s : arr) {
	sj.add(s);
}
System.out.println(sj.toString());
```

**getBytes()**
- 문자열의 문자 인코딩을 다른 인코딩으로 변환 가능

**String.format()**
- 형식화된 문자열을 만드는 방법
- `printf`와 방법은 동일

**기본형 값을 String으로 변환**
- `String.valueOf()`
- 빈 문자열을 더하는 것보다 성능 우수

### 3) StringBuffer클래스와 StringBuilder클래스
**StringBuffer의 비교**
- `equals`가 오버라이딩 되어 있지 않기에 `==`와 동일한 결과

**StringBuilder란?**
- `StringBuffer`는 멀티쓰레드에 안전하도록 동기화
  - 동기화는 StringBuffer의 성능을 떨어뜨린다
- 동기화를 제외한 `StringBuilder`

### 4) Math클래스
- round
- ceil
- floor
- sqrt
- pow

### 5) 래퍼(wrapper) 클래스
- 기본형 자료형을 객체로 변환하여 작업을 진행할 때 사용하는 클래스

**Number클래스**
- 기본형 숫자와 관련된 래퍼 클래스는 Number클래스의 자손
- BigInteger, BigDecimal 클래스 포함

**문자열을 숫자로 변환하기**
```java
int i1 = new Integer("100").intValue();
int i2 = Integer.parseInt("100"); // 반환형이 기본형
Integer i3 = Integer.valueOf("100"); // 반환형이 래퍼
```

<br>

## 2. 유용한 클래스

### 1) java.util.Objects클래스
- Object 클래스의 보조 클래스
- `isNull()`
- `nonNull()`
- `requireNonNull()`
  - 인자로 전달받은 객체가 null이면 전달받은 String 메시지를 담은 `NullPointerException` 발생
- `equals()`
  - Object의 equals와 다르게 Null 체크를 할 필요가 없다
  - 내부에서 확인

### 2) java.util.Random클래스
```java
Math.random();

new Random().nextInt();
```
- `seed`값을 지정할 수 있는데 `seed`값이 동일한 경우 동일한 값을 반환

### 3) 정규식(Regular Expression) - java.util.regex패키지
- 정규식을 이용하면 많은 양의 텍스트 파일 중에서 원하는 데이터를 손쉽게 뽑아낼 수 있다
```java
Pattern p = Pattern.compile(정규식);

Matcher m = p.matcher(데이터);

m.matches()
```

### 4) java.util.Scanner클래스
- `Scanner useDelimiter` : 입력받은 값을 구분자로 나눠서 사용 가능

### 5) java.util.StringTokenizer클래스
- 토큰으로 자른 결과를 배열에 담아서 반환하는 split과 비교했을 때 데이터가 많으면 성능 차이 발생

### 6) java.math.BigInteger클래스
- long보다 큰 값을 다룰 때 처리
- BigInteger는 불변

### 7) java.math.BigDecimal클래스
- BigDecimal은 불변
- 연산을 할 수 있는 별도의 메서드가 존재