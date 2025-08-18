package Day4_Stacks_Queues;

public class MyTwoStacks {

	int[] arr;
	int size;
	int top1,top2;
	
	public MyTwoStacks(int n) {
		size = n;
		arr = new int[n];
		top1 = n/2+1;
		top2 = n/2;
	}
	
	void push1(int x) {
		if(top1<size) {
			arr[top1++]=x;
		}
		else {
			System.out.println("Stack OverFlown for stack 1");
		}
	}
	
	void push2(int x) {
		if(top2>=0) {
			arr[top2--]=x;
		}else {
			System.out.println("Stack OverFlown for stack 2");
		}
	}
	
	int pop1() {
		if(top1>size/2) {
			return arr[--top1];
		}
		else {
			return -1;
		}
	}
	
	int pop2() {
		if(top2<size/2) {
			return arr[++top2];
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		MyTwoStacks mts = new MyTwoStacks(5);
		mts.push1(2);
		mts.push1(3);
		mts.push2(4);
		System.out.println(mts.pop1()+" ");
		System.out.println(mts.pop1()+" ");
		System.out.println(mts.pop2()+" ");
		
	}

}
