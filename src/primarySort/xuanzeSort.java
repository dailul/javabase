package primarySort;

public class xuanzeSort {
 public static int[] Xuanze(int[]arr){
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]>arr[j]) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
	 }
	 return arr;
 }
 public static void main(String[] args) {
		int []arr= {1,6,9,78,23,58,20};
		arr=Xuanze(arr);
		for(int i=0;i<arr.length;i++) {
		 System.out.println(arr[i]);
		}
	}
		
}
