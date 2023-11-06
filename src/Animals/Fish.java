package Animals;

public class Fish extends Animal{
    public Fish(String animaleSpecies, int age, String gender, double wight) {
        super(animaleSpecies, age, gender, wight);
    }

    @Override
    void move() {
        System.out.println("Swimmnig around");
    }
}
