//Задание 2
package numbersAndClasses;

public class Task2 {
    public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person("Василий", 24);
    System.out.println(person2.talk());
    System.out.println(person1.move());
    }
}

class Person {
    String fullName;
    int age;
    String talk() {
        return fullName + " говорит.";
    }
    String move() {
        return fullName + " говорит.";
}

    public Person(){
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
}

