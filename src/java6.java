public class java6 {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        double kp = (double) a/b; // ép kiểu int >> double để kết quả trả về đúng
        System.out.println(kp);
        // ép kiểu hẹp
        int c= 128;
        byte d=(byte) c;
        System.out.println(c);
        System.out.println(d);// kết quả trả về sai do byte chỉ lưu trữ được tối đa giá trị -127 >> 127

        int e=15;
        byte f=(byte) e;
        System.out.println(e);
        System.out.println(f);//kết quả trả về đúng do e có giá trị nằm trong khoảng -127 >> 127
    }
}
