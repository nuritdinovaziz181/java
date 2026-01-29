class student {
    String name = "Айбек";

    public static void main(String[] args) {
        kafedra k = new kafedra();
        k.showStudent();
        k.showUniver();
        k.showKafedra();
    }
}

class uniber extends student {
    String univ = "SDU университеті";

    void showUniver() {
        System.out.println("Университет: " + univ);
    }
}

class kafedra extends uniber {
    String kaf = "Ақпараттық жүйелер кафедрасы";

    void showKafedra() {
        System.out.println("Кафедра: " + kaf);
    }

    void showStudent() {
        System.out.println("Студент: " + name);
    }
}
