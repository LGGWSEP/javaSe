package Lab2;
import java.util.Scanner;
class member{
	
	private String usename;
	private String name;
	private String code;
	private float money;
	
	member(){
		usename="default";
		name="default";
		code="default";
		money=0;
	}
	member(String usename,String name,String code,float money){
		this.usename=usename;
		this.name=name;
		this.code=code;
		this.money=money;
	}
	
	public void set_usename(String usename){//�޸��û���
		this.usename=usename;
	}
	public void set_name(String name){//�޸�����
		this.name=name;
	}
	public void set_code(){//�޸�����
		System.out.println("����������룺");
		Scanner input1=new Scanner(System.in);
		String code=input1.next();
		
		if(code.equals(this.code)){
			System.out.println("�����������룺");
			Scanner input2=new Scanner(System.in);
			this.code=input2.next();
			System.out.println("�޸ĳɹ���");
		}
		else
			System.err.println("�������");
	}
	public void check_money(){
		System.out.println("��ǰ���Ϊ��"+this.money);
	}
	
	public void add_money(float money){//���
		this.money+=money;
		System.out.println("��ǰ���Ϊ:"+this.money);
	}
	public void sub_money(float money){//ȡ��
		if(this.money-money<0)
			System.out.println("û����ô��Ǯ��");
		else {
			this.money-=money;
			System.out.println("��ǰ���Ϊ:"+this.money);
		}
	}
}
public class Lab2_4 {
	public static void main(String[] args) {
		//Ҫ���ܹ�����û����˺š�������������˻����ȸ�����Ϣ
		//��������ȡ���ѯ�����޸��˻�����Ȳ���
		//���ô��ഴ�����󣬶�����˺�Ϊ100������ΪTom������Ϊ11111���˻����Ϊ10000
		member people=new member("100","Tom","111111",10000);
		System.out.println("��ǰ�˺�Ϊ:100");
		System.out.println("��ǰ����Ϊ:Tom");
		System.out.println("��ǰ����Ϊ��******");
		System.out.println("��ǰ���Ϊ:10000");
		boolean bool=true;
		while(bool){
			System.out.println("��������룺add");
			System.out.println("ȡ�������룺sub");
			System.out.println("��ѯ��������룺check_money");
			System.out.println("�޸��˻����������룺set_code");
			Scanner input=new Scanner(System.in);
			String order=input.next();
			if(order.equals("add")){
				System.out.println("��������Ҫ����Ĵ�");
				input=new Scanner(System.in);
				Float x=input.nextFloat();
				people.add_money(x);
				System.out.println();
			}
			else if(order.equals("sub")){
				System.out.println("��������Ҫȡ���Ĵ�");
				input=new Scanner(System.in);
				Float x=input.nextFloat();
				people.sub_money(x);
				System.out.println();
			}
			else if(order.equals("check_money")) {
				people.check_money();
				System.out.println();
			}
			else if(order.equals("set_code")){
				people.set_code();
				System.out.println();
			}
			else {
				System.out.println("����������ָ�");
				System.out.println();
			}
		}
	}

}
