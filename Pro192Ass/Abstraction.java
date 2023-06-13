abstract class Abstraction {
    String animalName;

    public Abstraction(String animalName) {
        this.animalName = animalName;
    }

}

class DogG extends Abstraction {
    public DogG(String animalName) {
        super(animalName);
    }
}

class Main3 {
    public static void main(String[] args) {
        DogG dog1 = new DogG("Mike");

        System.out.println(dog1.animalName);
    }
}
