import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) throws Exception {
         
    int n;  // bậc của ma trận vuông
    
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào bậc của ma trận: ");
    n = scanner.nextInt();
         
    int A[][] = new int[n][n];
         
    System.out.println("Nhập các phần tử cho ma trận: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
         
    System.out.println("Ma trận A vừa nhập:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }
         
    // các phần tử nằm trên đường chéo chính là i = j
    System.out.println("các phân tử trên đường chéo là ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == j) {
                
                System.out.print("\t" + A[i][j]);
                
            }
        }
    }
 System.out.println( );
    
    

     }
}
