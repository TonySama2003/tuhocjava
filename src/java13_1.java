import java.util.Scanner;

public class java13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 tháng :");
        int a = sc.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+a+" có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+a+" có 30 ngày " );
                break;
            case 2:
                System.out.println("Mời nhập vào số năm :");
                int nam = new Scanner(System.in).nextInt();
                String nn = nam%4 ==0 && nam%100 != 0 || nam%400==0 ? " có 29 ngày ": " có 28 ngày";
                System.out.println("Tháng "+a+" Năm "+nam+ nn);
                break;
            default:
                System.out.println("Không có tháng này nhập tào lao");
                break;
        }
    }
}
