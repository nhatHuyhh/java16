import java.util.Scanner;

public class bai3 {
  public static void main(String[] args) {
    System.out.println("Nhập vào số a :");
    int a = new Scanner(System.in).nextInt();
    System.out.println("Nhập vào số b :");
    int b = new  Scanner(System.in).nextInt();
    int max = 0;
    if (a>b) {
      for (int i = 1; i <= b; i++) {
        if (a % i == 0 && b % i == 0)
          if (max < i) {
            max = i;
          }
      }
    }
    else if(a==b){
      for (int i = 1; i <= a; i++) {
        if (a % i == 0 && b % i == 0)
          if (max < i) {
            max = i;
          }
      }
    }
    else {
      for (int i = 1; i <= a; i++) {
        if (a % i == 0 && b % i == 0)
          if (max < i) {
            max = i;
          }
      }
  }
    System.out.println("UCLN của a và b là :" + max);
    System.out.println("BCNN của a và b là :" + (a*b)/max);
  }
}
