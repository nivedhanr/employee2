
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,i=2;
        Scanner sc=new Scanner(System.in);
        Integer[] emp_code=new Integer[2];
        String[] name=new String[2];
        String[] designation=new String[2];
        String[] company=new String[2];
        String[] phn_num=new String[2];
        String[] email=new String[2];
        String[] salary=new String[2];

        do{
            System.out.println("1.Add employee\n2.View employee\n3.Search employee\n4.Delete employee\n5.Exit");
            System.out.println("Enter your choice:");
            c=sc.nextInt();
            switch (c){
                case 1:
                    for(int a=0;a<2;a++) {
                        System.out.println("Employee Details");
                        System.out.println("Employee code");
                        emp_code[a] = sc.nextInt();
                        System.out.println("Employee name");
                        name[a] = sc.next();
                        System.out.println("Employee designation");
                        designation[a] = sc.next();
                        System.out.println("Employee salary");
                        salary[a] = sc.next();
                        System.out.println("Company name");
                        company[a] = sc.next();
                        System.out.println("Phone number");
                        phn_num[a] = sc.next();
                        System.out.println("Email id");
                        email[a] = sc.next();
                    }
                    break;
                case 2:
                    System.out.println("Employee Details");
                    for(int a=0;a<2;a++) {
                        System.out.println("Employee code"+emp_code[a]);
                        System.out.println("Employee name"+name[a]);
                        System.out.println("Employee designation"+designation[a]);
                        System.out.println("Employee salary"+salary[a]);
                        System.out.println("Company name"+company[a]);
                        System.out.println("Phone number"+phn_num[a]);
                        System.out.println("Email id"+email[a]);
                        System.out.println("");
                    }
                    break;


                default:
                    System.out.println("invalid choice");
                    break;
            }

        }while(c!=5);


    }
}