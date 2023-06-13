public class Encapsulation {
    private String name;
    private int age;

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Encapsulation student1 = new Encapsulation("Hoang Thuy", 20);
        Encapsulation student2 = new Encapsulation("Duc Hanh", 30);

        System.out.println(student1.getName() + " - " + student1.getAge() + " years old");
        System.out.println(student2.getName() + " - " + student2.getAge() + " years old");
    }
}