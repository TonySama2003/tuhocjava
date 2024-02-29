import java.util.Scanner;

public class java11_4 {
    //Tính năm nhuận
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("nhap vào số năm :");
        int nam = new Scanner(System.in).nextInt();
        System.out.println("Đáp án là : ");
        if(((nam % 4 ==0) && (nam % 100 != 0)) || (nam % 400 ==0))
            System.out.println("Năm nhuận");
        else
            System.out.println("Năm không nhuận");
    }
}
