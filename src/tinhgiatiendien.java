import java.util.Scanner;

public class tinhgiatiendien {
    public static void main(String[] args) {
        System.out.print(" so dien da su dung trong thang: ");
        Scanner sc = new Scanner(System.in);
        int dien = sc.nextInt();
        double total = 0;

        if(dien>0 && dien <= 50 ){
            total =dien * 1.800;
        }else if(dien>50 && dien <= 100){
            total = dien * 2.300;
        }else {
            total = dien * 3.000;
        }

        System.out.printf("tien dien phai tra la : %.2f VND\n", total);
    }
}
