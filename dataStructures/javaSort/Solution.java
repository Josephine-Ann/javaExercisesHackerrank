import java.util.*;

class Student implements Comparable<Student> {
      public String name;
      public Double mark;
        
    public Student(String n, Double m) {
            name = n;
            mark = m;
    }
    public int compareTo(Student obj) {
      Student other = (Student)obj;
    if(mark > other.mark) return -1; // This object is smaller than the other one (marks)
    if(mark < other.mark) return 1;  // This object is larger than the other one (marks)
    if (Double.compare(mark, other.mark) == 0) { // This object is lexographically inferior (name)
    if (name.compareTo(other.name) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
    return 0;
  }
}

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (scanner.hasNext()) {
            String[] student = scanner.nextLine().split(" ");
            students.add(new Student(student[1], Double.valueOf(student[2])));
        }
        Collections.<Student>sort(students);
        for (Student s : students) {
        System.out.println(s.name);
        }
        scanner.close();
    }
}
