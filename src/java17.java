public class java17 {
    // Viết số nguyên n bất kì và in ra n!
    public static void main(String[] args) {
        // Tính tổng từ 1-5 nhưng bỏ qua số 3
        int tong = 0;
        for (int i = 0; i<=5;i++){
            if (i==3)
                continue;
            else
                tong+=i;
        }
        System.out.println("tong ="+tong);
    }
}
