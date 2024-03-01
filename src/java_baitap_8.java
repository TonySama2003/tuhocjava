import java.util.Scanner;

public class java_baitap_8 {
    // Phương trình bậc 2
    public static void main(String[] args) {
        System.out.println("Nhập vào 3 giá trị a,b,c");
        Scanner cs = new Scanner(System.in);
        System.out.println("nhập a");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhập b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("nhập c");
        int c = new Scanner(System.in).nextInt();
        double denta = Math.pow(b,2) - 4*a*c;
        System.out.println("denta = " +denta);
        if (denta < 0)
            System.out.println("Phương trình vô nghiện");
        else if(denta == 0) {
            System.out.println("Phương trình có nghiệm kép");
            double x = -b/(2*a);
            System.out.println("x1 = x2 = " +x);
        }else if (denta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            double x1 = (-b + Math.sqrt(denta)) / 2*a;
            double x2 = (-b - Math.sqrt(denta)) / 2*a;
            System.out.println("Nghiệm x1 là :" +x1);
            System.out.println("Nghiệm x2 là :" +x2);
        }
    }
}
