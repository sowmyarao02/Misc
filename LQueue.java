import java.util.LinkedList;
import java.util.List;

public class LQueue {

	private List<Object> l;

	public LQueue() {
		l = new LinkedList<Object>();		
	}

	public int size() {
		return (l.size());
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else
			return false;
	}

	public Object pop() {
		if (size() > 0) {
			return (l.remove(0));
		}
		return new NullPointerException();
	}

	public void push(Object o) {
		l.add(o);
	}

	public void list() {
		System.out.println();
		for (int i = 0; i < size(); i++) {
			System.out.print(l.get(i)+"  ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {

	LQueue lq = new LQueue();

	lq.push(0);
	lq.push(1);
	lq.push(2);
	lq.push(3);
	lq.push(4);
	lq.push(5);

	lq.list();

	System.out.println("Popped - " + lq.pop());
	System.out.println("Size - " + lq.size());

	System.out.println("Popped - " + lq.pop());
	System.out.println("Size - " + lq.size());

	lq.list();

	}
	
}
