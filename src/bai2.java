import java.util.Scanner;

public class bai2 {
  public static void main(String[] args) {
    System.out.println("Nhập vào số tự nhiên n:");
    int n= new Scanner(System.in).nextInt();
    int count=0;
    for (int i = 1; i <=n ; i++) {
      if (n%i==0){
        count++;
        System.out.println( i +"");
      }

    }
    System.out.println("\nn có " + count + " "+ "ước số");
  }
}
