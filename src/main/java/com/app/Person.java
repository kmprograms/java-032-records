package com.app;

/*
    Potrzeba przesyłania IMMUTABLE DATA pomiędzy aplikacjami ( np. informacje które
    zwracamy z service, wyniki przetwarzania danych z bazy danych itd. )
    IMMUTABILITY gwarantuje poprawność i spójność danych bez konieczności
    synchronizacji.

    -> Thread safety.
    -> Atomicity of failure.
    -> Absence of hidden side-effects.
    -> Protection against null reference errors.
    -> Ease of caching.
    -> Prevention of identity mutation.
    -> Avoidance of temporal coupling between methods.
    -> Support for referential transparency.

    Dlatego często stosujemy klasy, które posiadają następujące składniki:
    a. private final fields
    b. getters
    c. konstruktor publiczny do inicjalizacji każdego z pól
    d. equals + hashCode
    e. toString

    W podejściu jak poniżej mamy kilka wad:
    a. dużo niepotrzebnego powatarzającego się kodu
    b. nawet jeżeli użyjesz autogeneratorów IDE to i tak aktualizacja klasy np. dodanie nowych pól powoduje potrzebę
       ponownego generowania kodu

    Dlatego od Java 14 wprowadzono REKORDY.
*/

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person (Name: " + name + ", Age: " + age + " )";
    }
}
