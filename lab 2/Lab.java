public class Lab {
}
class Lab {
    int hours;

    public static void main(String[] args) {
        Lec l = new Lec();
        l.input();
        l.show();
    }
}

class Lec extends Lab {
    void input() {
        hours = 30;
    }

    void show() {
        System.out.println("Лекция сағаты: " + hours);
    }
}
