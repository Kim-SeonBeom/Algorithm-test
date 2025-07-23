
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		Arrays.sort(nums);
		int cnt = 0;
		int left = 0;
		int right = nums.length-1;
	
		while(true){
			if(left>=right) {
				break;
			}
			if(nums[left]+nums[right]==x) {
				left++;
				right--;
				cnt++;
			}else if(nums[left]+nums[right]<x) {
				left++;
			}else 
				right--;
		}
		System.out.println(cnt);
	}
}