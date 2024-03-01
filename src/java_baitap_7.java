import java.util.Scanner;

public class java_baitap_7 {
    // Tính số ngày trong tháng
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Nhập vào số tháng :");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Đáp án là");
        if( thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang==10 || thang==12)
        System.out.println("Tháng có 31 ngày");
        else if(thang == 2){
            System.out.println("Nhập vào số năm");
            int nam = new Scanner(System.in).nextInt();
            if(((nam % 4 ==0) && (nam % 100 != 0)) || (nam % 400 ==0))
                System.out.println("Tháng có 29 ngày");
            else
                System.out.println("Tháng có 28 ngày");
        }else
            System.out.println("Tháng có 30 ngày");
    }
}
