public class ManageStudent {

    private static Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }

    private static void printStudent(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }

    }
    public static void main(String[] args){
        Student [] student = null;
        student = addStudent();
        printStudent(student);
    }


}
