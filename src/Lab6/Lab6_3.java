package Lab6;

public class Lab6_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			int num = 8/0;
			System.out.println(num);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("over");
	}

}
