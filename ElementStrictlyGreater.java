package Misc;

public class ElementStrictlyGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7};
		int k = 2;
		ElementStrictlyGreater e = new ElementStrictlyGreater();
		System.out.println(" ElementStrictlyGreater @ index - "+(e.binSearch(a,k,0,a.length)+1));
	
	}
	
	public int binSearch(int[] a, int k, int low, int high) {
		int mid = (low+high)/2;
		
		if(a[mid]==k) {
			return mid;
		}
		else if(a[mid]<k) {
			return binSearch( a,  k,  mid+1,  high);	
		}
		else if(a[mid]>k) {
			return binSearch( a,  k,  low,  mid-1);	
		}
		else 
			return -1;
	}
}
