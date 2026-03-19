class Car {


    class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            System.out.println("Engine power: " + power);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine e = c.new Engine(150);
        e.show();
    }


}
