package pp2_EDD;

import java.util.ArrayList;

public class MyStack<Type> implements MyStackInterface<Type> {

	private ArrayList<Type> myList = new ArrayList<Type>();

	public void push(Type item) {
		myList.add(item);
	}

	public Type pop() {
		if (myList.isEmpty()) {
			return null;
		}
		return myList.remove(myList.size() - 1);
	}

	public Type peek() {
		if (myList.isEmpty()) {
			return null;
		}
		return myList.get(myList.size() - 1);
	}

	public boolean empty() {
		return myList.isEmpty();
	}

	public int size() {
		return myList.size();
	}

	public static void main(String[] args) {
		MyStack<Object> myStack = new MyStack<Object>();
	}

}
