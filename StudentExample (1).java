package audas.student.example;

import java.util.ArrayList;

public class StudentExample {

  public static void main(String[] args) {
    ArrayList<Student> alist = new ArrayList<Student>();

    addStudents(alist);
    //displaying elements
    System.out.println(alist);

    //Adding "Steve" at the fourth position
    alist.add(3, new Student("Steve", "Stevenson", Student.SOPHOMORE));
    System.out.println("Number of Sophomores: " + countYearInSchool(alist, Student.SOPHOMORE));

    //displaying elements
    System.out.println(alist);
  }

  private static void addStudents(ArrayList<Student> studentList) {
    studentList.add(new Student("Steve", "Jones", Student.FRESHMAN));
    studentList.add(new Student("Tim", "Tebow", Student.SENIOR));
    studentList.add(new Student("Lucy", "Ball", Student.SENIOR));
    studentList.add(new Student("Pat", "Sajak", Student.JUNIOR));
    studentList.add(new Student("Angela", "Jolie", Student.FRESHMAN));
    studentList.add(new Student("Tom", "Bombadil", Student.SOPHOMORE));
  }

  private static int countYearInSchool(ArrayList<Student> studentList, String yearInSchool) {
    int count = 0;
    for (Student student : studentList) {
      if (student.getYearInSchool().equals(yearInSchool)) {
        count++;
      }
    }
    return count;
  }
}
