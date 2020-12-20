package stackAndList;

import java.util.Stack;

// 如何仅用递归函数和栈操作逆序一个栈

public class Stack2List {
	
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		System.out.println(stack);
		if(stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			System.out.println(last);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//System.out.println("_stackList11"+ stack);
		
		int _stackList = Stack2List.getAndRemoveLastElement(stack);
		System.out.println("-----");
		System.out.println(_stackList);
		int _stackList1 = Stack2List.getAndRemoveLastElement(stack);
		System.out.println("-----");
		System.out.println(_stackList1);
		int _stackList2 = Stack2List.getAndRemoveLastElement(stack);
		System.out.println("-----");
		System.out.println(_stackList2);
		
//		Stack2List.reverse(stack);
//		System.out.println("-----");
//		Stack2List.reverse(stack);
//		System.out.println("-----");
//		Stack2List.reverse(stack);
//		System.out.println("-----");

	}

}
