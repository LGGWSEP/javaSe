package Lab4;
import java.util.Random;
public class Lab4_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random random = new Random();
		int count_1 = 0;
		int count_2 = 0;
		int count_3 = 0;
		int count_4 = 0;
		int count_5 = 0;
		int count_6 = 0;
		for(int i = 0;i < 100000;i++){
			int s = 1 + random.nextInt(6);
			switch(s){
			case 1:count_1++;break;
			case 2:count_2++;break;
			case 3:count_3++;break;
			case 4:count_4++;break;
			case 5:count_5++;break;
			case 6:count_6++;break;
			}
		}
		int big = count_4 + count_5 + count_6;
		int small = count_1 + count_2 + count_3;
		System.out.println("1�ĸ�����:"+count_1);
		System.out.println("2�ĸ�����:"+count_2);
		System.out.println("3�ĸ�����:"+count_3);
		System.out.println("4�ĸ�����:"+count_4);
		System.out.println("5�ĸ�����:"+count_5);
		System.out.println("6�ĸ�����:"+count_6);
		System.out.println("��ĸ�����:"+big);
		System.out.println("С�ĸ�����:"+small);
	}

}
