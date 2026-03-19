class Outer {

    class Inner {
        void show() {
            System.out.println("Inner class working");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }


}
