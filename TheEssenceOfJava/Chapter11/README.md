# Chapter 11 컬렉션 프레임웍

## 1. 컬렉션 프레임웍(Collections Framework)

| 데이터를 저장하는 클래스들을 표준화한 설계

### 1. 컬렉션 프레임웍의 핵심 인터페이스

모든 컬렉션 클래스들은 `List`, `Set`, `Map` 중 하나를 구현하고 있다.

**List인터페이스**

중복을 허용하면서 저장 순서를 유지하는 데이터 컬렉션

**Set인터페이스**

중복을 허용하지 않고 저장 순서를 유지하지 않는 데이터 컬렉션

**Map인터페이스**

키와 값을 하나의 쌍으로 묶어서 저장하는 데이터 컬렉션  
키는 중복될 수 없지만 값은 중복을 허용한다.

### 2. ArrayList

배열에 더 이상 저장할 공간이 없으면 큰 새로운 배열을 생성해 기존의 배열을 새로운 배열에 복사한다.  
생성할 때 용량을 지정해서 생성할 수 있다.
- 용량이 변화할 때는 새로운 크기의 배열을 생성해서 값을 복사해서 옮기는 것
- 이는 효율과 관련되는 문제이기에 처음에 용량 설계를 잘하는 것이 중요하다.

### 3. LinkedList

가변적인 크기와 비순차적인 데이터의 삽입과 삭제를 위해 등장한 데이터 컬렉션  
순차적으로 추가와 삭제가 일어나는 경우 ArrayList가 빠르다.  
중간 데이터를 추가/삭제하는 경우 LinkedList가 빠르다.

### 4. Stack과 Queue

스택의 예는 웹 브라우저의 뒤로가기/앞으로가기 기능이 대표적이다.

**PriorityQueue**

우선순위가 존재하는 Queue  
null을 넣게 되면 NullPointerException이 발생  
heap이라는 자료구조를 통해 데이터 저장

### 5. Iterator, ListIterator, Enumeration

Enumeration은 Iterator의 구버전 → 사용되는 부분이 존재하기에 남아있다.  
ListIterator는 Iterator에 이전방향으로 갈 수 있는 기능 추가  
Iterator는 재사용이 안되므로 다시 사용할 때는 다시 얻어와야 한다.

### 6. Arrays

- `copyOf`
- `copyOfRange`
- `fill`
- `setAll` : 배열을 채울 함수형 인터페이스를 구현한 객체르 지정하거나 람다식 지정
- `sort`
- `binarySearch` : 정렬된 상태여만 수행 가능
- `equals`
- `deepEquals` : 다차원 배열의 비교
- `toString`
- `deepToString` : 다차원 배열의 출력
- `asList`
  - 크기가 변경 불가능하기에 추가나 삭제가 불가능하다
  - 내용의 변경은 가능하다


### 7. Comparator와 Comparable

`sort` 시 해당 구현 메서드에 의해 동작

### 8. HashSet

이미 저장되어 있는 요소라면 `false`를 반환  
중복 제거 후 순서를 유지하고자 한다면 `LinkedHashSet`을 사용
1. 동일한 객체에 대해 여러번 `hashCode()` 를 호출해도 동일한 값 리턴
2. equals메서드의 결과가 true인 두 객체의 해시코드 값은 동일
3. equals메서드 결과가 false인 두 객체의 해시코드 값이 같을 수 있지만 해시 성능을 위해 다르게 하는 것이 좋다

### 9. TreeSet

이진 검색 트리 자료구조로 데이터를 저장하는 컬렉션  
이진 검색 트리의 성능을 향상시킨 `레드-블랙트리`로 구현  
링크드 리스트에 비해 데이터 추가/삭제 시간은 더 걸리지만 검색과 정렬 기능이 뛰어나다.

### 10. HashMap과 Hashtable

Hashtable의 새로운 버전인 `HashMap`  
`Entry`라는 내부 클래스를 정의하고 Entry타입의 배열을 선언
- `entrySet`
- `keySet`
- `values`
- `containsKey`

### 11. TreeMap

HashMap 성능이 TreeMap 보다 좋기에 HashMap 사용 권장

### 12. Properties

주로 애플리케이션 환경설정 관련 속성을 저장하는데 사용  
시스템 속성을 가져오는데 사용되는 `System.getProperties()`

### 13. Collections

멀티 쓰레드 환경에서의 동기화를 지원하기 위한 메서드 존재  
데이터를 보호하기 위한 변경불가 컬렉션 만들기 메서드 존재  
싱글톤 컬렉션을 위한 생성 메서드 존재