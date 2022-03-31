# Chapter05. 배열

## 1. 배열(array)

### 1) 배열이란?
- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
- 많은 양의 데이터를 손쉽게 다룰 수 있다
- 각 저장공간이 연속적으로 배치되어 있다

### 2) 배열의 선언과 생성
- 배열을 선언하는 것은 생성된 배열을 다루기 위한 참조변수의 공간을 생성하는 것
- 배열을 생성해야 값을 저장할 수 있는 공간이 생성된다

### 3) 배열의 길이와 인덱스
- 각 저장공간을 `배열의 요소`라고 하며 `인덱스`는 배열의 요소의 일련번호를 의미한다
- 인덱스로 변수나 수식도 가능, 수식을 먼저 계산한 후 요소를 참조
- 배열의 범위를 벗어난 실수는 컴파일러가 잡아주지 못한다
  - 변수의 값은 `실행`시에 대입되기 때문에 컴파일러는 이 값의 범위를 확인할 수 없다
  - 무사히 컴파일이 종료되더라도 실행 시 `ArrayIndexOutOfBoundsException` 발생
- 배열의 길이는 Int 최대값인 20억까지 가능
- 배열의 길이가 0인 배열도 생성 가능
  - 프로그래밍 하다보면 길이가 0인 배열이 필요한 순간이 존재
- 자바에서는 `JVM`이 배열의 길이를 별도로 관리, 따라서 상수로 존재하기에 배열의 길이를 변경할 수 없다
- 배열의 길이를 변경하기 위해서는 더 큰 배열을 생성한 뒤 복사해야한다

### 4) 배열의 초기화
```java
int[] score = new int[5];
int[] score = new int {1, 2, 3, 4, 5};
int[] score = {1, 2, 3, 4, 5};

// 배열의 길이가 0
int[] score = new int[0];
int[] score = new int[] {};
int[] score = {};
```
- 배열의 참조변수를 출력하면 `타입@주소` 형식으로 출력

### 5) 배열의 복사
- 배열의 복사는 `for`문보다 `System.arraycopy()`를 사용
  - 배열은 저장공간이 연속적으로 생성되어 있기에 이 점을 활용해서 한번에 복사가 가능하기에 효율적인 복사가 가능하다
```java
System.arraycopy(num, 0, newNum, 0, num.length);
// num 배열의 0번째부터 num.length 개수 만큼 newNum 0번째 부터 복사
// 복사되는 곳의 배열의 크기가 부족한 경우 ArrayIndexOutOfBoundsException 발생
```

### 6) 배열의 활용
- 총합과 평균
- 최대값과 최소값
- 섞기(shuffle)
- 임의의 값으로 배열 채우기
- 정렬하기(sort)
- 빈도수 구하기

## 2. String배열

### 1) String배열의 선언과 생성
- 변수에 따른 기본값
  - `boolean`: false
  - `char`: '\u0000'
  - `byte`, `short`, `int`: 0
  - `long`: 0L
  - `float`: 0.0f
  - `double`: 0.0d

### 2) String배열의 초기화
- 기본형 배열이 아닌 경우 객체의 주소가 저장

### 3) char배열과 String클래스
- 자바에서 char배열이 아닌 String클래스를 사용해서 처리하는 이유는 String클래스가 char배열의 기능을 확장한 것이기 때문
- String 객체는 읽기만 가능, 변경할 수 없다
```java
String str = "Java";
str = str + "8";
// 값이 변경된 것이 아닌 새로운 값이 생성된 후 저장된 것
```
- char배열과 String클래스의 변환
```java
char[] charArray = {'h', 'e', 'l', 'l', 'o'};
String str = new String(charArray);
char[] tmp = str.toCharArray();
```

### 4) 커맨드 라인을 통해 입력받기
```java
java Main hello hi

args[0] == 'hello'
args[1] == 'hi'
// 입력되지 않은 경우 길이가 0인 배열이 생성
```

## 3. 다차원 배열

### 1) 2차원 배열의 선언과 인덱스
```java
int[][] score;
int score[][];
int[] score[];
```

### 2) 2차원 배열의 초기화
```java
int[][] score = new int[3][2];
score.length() == 2
```

### 3) 가변 배열
```java
int[][] score = new int[3][];
score[0] = new int[1];
score[1] = new int[2];
score[2] = new int[3];
```

### 4) 다차원 배열의 활용
- 좌표에 X표하기
- 빙고
- 행렬의 곱셈
- 단어 맞추기