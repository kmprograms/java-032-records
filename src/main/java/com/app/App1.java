package com.app;

public class App1 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------- 1 -------------------------------------");
        var person = new Person("ADAM", 20);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println("-------------------------------------- 2 -------------------------------------");
        var player = new Player("JOHN", 20);
        System.out.println(player.getName());
        System.out.println(player.getGoals());

        System.out.println("-------------------------------------- 3 -------------------------------------");
        var car = new Car("BMW", 250);
        System.out.println(car);
        System.out.println(car.model());
        System.out.println(car.speed());

        System.out.println("-------------------------------------- 4 -------------------------------------");
        // var message = new Message(null, null);
        // var message = new Message("T", null);
        var message = new Message("TTITLE", "TEXT");
        System.out.println(message);

        var message2 = new Message("TITLE 2");
        System.out.println(message2);
        System.out.println(message2.isTitleLongerThanText());

        var message3 = Message.empty();
        System.out.println(message3);
        System.out.println(Message.EXTRA_MESSAGE_TITLE);
    }
}
