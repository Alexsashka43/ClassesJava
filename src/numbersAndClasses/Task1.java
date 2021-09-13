// Задание 1
package numbersAndClasses;
public class Task1 {
    public static void main(String[] args) {
        //Задание а, б, в
        Phone phone1 = new Phone();
        phone1.number = 1;
        phone1.model = "Iphone";
        phone1.weight = 220;
        phone1.printInfoToConsole();
        Phone phone2 = new Phone();
        phone2.number = 2;
        phone2.model = "Samsung";
        phone2.weight = 167;
        phone2.printInfoToConsole();
        Phone phone3 = new Phone();
        phone3.number = 3;
        phone3.model = "Xiaomi Mi";
        phone3.weight = 216;
        phone3.printInfoToConsole();
        //Задание г
        phone1.receiveCall("Sam");
        phone1.getNumber("8(123)4567890");
        //Задание и
        phone2.receiveCall("Jack", "8(312)3247670");
        //Задание д, е, ж
        Phone phone4 = new Phone(4, "Sony", 145); //3 параметра
        Phone phone5 = new Phone(5, "Philips"); //2 параметра
        //Задание к
        phone2.sendMessage("3456787654", "87656789876", "876567890876", "765678987");


    }
}

class Phone {
    int number;
    String model;
    int weight;

    public Phone() { //пустой конструктор
    }

    public Phone(int number, String model, int weight) {
        this(6, "Nokia");//вызов одного конструктора (2 парам) из другого (3 парам)
        this.weight = weight;
        System.out.println("Номер телефона: " + number + "; Модель: " + model + "; Вес: " + weight);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        System.out.println("Номер телефона: " + number + "; Модель: " + model + "; Вес: " + weight);
    }

    void printInfoToConsole() {
        System.out.println("Номер телефона: " + number + "; Модель: " + model + "; Вес: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void getNumber(String phoneNumber) {
        System.out.println(phoneNumber);
    }

    void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + "; Номер телефона: " + phoneNumber);
    }


    void sendMessage(String... number){//номера телефонов большие для типа int
        for (int i = 0; i < number.length; i++) {
            System.out.println("Сообщение на номер: " + number[i]);
        }
    }
}















