package Lab5;
import java.util.*;
import java.lang.Math;
interface Type{
	void Area();
	void Circumference();
}

class Circle implements Type{
	Circle(){
		radius = 0;
		System.out.println("������һ��Բ��");
	}
	final double P = 3.14;
	public double radius;
	public void Area(){
		System.out.println("Բ������ǣ�"+P*radius*radius);
	}
	public void Circumference(){
		System.out.println("Բ���ܳ��ǣ�"+P*radius*2);
	}
	public void set_radius(double radius){
		this.radius = radius;
	}
}

class Triangle implements Type{
	Triangle(){
		a = 0;
		b = 0;
		c = 0;
		System.out.println("������һ�������Σ�");
	}
	public double a;
	public double b;
	public double c;
	public void Area(){
		double p = (a+b+c)/2;
		System.out.println("�����ε�����ǣ�"+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
	public void Circumference(){
		System.out.println("�����ε��ܳ��ǣ�"+(a+b+c));
	}
}

class Rectangl implements Type{
	Rectangl(){
		length = 0;
		width = 0;
		System.out.println("������һ�����Σ�");
	}
	public double length;
	public double width;
	public void Area(){
		System.out.println("���ε�����ǣ�"+length*width);
	}
	public void Circumference(){
		System.out.println("���ε��ܳ��ǣ�"+(length*2+width*2));
	}
}

public class Lab5_5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangl rectangl = new Rectangl();
		String numString = "[1-9]\\d*[.]*\\d*";
		Double sum = 0.0;
		
		System.out.println();
		System.out.print("������Բ�İ뾶��");
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("���������룡");
			}
		}
		circle.radius = sum;
		
		System.out.print("�����������ε������ߣ�");
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("���������룡");
			}
		}
		triangle.a = sum;
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("���������룡");
			}
		}
		triangle.b = sum;
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("���������룡");
			}
		}
		triangle.c = sum;
		
		System.out.print("��������εĳ��Ϳ�");
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("���������룡");
			}
		}
		rectangl.length = sum;
		while(true){
			String aString = cin.next();
			if (aString.matches(numString)) {
				sum = Double.parseDouble(aString);
				break;
			}
			else {
				System.err.println("���������룡");
			}
		}
		rectangl.width = sum;
		
		circle.Area();
		circle.Circumference();
		triangle.Area();
		triangle.Circumference();
		rectangl.Area();
		rectangl.Circumference();
		
		cin.close();
	}

}
