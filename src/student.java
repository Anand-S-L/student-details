import java.util.ArrayList;
import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> AdmNo = new ArrayList<>();
        ArrayList<Integer> RollNo = new ArrayList<>();
        ArrayList<String> College = new ArrayList<>();

        while (true) {
            System.out.println("1 Student entry");
            System.out.println("2 search student using rollno");
            System.out.println("3 student delete");
            System.out.println("4 exit");
            System.out.println("Select an option!");

            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter student name");
                    String studentname = input.next();
                    Name.add(studentname);

                    System.out.println("enter admission number");
                    int admission_num = input.nextInt();
                    AdmNo.add(admission_num);

                    System.out.println("enter roll number");
                    int roll_num = input.nextInt();
                    RollNo.add(roll_num);

                    System.out.println("enter college name");
                    String college_name = input.next();
                    College.add(college_name);

                    break;

                case 2:
                    System.out.println("enter roll number");
                    int ROLLNO = input.nextInt();
                    int index = 0;
                    if (RollNo.contains(ROLLNO)) {
                        index = RollNo.indexOf(ROLLNO);
                        System.out.println("Name: " + Name.get(index));
                        System.out.println("AdmNo: " + AdmNo.get(index));
                        System.out.println("Rollno: " + RollNo.get(index));
                        System.out.println("college: " + College.get(index));
                    } else {
                        System.out.println("student not found");
                    }

                    break;
                case 3:
                    System.out.println("delete student name");
                    String name = input.next();
                    int index1 = 0;
                    if (Name.contains(name)) {
                        index1 = Name.indexOf(name);
                        Name.remove(index1);
                        AdmNo.remove(index1);
                        RollNo.remove(index1);
                        College.remove(index1);
                        System.out.println("successfully removed " + name);
                    } else {
                        System.out.println("student not found");
                    }
                    break;
                case 4:
                    return;

                default:
                    break;
            }
        }
    }
}