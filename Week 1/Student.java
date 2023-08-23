public class Student {
  String name;
  int age;
  String course;
// Open Weaver Week 1 coding project by Shruti Choudhary
  public void displayInfo(String name, int age, String course){
    this.name = name;
    this.age= age;
    this.course = course;
    System.out.println("\nStudent name: "+ name + 
        "\nStudent age: "+ age  + "\nStudent Course: " + course);
  }
  public static void main(String args[]){
    Student student1 = new Student();
    Student student2 = new Student();
    student1.displayInfo("Shruti", 21, "Computer Science Engineering");
    student2.displayInfo("Zoe", 20, "Biotechnology");
  }
}
