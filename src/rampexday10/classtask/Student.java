package rampexday10.classtask;

public class Student {
    String name;
    String dept ;
    int id;


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "sai";
        s2.name = "pri";
        s1.id = 01;
        s2.id = 02;
        s1.dept="Aids";
        s2.dept="ece";
        System.out.println(s1.name + " roll no  " + s1.id +" is studying  "+s1.dept);
        System.out.println(s2.name + " roll no  " + s2.id +" is studying  "+s2.dept);

    }
}
