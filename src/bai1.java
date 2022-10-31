import java.util.Scanner;

public class bai1 {
  public static void main(String[] args) {
    System.out.println("Nhập vào số a:");
    int a = new Scanner(System.in).nextInt();
    System.out.println("Nhập vào số b:");
    int b = new Scanner(System.in).nextInt();
    System.out.println("Nhập vào sô c :");
    int c = new Scanner(System.in).nextInt();
    System.out.println("Nhập vào sô d:");
    int d = new Scanner(System.in).nextInt();
    int max1 ;
    int max2;
    int max;
    max1=a;
    max2=c;
      if (a<b)
      max1=b;
      if(c<d)
      max2=d;
    max=max1;
      if(max2>max1)
      max=max2;
    System.out.println("sôd lớn nhất trong 4 số là :" + max);
  }
}
