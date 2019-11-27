package Lab5;
import java.util.*;

class Rectangle{
	Rectangle(){
		length = 0;
		width = 0;
	}
	Rectangle(double a,double b){
		if(a > b){
			length = a;
			width = b;
		}
		else{
			length = b;
			width = a;
		}
	}
	public void set_length(double length){
		this.length = length;
	}
	public void set_width(double width){
		this.width = width;
	}
	public double get_length(){
		return length;
	}
	public double get_width(){
		return width;
	}
	public double area(){
		return length*width;
	}
	private double length,width;
}

public class Lab5_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Rectangle a = new Rectangle();
		Scanner cin = new Scanner(System.in);
		System.out.println("���þ��γ��ȣ�");
		a.set_length(cin.nextDouble());
		System.out.println("���þ��ο�ȣ�");
		a.set_width(cin.nextDouble());
		System.out.println("���γ���Ϊ��"+a.get_length());
		System.out.println("���ο��Ϊ��"+a.get_width());
		System.out.println("�������Ϊ��"+a.area());
		cin.close();
	}

}
