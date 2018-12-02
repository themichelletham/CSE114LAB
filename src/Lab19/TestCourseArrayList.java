
package Lab19;
import java.util.*;
public class TestCourseArrayList {
    public static void main(String[] args) {
	Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
                course1.dropStudent("Peter Jones");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		System.out.println(course1.getStudents());
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
		System.out.println(course2.getStudents());
    }
}
class Course{
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student){
            students.add(student);
            numberOfStudents++;
	}
	public ArrayList<String> getStudents() {
            return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
            students.remove(students.indexOf(student));
            numberOfStudents--;
	}
        public void clear(){
            students.clear();
        }
}
