package kg.knu.java;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
        this.voice = "Мяу...";
    }

    @Override
    public String getName() {
        return name;
    }
}
