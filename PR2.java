import java.util.Scanner;

public class PR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of student");
        int n = sc.nextInt();
        System.out.println("enter the number of subject");
        int sub = sc.nextInt();

        Recored r1[] = new Recored[n];

        for (int i = 0; i < r1.length; i++) {
            System.out.println("enter the " + (i + 1) + " student details");
            r1[i] = new Recored(sub);
            System.out.println("first name");
            r1[i].fname = sc.next();
            System.out.println("last name");
            r1[i].lname = sc.next();

            int sum = 0;
            for (int j = 0; j < sub; j++) {
                System.out.println("enter the "+ (j+1) +" subject mark");
                r1[i].marks[j] = sc.nextInt();
                sum = sum + r1[i].marks[j];
            }
            r1[i].avrage = sum / sub;
            if (r1[i].avrage >= 90 && r1[i].avrage <= 100) {
                r1[i].gred = 'A';
            } else if (r1[i].avrage >= 80 && r1[i].avrage <= 89) {
                r1[i].gred = 'B';
            } else if (r1[i].avrage >= 70 && r1[i].avrage <= 79) {
                r1[i].gred = 'C';
            } else if (r1[i].avrage >= 60 && r1[i].avrage <= 69) {
                r1[i].gred = 'D';
            } else {
                r1[i].gred = 'E';
            }
        }
        System.out.println("-----------------------------");
        System.out.println("All student data information");
        System.out.println("-----------------------------");
        for (int i = 0; i < r1.length; i++) {
            System.out.print(r1[i].fname + " " + r1[i].lname + "\n" + r1[i].avrage + "\n" + r1[i].gred);
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}

class Recored {
    String fname;
    String lname;
    int marks[];
    float avrage;
    char gred;

    public Recored(int sub) {
        marks = new int[sub];
    }
}
