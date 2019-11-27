package Lab7;
import java.util.Scanner;

class ScoreException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5082943630952899319L;

	public ScoreException(String ErrorMessage){
		super(ErrorMessage);
	}
}
public class Lab7_1 {
	static void ScoreInput(int n) throws ScoreException{
		if (n > 100 || n < 0) {
			throw new ScoreException("ScoreException�쳣��");
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		System.out.println("����һ��0~100�����֣�");
		try {
			ScoreInput(cin.nextInt());
		} catch (ScoreException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println(e);
		}
		cin.close();
	}
}
