package audas.student.example;

public class Student {
  public static final String FRESHMAN = "FRESHMAN";
  public static final String SOPHOMORE = "SOPHOMORE";
  public static final String JUNIOR = "JUNIOR";
  public static final String SENIOR = "SENIOR";
  private static int id = 0;

  private int studentId = 0;
  private String firstName;
  private String lastName;
  String yearInSchool;

  public Student(String firstName, String lastName, String yearInSchool) {
    id++;
    this.studentId = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearInSchool = yearInSchool;
  }

  public int getStudentId() {
    return studentId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getYearInSchool() {
    return yearInSchool;
  }

  public void setYearInSchool(String yearInSchool) {
    this.yearInSchool = yearInSchool;
  }
}
