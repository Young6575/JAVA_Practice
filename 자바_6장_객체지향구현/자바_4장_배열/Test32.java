package 자바_4장_배열;

public class Test32 {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
	
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		System.out.print("[");
	
		
	for (int i = 0; i <5; i++) {
		
		if (i==4)
			System.out.print(arr[i]);
		else
		System.out.print(arr[i]+ ", ");
		
	}
	System.out.print("]");
	
	int max = arr[0];
	int min = arr[0];
	int sum = 0;
	int total = 0;
	
	for (int i = 0; i<5; i++) {
		
		//최대값
		if (arr[i]>max)
			max = arr[i];
		//최소값
		if (min>arr[i])
			min = arr[i];
		//총합
		sum += arr[i];
		
		//총 갯수
		total += 1;
	}
	
	//최대값:
	System.out.println("\n최대값:" + max);
	//최소값:
	System.out.println("최소값:" + min);
	//평균:
	System.out.println("평균:" + sum/total);
	
	//배열 생성
	int [] patternarr = new int[10];
	
	System.out.print("[");
	
	
	for (int i = 1; i <11; i++) {
		
		patternarr[i-1] = 3 + (i-1)*2;
		
		if (i==10)
		System.out.print(patternarr[i-1]);
		else
		System.out.print(patternarr[i-1] + ", ");	
	}
	System.out.print("]");
	
	
	
	
	
	
	
	}
}
