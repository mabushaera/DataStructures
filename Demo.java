package A001;

/**
 * problem: implement the stack by hand, this stack is of fixed size which is by default = 10
 * the stack only accepts integers.
 * if not specified by the user, if specified it will be through the constructor.
 * the user should be able to push, and pop the stack
 * pushing an element when the stack is full will throw an exception. 
 */
public class Demo {
	
	public static void main(String[] args)  {
		Stack stack = new Stack(5);
		try {
			
			boolean isEmpty = stack.isEmpty();
			// check if the stack is empty at the beginning.
			System.out.println("Is Empty: " + isEmpty);
			
			
			stack.push(7);
			stack.printStack();
			stack.pop();
			stack.printStack();
			
			stack.push(3);
			stack.push(3);
			stack.push(3);
			stack.push(3);
			stack.push(3);
			boolean isFull = stack.isFull();
			System.out.println("isFull: "+ isFull);
			stack.printStack();
			
			stack.pop();
			isFull = stack.isFull();
			System.out.println("isFull: "+ isFull);
			stack.printStack();
			
			stack.push(5);
			stack.printStack();
			
			// adding element to exceed the size
			stack.push(7);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			stack.printStack();
			stack.pop();
			stack.printStack();
			stack.pop();
			stack.printStack();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
