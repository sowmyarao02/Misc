package Misc;

public class EggAndFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EggAndFloor e = new EggAndFloor();
		System.out.println("Number of Trials - "+e.calcMetrics(3,100));
	}

	public int binomialCoeff(int x, int n, int k) {
		int term=1;
		int sum=0;
		for(int i=1;i<=n && sum<k;++i) {
			term *= x-i+1;
			term/=i;
			sum+=term;
		}
		return sum;
	}
	
	public int calcMetrics(int n, int k) {
		int low=1,high=k;
		while(low<high) {
			int mid = (low+high)/2;
			if(binomialCoeff(mid,n,k)<k) 
				low=mid+1;
			else
				high=mid;	
		}
		return low;
	}
	
}
