package Animals;

public class Cat extends Animal{
    public Cat(String animaleSpecies, int age, String gender, double wight) {
        super(animaleSpecies, age, gender, wight);
    }

    @Override
    void move() {
        System.out.println("Moving around");
    }
    protected void ispis(){
        System.out.println("Cat...");
    }

}
