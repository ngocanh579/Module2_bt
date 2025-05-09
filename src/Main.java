import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //khai báo mặc định các giá trị
//        // String : null, int ,shot ,byte : 0
//        // long : 0L
//        //float : 0.0f
//        // double : 0.0d , boolean : false
//        final boolean gitri = false ; // phai dung final
//        System.out.print("ban sinh nam bao nhieu : ");
//        int namSinh = sc.nextInt();
//        int tuoi = 2025-namSinh;
//        System.out.println("tuoi la "+tuoi);
//
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    System.out.printf("cu phap chuoi",... tham so gia tri);
    String name = "anh";
    float tuoi = 22;
    System.out.printf("chao ban %s . ban dang %.f",name,tuoi);
    // %.20s : sau name cos 20 ký tự
    //
    System.out.printf("%.20s %.20s\n","ho ten","nam sinh");
}
}
