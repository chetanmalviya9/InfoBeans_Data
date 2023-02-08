import java.util.*;

class IE13 {

    public static void main(String[] args) {
        int a, b, c, ch;
        System.out.println("enter number  ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("which operation do you want to perform\n 1:+\n 2:-\n 3:*\n 4:/\n 5:%");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                c = a - b;
                System.out.println(c);
                break;
            case 3:
                c = a * b;
                System.out.println(c);
                break;
            case 4:
                c = a / b;
                System.out.println(c);
                break;
            case 5:
                c = a % b;
                System.out.println(c);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

