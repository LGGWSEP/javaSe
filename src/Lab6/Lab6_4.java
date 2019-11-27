package Lab6;
import java.util.Scanner;
class MyException extends Exception{
	public MyException(String ErrorMessage){
		super(ErrorMessage);
	}
}

class Student{
	public void speak(int m)throws MyException{
		if (m > 1000) {
			throw new MyException("����1000�ˣ�");
		}
	}
}

public class Lab6_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			Scanner cin = new Scanner(System.in);
			Student a = new Student();
			int x = cin.nextInt();
			a.speak(x);
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
