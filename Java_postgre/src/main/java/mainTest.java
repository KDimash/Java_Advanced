import Database.*;
import java.util.Scanner;
public class mainTest {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Read readStu=new Students();
        Read readGroup=new Group();

        Select selectStu=new Students();
        Select selectGroup=new Group();

        readStu.read();
        System.out.println(" ");
        readGroup.read();
        System.out.println(" ");


        System.out.print("Enter student ID: ");
        int scanIdStudents=scanner.nextInt();
        selectStu.select(scanIdStudents);
        System.out.println(" ");


        System.out.print("Enter group ID: ");
        int scanIdGroup=scanner.nextInt();
        selectGroup.select(scanIdGroup);
        System.out.println(" ");
    }
}
