package Animals;

public abstract class Animal {
    protected String animaleSpecies;
    protected int age;
    protected String gender;
    protected double wight;




    public Animal(String animaleSpecies, int age, String gender, double wight) {
        this.animaleSpecies = animaleSpecies;
        this.age = age;
        this.gender = gender;
        this.wight = wight;
    }
    protected void eat (){
        System.out.println("Eating...");
    }
    abstract void move();

    @Override
    public String toString() {
        return "Animal{" +
                "animaleSpecies='" + animaleSpecies + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", wight=" + wight +
                '}';
    }
}
