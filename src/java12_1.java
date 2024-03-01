import java.util.Scanner;

public class java12_1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Nhập vào số điểm của bạn :");
        double diem = cs.nextDouble();
        String xh = diem >= 8 ? "Giỏi" : 8 > diem && diem >= 6.5 ? "Khá" : 6.5 > diem && diem >=5 ? "Trung bình " : "yếu";
        System.out.println("Bạn có học lực loại :"+xh);
    }
}
