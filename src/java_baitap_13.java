import java.util.Scanner;

public class java_baitap_13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao so a :");
        int a =sc.nextInt();
        if (a%2==0){
            int tong=0;
            for ( int i=0;a>=i;i+=2){
                tong+=i;
            }
            System.out.println("tong = "+tong);
        }else
            System.out.println("toi khong tinh so le bye bye");
    }
}
