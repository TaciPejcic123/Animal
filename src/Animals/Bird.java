package Animals;

public class Bird extends Animal implements Flyable{
    public Bird(String animaleSpecies, int age, String gender, double wight) {
        super(animaleSpecies, age, gender, wight);
    }

    @Override
    void move() {
        System.out.println("Flapping wings");
    }

    protected void ispis(){
        System.out.println("Bird...");
    }

    @Override
    public void fly() {
        System.out.printf("Flying around..");
    }
}
