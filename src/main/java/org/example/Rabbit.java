package org.example;

import java.util.Objects;

public class Rabbit {

    private final String color;

    private int age;

    Rabbit(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit other = (Rabbit) o;
        return age == other.age && Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }
}
