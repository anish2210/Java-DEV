class Pen {
    String color;
    String type;

    public void printer () {
        System.out.println("This is from the class pen");
    }

    public void colorGen(){
        System.out.println(this.color);
    }

    public void typeGen(){
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String Name, int Age){
        this.name = Name;
        this.age = Age;
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student("Anish", 23);

        s1.studentInfo();
    }
}
