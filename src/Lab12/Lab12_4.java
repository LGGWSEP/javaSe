package Lab12;

import java.util.*;

public class Lab12_4 {
	private static Thread producer;
	private static Thread consumer;
	Stack<Integer> st = new Stack<Integer>();
	public Lab12_4() {
		producer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					if (st.size() <= 10) {
						System.out.println("����������");
						st.push(new Random().nextInt());
					}
				}
			}
		});
		consumer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					if (st.empty() != true) {
						System.out.println("������ȡ����"+st.pop());
					}
				}
			}
		});
		producer.start();
		consumer.start();
	}
	public static void main(String[] args) {
		new Lab12_4();
	}

}
