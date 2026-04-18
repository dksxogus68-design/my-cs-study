import java.util.Scanner;
public class c3p6 {
  public static void main(String[]args) {
	  Scanner scanner = new Scanner(System.in);
	  int n[] = new int[10];
	  
	  System.out.println("양의 정수 10개를 입력하시오.");
	  for(int i=0; i<10; i++) {
		n[i] = scanner.nextInt();
	  }
	  System.out.println("자리수의 합이 9인 것은");
	  for(int i=0; i<10; i++) {
	    int h = n[i]/100;
	    int t = (n[i]%100)/10;
	    int o = n[i]%10;
	    if(h+t+o == 9) {
	    	System.out.print(n[i] + " ");
	    }
	  }
  }
}