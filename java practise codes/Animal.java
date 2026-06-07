interface A {
    void show();
}
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
class Puppy extends Dog {
    void weep() { 
        System.out.println("Weeping");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}
class Hybrid extends Animal implements A {
    public void show() {
        System.out.println("Show Method");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
        Cat c = new Cat();
        c.eat();
        c.meow();
        Hybrid h = new Hybrid();
        h.eat();
        h.show();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                   