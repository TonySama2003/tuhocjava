import java.sql.SQLOutput;
import java.util.Scanner;

public class java10_1 {
    // bài tập tính chu vi diện tính hình tròn
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính r :");
        double r = new Scanner(System.in).nextDouble();
        double cv = 2 * Math.PI * r;// thư viện toán số PI
        double dt = Math.PI * Math.pow(r,2);// thư viện toán mũ 2
        System.out.println("chu vi hinh tron la :"+cv);
        System.out.println("dien tich hinh tron la :"+dt);
    }
}
