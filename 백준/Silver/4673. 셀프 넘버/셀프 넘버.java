//4673
public class Main {
	public static void main(String[] args) {
		boolean[] nums = new boolean[10001];
		nums[0] = true;

		for (int i = 1; i <= 10000; i++) {

			notSelfNum(i,nums);
			if(!nums[i]) {
			System.out.println(i);
			}
			
		}

	}
	static void notSelfNum(int i , boolean[] nums) {
		if(i>=10000)return;
			int sum = i;
	        while (i > 0) {
	            sum += i % 10;
	            i /= 10;
	        }
	        if(sum<=10000) {
	        nums[sum]= true;
	        }
	}
}