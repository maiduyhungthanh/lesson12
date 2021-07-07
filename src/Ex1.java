
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Số chuỗi tuỳ chọn");
        int n = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập phần tử chuỗi: ");
        String [] A= new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("A[" + i + "] = "  );
            A[i] = sc.nextLine();
        }
        System.out.println("Phần tử chuỗi cần kiểm tra: ");
         String isCheck = sc.nextLine();
        String b = "";
        String Java = "Java";
        int jv = 0;
        for (int i = 0; i < n; i++) {
            if (A[i].equalsIgnoreCase(Java)) {
                jv++;
            }
            if (isCheck.equals(A[i])) {
                b += i + " ";
            }
        }
        System.out.println(" - Số lần ''Java'' xuất hiện trong chuỗi là " + jv);
        if (b.length() > 0) {
            System.out.println(" - Phân tử [" + isCheck + "] xuất hiện ở vị trí " + b);
        } else {
            System.out.println(" - Phân tử [" + isCheck + "] không xuất hiện trong chuỗi ");
        }
        sc.close();
    }
}