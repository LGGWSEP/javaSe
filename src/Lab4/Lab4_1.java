package Lab4;
import java.util.Scanner;
public class Lab4_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		int x,y;
		System.out.print("������������");
		x = input.nextInt();
		System.out.print("������������");
		y = input.nextInt();
		System.out.print("����������Ԫ�أ�");
		double[][] a = new double[x][y];
		for(int i = 0;i < x;i++){
			for(int j = 0;j < y;j++)
				a[i][j] = input.nextDouble();
		}
		System.out.println("ת�ú�ľ���Ϊ��");
		for(int j = 0;j < y;j++){
			for(int i = 0;i < x;i++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		input.close();
	}

}
