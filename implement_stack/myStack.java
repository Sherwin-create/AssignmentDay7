package implement_stack;

public class myStack {
	
	public static void main(String args[]) {
		Operations s = new Operations();
		s.push(20);
		s.push(100);
		s.push(125);
		System.out.println("the element which is popped "+s.pop());
		System.out.println("the top element in the stack "+s.peek());
	}
}

class Operations {
	int max = 20;
	int[] data = new int[max];
	int top = -1;
	
	public void push(int element) {
		data[top+1] = element;
		top++;
	}
	
	public int pop(){
		int temp = data[top];
		top--;
		return temp;
	}
	
	public int peek(){
		return data[top];
	}
}



