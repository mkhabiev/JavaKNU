package kg.knu.java;

public class Cow extends Animal {
    public Cow(String name) {
        this.name = name;
        this.voice = "Муу...";
    }


    @Override
    public String getName() {
        return this.name;
    }
}
