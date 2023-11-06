package Animals;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zoo {

    public static void moveAnimals(Animal [] animals){
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
            
        }
        
    }
    public static void main(String[] args) {

       //polimorfizam podtipa

        Bird bird = new Bird("Eagle", 10, "M", 20);
        Animal cat = new Cat("Shark", 10, "F", 120);
        Animal fish = new Fish("Siam", 5, "M", 20);
        Tiger tiger = new Tiger("Bengal", 15, "M", 45);
//bird.move();
//fish.move();
//cat.move();
tiger.ispis();

bird.fly();
        Animal [] animals ={bird, cat,fish}; //polymorphic array
moveAnimals(animals);
    }
}