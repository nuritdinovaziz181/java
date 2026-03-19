class Car2 {
    String brand;
    int speed;


    Car2(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println(brand + " " + speed);
    }


}

class Sedan extends Car2 {
    Sedan(String b, int s) { super(b,s); }


    void fuel() {
        System.out.println("7L/100km");
    }


}

class Truck extends Car2 {
    Truck(String b, int s) { super(b,s); }


    void fuel() {
        System.out.println("20L/100km");
    }


}

 class Main {
    public static void main(String[] args) {
        Sedan s = new Sedan("Toyota",180);
        Truck t = new Truck("Volvo",120);

        s.displayInfo();
        s.fuel();
        t.displayInfo();
        t.fuel();
    }


}
