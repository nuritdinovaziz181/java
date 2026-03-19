class Animal {
    String name;


    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some sound");
    }


}

class Dog extends Animal {
    Dog(String n){ super(n); }


    void sound(){
        System.out.println(name + " Woof");
    }


}

class Cat extends Animal {
    Cat(String n){ super(n); }


    void sound(){
        System.out.println(name + " Meow");
    }


}
class Main3 {
    public static void main(String[] args) {
        new Dog("Bob").sound();
        new Cat("Kitty").sound();
    }
}
