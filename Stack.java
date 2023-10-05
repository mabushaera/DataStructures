package A001;

public class Stack {
	int arr[];
	int top = 0;
	int size;
	
	public Stack() {
		this.size = 10;
		arr = new int[this.size];
	}
	public Stack(int size) {
		this.size = size;
		arr = new int[this.size];
	}
	
	public void push(int value) throws Exception {
		if(!this.isFull()) {
			arr[top] = value;
			top++;
		}else {
			throw new Exception("stack is full!");
		}
	}
	
	public int pop() throws Exception {
		if(!this.isEmpty()) {
			top--;
			int val =  arr[top];
			arr[top] =0;
			return val;
		}else {
			throw new Exception("satck is empty!");
		}
	}
	
	public boolean isFull() {
		return this.top  == this.size;
	}
	
	public boolean isEmpty() {
		return this.top == 0;
	}
	
	public void printStack() {
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}

}
