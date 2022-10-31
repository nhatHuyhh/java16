import java.util.Scanner;

public class bai6 {
  public static void main(String[] args) {
    System.out.println("Nhap So nguyen n: ");
    int n= new Scanner(System.in).nextInt();
    int sum = 0;
    while(n>0){
      sum += n % 10;
      n/= 10;
    }
    System.out.println("Tong cac chu so cua n la :" + sum);
    System.out.println("da gia thanh cong bai toan hihi");
  }
}
