package _08_abstract_interface.thuc_hanh;

public abstract class Animal {
    public abstract String makeSound();

}
 interface Edible {
    String howToEat();
}
 class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}
class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
 class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}

 class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = new Edible() {
                    @Override
                    public String howToEat() {
                        return null;
                    }
                };
                System.out.println(edibler.howToEat());
                Fruit[] fruits = new Fruit[2];
                fruits[0] = new Orange();
                fruits[1] = new Apple();
                for (Fruit fruit : fruits) {
                    System.out.println(fruit.howToEat());
                }
            }
        }
    }
}
abstract class Fruit implements Edible { }