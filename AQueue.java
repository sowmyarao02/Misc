import java.util.Arrays;

public class AQueue {
	Object[] a;
	int cur;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AQueue a = new AQueue(10);
		a.push(new Integer(0));
		a.push(new Integer(1));
		a.push(new Integer(2));
		a.push(new Integer(3));
		a.push(new Integer(4));
		a.push(new Integer(5));
		a.push(new Integer(6));
		a.push(new Integer(7));
		a.push(new Integer(8));
		
		a.list();
		a.pop();
		a.list();
		a.pop();
		a.list();
		a.push(9);
		a.list();
		
	}
	
	public AQueue(int MAX_SIZE) {
		a = new Object[MAX_SIZE];
		cur=0;
	}
	
	public int size() {
		return a.length;
	}
	
	public void list() {
		System.out.println("The elements of the array are :- ");
		for(int i=0;i<cur;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public void push(Object o) {
		a[cur]=o;
		cur++;
	}
	
	public Object pop() {
		System.out.println("Popped");
		Object ret = a[0];
		for(int i=1;i<=cur;i++) {
			a[i-1]=a[i];
		}
		cur--;
		return ret;
	}
	
	public boolean isEmpty() {
		if(cur==0) 
			return true;
		else
			return false;
	}
	

}
