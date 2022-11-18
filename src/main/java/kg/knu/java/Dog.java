package kg.knu.java;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        this.voice = "Гав-гав...";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
