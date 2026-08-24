public class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
     }

     Student(int i) {
        id = i;
        name = "Not Assgined";
     }

     Student (int i, String n) {
        id = i;
        name = n;
     }
     void display() {
        System.out.println(id + " " + name);

     }
     public static void main(String[] args) {
         
        Student s1 = new Student();
        Student s2 = new Student (102);
        Student s3 = new Student (103, "Ankit");

        s1.display();
        s2.display();
        s3.display();

     }


    
}
