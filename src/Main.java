
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String[] name=new String[5];
        Integer[] code=new Integer[5];
        String[] designation=new String[5];
        String[] salary=new String[5];
        String[] company_name=new String[5];
        String[] phn_num=new String[5];
        String[] email=new String[5];

        System.out.println("1.Add employee\n2.View employee\n3.Search employee\n4.Delete employee\n5.Exit");
        System.out.println("Enter your choice:");
        int c=s.nextInt();
        do{
            switch (c){
                case 1:
                    for (int a=0;a<5;a++) {
                        System.out.println("Employee Details");
                        System.out.println("Employee code");
                        code[a] = s.nextInt();
                        System.out.println("Employee name");
                        name[a] = s.next();
                        System.out.println("Employee designation");
                        designation[a] = s.next();
                        System.out.println("Employee salary");
                        salary[a] = s.next();
                        System.out.println("Company name");
                        company_name[a] = s.next();
                        System.out.println("Phone number");
                        phn_num[a] = s.next();
                        System.out.println("Email id");
                        email[a] = s.next();
                    }
                    break;
                default:
                    System.out.println("invalid choice");
            }

        }while(c!=6);


    }
}