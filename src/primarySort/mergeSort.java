package primarySort;

public class mergeSort {
	/**
	 * 合并相邻两个数组
	 * @param arr源数组
	 * @param arr1新数组
	 * @param s源数组第一个数组第一个元素下标
	 * @param m源数组第一个数组最后一个元素下标
	 * @param t源数组第二个数组第一个元素下标
	 */
	
 public static void merge(int[]arr,int[]arr1,int s,int m,int t) {
	 int i=s;
	 int j=m+1;
	 int k=s;
	 while(i<=m&&j<=t) {
		 if(arr[i]<arr[j]) {
			 arr1[k++]=arr[i++];
		 }else {
			 arr1[j++]=arr[j++];
		 }
	 }
	 while(i<=m) {
		 arr1[k++]=arr[i++];
	 }
	 while(j<=t) {
		 arr1[k++]=arr[j++];
	 }
 }
 /**
  * 一趟归并排序
  * @param arr
  * @param arr1
  * @param h
  * @param n
  */
 public static void mergePass(int[]arr,int[]arr1,int h,int n) { 
	 int i=0;
	 while((i+2*h-1)<=n) {
		 merge(arr,arr1,i,i+h-1,i+2*h-1);
		 i+=2*h;
	 }
	 if(i+h-1<n) {
		 merge(arr,arr1,i,i+h-1,n);
		 i+=2*h;
	 }else {
		 for(;i<=n;i++) {
			 arr1[i]=arr[i];
		 }
	 }
	 
 }

 public static void mergeSort(int []arr,int[]arr1) {
	 int h=1;
	 int n=arr.length;
	 while(h<n) {
		 mergePass(arr,arr1,h,n);
		 h=2*h;
		 mergePass(arr1,arr,h,n);
		 h=2*h;
		 
	 }
 }
 public static void main(String[] args) {
	 int []arr1= {};
		int []arr= {1,6,9,78,23,58,20};
		mergeSort(arr,arr1);
		for(int i=0;i<arr.length;i++) {
		 System.out.println(arr[i]);
		}
	}
 
}
