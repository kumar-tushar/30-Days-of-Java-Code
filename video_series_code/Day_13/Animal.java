package video_series_code.Day_13;

public abstract class Animal {
    private int age;  // VS private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();

        Object str = "est";
        String realS = (String) str;
        realS.getBytes();

        // What happens when...
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }

}