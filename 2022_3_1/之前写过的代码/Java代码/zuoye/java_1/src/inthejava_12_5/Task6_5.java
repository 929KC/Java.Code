package inthejava_12_5;

public class Task6_5 {

	public static void main(String[] args) {
	int[] arr= {18,25,7,36,13,2,89,63};
		int Min=arr[0],k=0;
		for(int i=1; i<arr.length;i++) {
			if(Min>arr[i]) {
				Min=arr[i];
				k=i;
				//黄茂荣07
			}
		}
		System.out.println("最少的积分是："+Min+"所在的位置是："+k);
	}

}
