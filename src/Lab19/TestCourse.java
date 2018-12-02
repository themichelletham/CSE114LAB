package Lab19;


import java.util.*;
public class TestCourse {
    public static void main(String[] args){
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
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
				students = course2.getStudents();
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students[i] + ", ");
	}
}
class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
            String[] temp = new String[student.length() + 1];
            temp[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents() {
            // obtain number of real students
            int count = 0;
            for(int i = 0 ; i < students.length; i++){
                if(students[i] != null || students[i] != ""){
                    count++;
                }
            }
            
            String[] temp = new String[count];
            for(int i = 0; i < temp.length; i++){
                temp[i] = students[i];
            }
            
            students = temp;
            return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
            /*String[] temp = new String[students.length - 1];
            int j = 0;
            while(j < students.length){
                if(students[j] != student){
                    temp[j] = students[j];
                    j++;
                }
                else
                    break;
            }
            for(int i = j; i < temp.length; i++){
                temp[i] = students[i + 1];
            }
*/
            ArrayList<String> temp = new ArrayList<>(Arrays.asList(students));
            temp.remove(temp.indexOf(student));
            students = temp.toArray(students);
	}
        public void clear(){
            String[] temp = new String[students.length];
            students = temp;
        }
}
