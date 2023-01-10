import java.util.ArrayList;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student("Masha","JV23",2,5);
        Student student2 = new Student("Dasha","JV23",3,2);
        Student student3 = new Student("Sasha","JV23",3,2);
        Student student4 = new Student("Vladimir","JV23",4,4);

        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Student.grade(students); // Метод удаляет студентов если средний бал меньше 3
        Student.studentsInfo(students);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Student.averageGrade(students); // Метод переводит студента на следующий курс если бал выше 3
        Student.studentsInfo(students);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Student.printStudents(students,3); //Метод показывает какие студенты учатся на данном курсе

        TreeSet<Student> studentsTree = new TreeSet<>();
        studentsTree.add(student);
        studentsTree.add(student2);
        studentsTree.add(student3);
        studentsTree.add(student4);

        for(Student e: studentsTree){
            System.out.println(e.getName());
        }







    }
}
