package Lab4;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("�����һ������");
		String str = input.next();
		BigInteger number_1 = new BigInteger(str);
		System.out.println("����ڶ�������");
		str = input.next();
		BigInteger number_2 = new BigInteger(str);
		System.out.println("����֮��Ϊ��"+number_1.add(number_2));
		System.out.println("����֮��Ϊ��"+number_1.subtract(number_2));
		System.out.print("��һ�����������У�");
		int j = 0;
		for (BigInteger i = new BigInteger("2"); 1 == number_1.compareTo(i) && j < 10; i=i.add(new BigInteger("1"))) {
			if(number_1.remainder(i).equals(new BigInteger("0"))) {
				System.out.print(i+" ");
				j++;
			}
		}
	}

}
