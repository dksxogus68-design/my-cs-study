 import java.util.Scanner;
public class c3p8 {
  public static void main(String[]args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("정수 몇 개 저장하시겠습니까?");
	  int i = scanner.nextInt();
	  int n[] = new int[i];
	  
	  int j=0;
	  while(j<i) {
		  int random = (int)(Math.random()*100)+1;
		  
		  boolean duplicate = false;
		  for(int k=0; k<j; k++) {
			  if(n[k] == random) {
				  duplicate = true;
				  break;
			  }
		  }  
		  if(duplicate == false) {
			  n[j] = random;
			  j++;
		  }
		}
	  int sum = 0;
	  System.out.println("랜덤한 정수들... ");
	  for(int l=0; l<i; l++) {
		  sum += n[l];
		  System.out.print(n[l]+ " ");
	  }
	  System.out.println();
	  System.out.println("평균은 " + (double)sum/i);
  }
}
