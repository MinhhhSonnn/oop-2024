public class StudentManagement {

  // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
  Student[] students = new Student[100];
  private int size;

  /**
   * A.
   */
  public static boolean sameGroup(Student s1, Student s2) {
    // TODO:
    return s1.getGroup().equals(s2.getGroup());
  }

  /**
   * A.
   */
  public void addStudent(Student newStudent) {
    // TODO:

    if (size <= 100) {
      students[size] = newStudent;
      size++;
    }

  }

  /**
   * A.
   */
  public String studentsByGroup() {
    // TODO:
    StringBuilder res = new StringBuilder();
    String currentGroup = students[0].getGroup();
    res.append(currentGroup + "\n");
    res.append(students[0].getInfo() + "\n");
    for (int i = 1; i < this.size; i++) {
      if (!students[i].getGroup().equals(currentGroup)) {
        currentGroup = students[i].getGroup();
        res.append(currentGroup + "\n");
      }
      res.append(students[i].getInfo() + "\n");
    }
    return res.toString();
  }

  /**
   * A.
   */
  public void removeStudent(String id) {
    // TODO:
    int index = -1;
    for (int i = 0; i < this.size; i++) {
      if (students[i].getId().equals(id)) {
        index = i;
        break;
      }
    }
    for (int i = index; i < this.size - 1; i++) {
      students[i] = students[i + 1];
    }
    students[this.size - 1] = null;
    this.size--;
  }

  /**
   * A.
   */
  public static void main(String[] args) {
    // TODO:

  }
}