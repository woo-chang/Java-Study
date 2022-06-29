# Chapter 15 입출력

## 1. 자바에서의 입출력

### 1. 입출력이란?

- 입출력은 컴퓨터 내부 또는 외부의 장치와 프로그램간의 데이터를 주고받는 것을 의미한다.

### 2. 스트림(stream)

- 스트림이란 데이터를 운반하는데 사용되는 연결통로이다.
- 스트림은 단방향통신만 가능하기 때문에 하나의 스트림으로 입력과 출력을 동시에 처리할 수 없다.

### 3. 바이트기반 스트림 - InputStream, OutputStream

- InputStream의 추상 메서드 `read`
- OutputStream의 추상 메서드 `write`

### 4. 보조 스트림

- 실제 데이터를 주고받는 스트림이 아니기 때문에 데이터를 입출력할 수 있는 기능은 없지만, 스트림의 기능을 향상시키거나 새로운 기능을 추가할 수 있다.

### 5. 문자기반 스트림 - Reader, Writer

- 문자데이터를 입출력할 때는 바이트기반 스트림 대신 문자기반 스트림을 사용
- InputStream → Reader
- OutputStream → Writer

<br>

## 2. 바이트기반 스트림

### 1. InputStream과 OutputStream

- 프로그램이 종료될 때, 사용하고 닫지 않은 스트림을 JVM이 자동적으로 닫아 주기는 하지만, 스트림을 사용해서 모든 작업을 마치고 난 후에 `close`를 호출해서 반드시 닫아주어야 한다.
- ByteArrayInputStream과 같이 메모리를 사용하는 스트림과 System.in, System.out과 같은 표준 입출력 스트림은 닫아 주지 않아도 된다.

### 2. ByteArrayInputStream과 ByteArrayOutputStream

- 바이터배열에 데이터를 입출력하는데 사용
- 주로 다른 곳에 입출력하기 전 데이터를 임시로 바이트배열에 담아서 변환 등의 작업을 하는데 사용

### 3. FileInputStream과 FileOutputStream

- 파일에 입출력을 하기 위한 스트림

<br>

## 3. 바이트기반의 보조 스트림

### 1. FilterInputStream과 FilterOutputStream

- 모든 보조스트림의 조상

### 2. BufferedInputStream과 BufferedOutputStream

- 스트림의 입출력 효율을 높이기 위해 버퍼를 사용하는 보조 스트림
- 버퍼를 이용해서 한 번에 여러 바이트를 입출력하는 것이 빠르기 때문에 대부분의 입출력 작업에 사용
- `close`를 호출해 주어야 버퍼에 남아있던 모든 내용이 출력된다.

### 3. DataInputStream과 DataOutputStream

- 데이터를 읽고 쓰는데 있어 `byte`단위가 아닌 8가지 기본 자료형의 단위로 읽고 쓸 수 있다는 장점
- 데이터를 변경할 필요도 없고, 자리수를 세어서 따지지 않아도 되므로 편리하고 빠르게 데이터를 저장하고 읽을 수 있다.

### 4. SequenceInputStream

- 여러 개의 입력스트림을 연속적으로 연결해서 하나의 스트림으로부터 데이터를 읽는 것과 같이 처리
- 큰 파일을 여러 개의 작은 파일로 나누었다가 하나의 파일로 합치는 것과 같은 작업을 수행할 때 사용

### 5. PrintStream

- 데이터를 기반스트림에 다양한 형태로 출력할 수 있는 print, println, printf와 같은 메서드를 오버로딩하여 제공

<br>

## 4. 문자기반 스트림

### 1. Reader와 Writer

- `byte`배열 대신 `char`배열 사용
- 문자 데이터를 다루는데 인코딩이 필요한데 여러 종류의 인코딩과 자바에서 사용하는 유니코드간의 변환을 자동적으로 처리

### 2. FileReader와 FileWriter

- 파일로부터 텍스트데이터를 읽고, 파일에 쓰는데 사용

### 3. PipedReader와 PipedWriter

- 쓰레드간 데이터를 주고받을 때 사용
- 다른 스트림과는 달리 입력과 출력스트림을 하나의 스트림으로 연결해서 데이터를 주고받는 특징
- 입출력을 마친 후 어느 한쪽 스트림만 닫아도 나머지 스트림은 자동으로 닫힌다.

### 4. StringReader와 StringWriter

- 입출력 대상이 메모리인 스트림

<br>

## 5. 문자기반의 보조스트림

### 1. BufferedReader와 BufferedWriter

- 버퍼를 이용해서 입출력의 효율을 높일 수 있도록 해주는 역할

### 2. InputStreamReader와 OutputStreamWriter

- 바이트기반 스트림을 문자기반 스트림으로 연결시켜주는 역할
- 바이트기반 스트림의 데이터를 지정된 인코딩의 문자데이터로 변환하는 작업을 수행

<br>

## 6. 표준입출력과 File

### 1. 표준입출력 - System.in, System.out, System.err

- 표준입출력은 콘솔을 통한 데이터 입력과 콘솔로의 데이터 출력을 의미한다.

### 2. File

- 파일은 기본적이면서도 가장 많이 사용되는 입출력 대상

```java
// 1. 이미 존재하는 파일을 참조할 때
File f = new File("c:\\jdk1.8\\work\\ch15", "FileEx1.java");

// 2. 기존에 없는 파일을 새로 생성할 때
File f = new File("c:\\jdk1.8\\work\\ch15", "FileEx1.java");
f.createNewFile();
```

<br>

## 7. 직렬화(Serialization)

### 1. 직렬화란?

- 객체를 데이터 스트림으로 만드는 것을 의미
- 스트림으로부터 데이터를 읽어서 객체를 만드는 것을 역직렬화

### 2. ObjectInputStream과 ObjectOutputStream

- 직렬화에는 ObjectOutputStream을 사용
- 역직렬화에는 ObjectInputStream을 사용

### 3. 직렬화가 가능한 클래스 만들기 - Serializable, transient

- `Serializable`인터페이스를 구현하도록 만들기
- `transient`를 붙이면 직렬화 대상에서 제외