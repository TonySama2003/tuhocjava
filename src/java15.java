public class java15 {
    public static void main(String[] args) {
        // Tính tổng các số từ 1 => 5
        int a = 1;
        int tong = 0;
        do{
            tong+=a; // tong = tong + a
            a++;
        }while (a<=5);
            System.out.println("tong = "+tong);
    }
}
