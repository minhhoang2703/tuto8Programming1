package q1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) throws Exception {
        String name; String address;
        int age;
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("src/q1/users.txt",true));
        System.out.printf("Enter ur name:");
        name = sc.nextLine();
        System.out.printf("Enter ur address");
        address = sc.nextLine();
        System.out.printf("Enter ur age:");
        age =sc.nextInt();

    }
}
