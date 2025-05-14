package 자바_6장_객체지향구현;

import java.util.Random;

class Sort {
	public Random rnd = new Random();

	int[] num = new int[10];

	public Sort() {
		System.out.print("[");

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100);

			System.out.print(num[i]);
			if (i != num.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");

		sorting();
	}

	public void sorting() {

		int max = num[0];
		int maxnum = 0;
		int last = num[num.length - 1];
		int exlastmax = num[0];
		int count = 0;

		for (int x : num) {

			if (max < x) {
				max = x;
				maxnum = count;
			}

			count += +1;
		}

//		전체배열에서제일큰값을검색
		System.out.println();
		System.out.println("전체배열에서제일큰값 : " + max);

//		찾은제일큰값과배열의마지막값을Swap
		num[num.length - 1] = max;
		num[maxnum] = last;

		System.out.println();
		System.out.println("찾은제일큰값과배열의마지막값을swap");
		System.out.print("[");

		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i]);
			if (num[i] == max | num[i] == last) {
				System.out.print("*");
			}

			if (i != num.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");

//		제일마지막을제외한배열에서제일큰값을검색
		System.out.println();
		max = num[0];
		for (int i = 0; i < num.length - 1; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("제일마지막을제외한배열에서제일큰값 : " + max);
		
		
//	찾은제일큰값과배열의마지막앞의값을swap
		last = num[num.length - 1];
		
		
		
	}

}

public class SelectionSort {

	public static void main(String[] args) {

		Sort s1 = new Sort();

	}
}
