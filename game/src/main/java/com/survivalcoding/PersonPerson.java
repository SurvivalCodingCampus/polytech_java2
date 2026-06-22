package com.survivalcoding;

//컬렉션

//2장 연습문제 1
//1),3)은 set으로
//2)은 list로


import java.util.ArrayList;
import java.util.List;

//2장 연습문제 2
public class PersonPerson {
    private String Name;
    private int Age;

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public PersonPerson(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

}

//test 파일을 따로 만들지 않고 여기서 바로 작성한 것
class main {
    static void main() {
        List<PersonPerson> name = new ArrayList<>();
        name.add(new PersonPerson("홍길동", 20));
        name.add(new PersonPerson("한석봉", 25));
    }


}

