package Day1;
import java.util.*;
public class DistributiveCandies {
	public static int Candies(int[]arr) {
		int candyLen = arr.length;
		int canBeEaten = candyLen/2;
		Set<Integer> nc = new HashSet<>();
		for(int i=0; i<candyLen; i++) {
			nc.add(arr[i]);
		}
		int newLen = nc.size();
		if(canBeEaten<=newLen) {
			return canBeEaten;
		}
		else {
			return newLen;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Candies(arr));
	}
}

