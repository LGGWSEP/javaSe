package Lab2;
import java.util.Scanner;
public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] normal_year=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};//��ͨ��
		int[] special_year=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};//����
		
		int i=0;
		int year=0;
		int month=0;
		int date=0;
		int day=0;
		
		System.out.print("���������:");
		Scanner input1 = new Scanner(System.in);
		year=input1.nextInt();
		input1.close();
		
		System.out.print("�������·�:");
		Scanner input2 = new Scanner(System.in);
		month=input2.nextInt();
		input2.close();
		
		System.out.print("����������:");
		Scanner input3 = new Scanner(System.in);
		date=input3.nextInt();
		input3.close();
		
		if(year%400==0||year%4==0&&year%100!=0){//����
			for(i=0;i<month-1;i++){
				day+=special_year[i];
			}
			day+=date;
		}
		else{//��ͨ��
			for(i=0;i<month-1;i++){
				day+=normal_year[i];
			}
			day+=date;
		}
		
		System.out.println("�ж���һ������һ��ĵ�"+day+"��");
	}

}
