package Lab2;
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;//���Ŀ���
		int i = 0;//����ѭ��
		int count_up = 0;//��������
		int count_up_max = 0;//�����������
		int count_up_max_position = 0;//���������λ��
		int count_down = 0;//�ݼ�����
		int count_down_max = 0;//�ݼ��������
		int count_down_max_position = 0;//�ݼ��������λ��
		
	//��������
		System.out.print("���������:");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
	//��������
		int[] tree_height=new int[n];
		System.out.println("�������ĸ߶ȣ�");
		for(i = 0;i < n;i++)
			tree_height[i] = input.nextInt();
		
	//��������
		for(i = 0;i < n-1;i++){
			if(tree_height[i] < tree_height[i+1])
				count_up++;
			else
				count_up = 0;
			if(count_up > count_up_max){
				count_up_max = count_up;
				count_up_max_position = i-count_up_max+1;
			}
		}
		
	//��������
		for(i = 0;i < n-1;i++){
			if(tree_height[i] > tree_height[i+1])
				count_down++;
			else
				count_down = 0;
			if(count_down > count_down_max) {
				count_down_max = count_down;
				count_down_max_position = i-count_down_max+1;
			}
		}
		
	//λ����Ҫ������������+1
		count_up_max++;
		count_down_max++;
		
	//���
		System.out.print("( ");
		for(i = count_up_max_position;i < count_up_max_position+count_up_max;i++) 
			System.out.print(tree_height[i] + " ");
		System.out.print(")");
		System.out.println("��" + count_up_max + "�����߶���������");
		
		System.out.print("( ");
		for(i = count_down_max_position;i < count_down_max_position+count_down_max;i++) 
			System.out.print(tree_height[i] + " ");
		System.out.print(")");
		System.out.println("��" + count_down_max + "�����߶���������");
		
		input.close();
	}

}