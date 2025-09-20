package AbstractAndInterface_Practice;

abstract class Animal {
    abstract String sound();

    abstract String habitate();
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    public String sound() {
        return "Dog Barking";
    }

    public String habitate() {
        return "Dog Habitate";
    }

    public void play() {
        System.out.println("Dog Playing");
    }
}

class Cat extends Animal implements Pet {
    public String sound() {
        return "Cat Meawing";
    }

    public String habitate() {
        return "Cat Habitate";
    }

    public void play() {
        System.out.println("Cat Playing");
    }
}

class Lion extends Animal {
    public String sound() {
        return "Lion Roaring";
    }

    public String habitate() {
        return "Lion Habitate";
    }
}

public class Animal_Hierarchy {
    public static void main(String[] args) {

        Animal d1 = new Dog();
        System.out.printf(d1.sound() +" "+ d1.habitate()+" ");
        ((Pet)d1).play();
        System.out.println("------------------");
        Animal c1 = new Cat();
        System.out.printf(c1.sound() +" "+ c1.habitate()+" ");
        ((Pet)c1).play();
        System.out.println("------------------");
        Animal l1 = new Lion();
        System.out.printf(l1.sound() +" "+ l1.habitate());


    }
}
