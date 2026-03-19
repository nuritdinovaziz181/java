class Person {
    String first,last;

    Person(String f,String l){
        first=f;
        last=l;
    }

    void show(){
        System.out.println(first+" "+last);
    }


}

class Student3 extends Person {
    int id;


    Student3(String f,String l,int id){
        super(f,l);
        this.id=id;
    }

    void study(){
        System.out.println(first+" studying");
    }


}

class Professor extends Person {
    String subject;

    Professor(String f,String l,String s){
        super(f,l);
        subject=s;
    }

    void teach(){
        System.out.println(first+" teaches "+subject);
    }


}

 class Main4 {
    public static void main(String[] args) {
        Student3 s = new Student3("Ali","Khan",1);
        Professor p = new Professor("John","Doe","Math");


        s.show();
        s.study();

        p.show();
        p.teach();
    }

}
