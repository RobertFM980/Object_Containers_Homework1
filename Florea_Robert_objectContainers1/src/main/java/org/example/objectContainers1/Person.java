package org.example.objectContainers1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

abstract class Person {
    protected String name;
    protected  int age;
    public List<Hobby> hobbies= new ArrayList<>();


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(hobbies, person.hobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hobbies);
    }
}

class SortByname implements Comparator<Person>{

    public int compare(Person p1,Person p2){
        return p1.name.compareTo(p2.name);
    }

}
class SortByAge implements Comparator<Person>{

    public int compare(Person p1,Person p2){
        return p1.age- p2.age;
    }
}


