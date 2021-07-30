package com.app;

/*
    Rekord pozwala reprezentować byty NIEMUTOWALNE i w najprostszej wersji jedyne
    co musisz podać to nazwy pól składowych z ich typami.
    Kompilator Java automatyczne wygeneruje ( również kiedy zmienisz strukturę pól
    składowych ) pola prywatne, publiczny konstruktor, equals, hashCode, toString
    oraz getters
*/
public record Car(String model, int speed) {
}
