import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String name;
    private String group;
    private int course;
    private double grade;



    public Student(String name, String group, int course, double grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }
    public static void grade(ArrayList<Student> students){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getGrade()<3){
                students.remove(students.get(i));
            }
        }
    }
    public static void printStudents(ArrayList<Student> students,int course){
        System.out.println("Name of students who studying on the course: "+course);
        for(Student e: students) {
            if (course == e.getCourse()) {
                System.out.println("Name: " + e.getName());
            }
        }
    }

    public static void studentsInfo(ArrayList<Student> students){
        for(Student e: students){
            System.out.println("Name: "+e.getName()+" Course: "+e.getCourse());
        }
    }
    public static void averageGrade(ArrayList<Student> students){
        for(Student e: students){
            if(e.getGrade()>=3){
                e.setCourse(e.getCourse()+1);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {

        return name.compareTo(o.getName());
    }
}
