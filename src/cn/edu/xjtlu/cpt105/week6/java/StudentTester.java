import java.util.Scanner;

public class StudentTester {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("how many students are there?");
        int studentamount = Integer.parseInt(kb.nextLine());


        Student[] students = new Student[studentamount];

        for (int i = 0; i < students.length; i++) {
            System.out.print("what is the name");
            String name = kb.nextLine();
            System.out.print("what is the id");
            String id = kb.nextLine();
            System.out.print("what is the chinese score");
            int chinese = Integer.parseInt(kb.nextLine());
            studentamount++;
            Student sp = new Student(name, id, chinese, 80, 80, studentamount);
            students[i] = sp;
        }
        System.out.println("all the information have been recorded");
        System.out.println(students[0].getId());
    }


//Do not delete me.
}
