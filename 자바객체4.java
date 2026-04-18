package 연습문제4;

public class Average {
	int [] nums = new int[10];
	int count = 0;
	
	public Average() {

	}
	
	public void put(int n) {
		nums[count] = n;
		count++;
	}
	public void showAll() {
		for(int i=0; i<count; i++) {
			System.out.println(nums[i]);
		}
	}
	
	
	public double getAvg() {
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			sum+=nums[i];
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		Average avg = new Average();
		avg.put(10);
		avg.put(15);
		avg.put(100);
		avg.showAll();
		System.out.print("평균은" + avg.getAvg());
		}
}
