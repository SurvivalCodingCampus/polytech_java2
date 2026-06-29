# 2026-06-29 제네릭, 열거형

## 알면 좋은것

### class Object

- 모든 클래스는 Object를 상속 받는것으로 취급함
- Is-A 원칙으로 인해 `Object data` 라고 함은 모든 객체를 저장한다
- 실제 컴파일러가 해당 클래스를 인식 할 수 없기 때문에 자주 쓰지 않음.

## 제네릭 (Generic)

### 사용 방법

- `Pocket<E>` 로 클래스를 만들면 `Pocket<String> pocket1 = new Pocket<>();` 로 선언함

### 사용하는 이유

- 타입을 나중에 원하는 형태로 정의 가능
- type safe 효과
    - 변수나 함수가 예상치 못한 데이터 타입으로 처리되어 발생하는 오류를 방지하는 특성
    - 런타임 에러 방지, 디버깅 시간 단축, 코드 유지보수성을 향상시킴
    - 캐스팅 없이 반환 가능
- `Pocket<E>` 로 클래스를 만들면 `private E (타입)` 라고 작성하여 (타입)에 맞는 값을 받을 수 있음
- `Pocket<E extends Character>` 로 선언하면 `E` 는 `Character`를 상속받는 타입이여야 함
- 휴먼 에러를 방지할 수 있음

## 열거형 (enum)

- 정해 둔 값만 넣어둘 수 있는 타입

### 사용하는 이유

- 3가지 이상의 상태를 상수로 정의 하여 사용하던 것을 대체하여 안전하게 사용
- 강제성을 부여하여 다른 값이 저장될 수 없도록 함
- 현재 Java, C#에서는 `if-else` 문을 강제하는 방법은 없음

---

## 과제 중 알게된 점

- `enum` 에서도 getter / setter를 통한 유효성 검사가 가능하다
- `enum` 에서 생성자를 통해 값을 대입해 둘 수 있다
    - 코드 예시
      ```
      KeyType{
        PADLOCK(1024),
        BUTTON(10000),
        DIAL(30000),
        FINGER(1000000);
    
        private final int maxDurability;
    
        KeyType(int maxDurability) {
            this.maxDurability = maxDurability;
        }
      }
      ```
- 