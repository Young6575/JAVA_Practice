package 자바_13장_제너릭과어노테이션;

interface Maximum<T extends Comparable<T>>{
	T max();
}

class NumUtil<T extends Comparable<T>> implements Maximum<T>{
	T[] value;
	
	NumUtil(T[] value) {
		this.value=value;
	}
	
	public T max() {
		T v = value[0];
		
		for (int i=0; i <value.length; i++) {
			if (value[i].compareTo(v) > 0)
			v = value[i];
		}
		return v;
	}
}


public class GenInterfaceTest {

	public static void main(String[] args) {
		
		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "1", "2", "3", "4", "5" };
		
		NumUtil<Integer> iUtil = new NumUtil<Integer>(inum);
		NumUtil<Double> dUtil = new NumUtil<Double>(dnum);
		NumUtil<String> sUtil = new NumUtil<String>(snum);
		
		System.out.println("inum 최대값 : " + iUtil.max());
		System.out.println("dnum 최대값 : " + dUtil.max());
		System.out.println("snum 최대값 : " + sUtil.max());
		
		
	}
	
}
