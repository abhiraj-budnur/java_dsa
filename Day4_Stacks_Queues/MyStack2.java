package Day4_Stacks_Queues;

import java.util.Stack;

public class MyStack2 {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	void enqueue(int x) {
		while (!s1.empty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		s1.push(x);

		while (!s2.empty()) {
			s1.push(s2.peek());
			s2.pop();
		}
	}

	int dequeue() {
		if (s1.empty()) {
			return -1;
		}
		int x = s1.peek();
		s1.pop();
		return x;
	}

	public static void main(String[] args) {
		MyStack2 q = new MyStack2();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
