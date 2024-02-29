import java.util.Scanner;

public class java11_2 {
    // Tìm 2 số khi biết tổng và hiệu
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("nhập vào tổng");
        double tong = new Scanner(System.in).nextDouble();
        System.out.println("nhập vào hiệu");
        double hieu = new Scanner(System.in).nextDouble();
        double x = (tong + hieu)/2;
        double y = tong - x;
        System.out.println("giá trị x là : "+x);
        System.out.println("giá trị y là :"+y);
    }
}
