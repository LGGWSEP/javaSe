package Lab3;
import java.util.Scanner;
public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moddle = "[^0]\\d{4,10}";
		Scanner input_String;
		while(true) {
			System.out.println("������QQ�ţ�");
			input_String = new Scanner(System.in);
			String str = input_String.next();
			if(str.matches(moddle)) {
				System.out.println("����ȷ��QQ�ţ�");
				break;
			}
			else
				System.err.println("������ȷ��QQ�ţ�");
		}
		input_String.close();
	}

}
