package Lab3;
import java.util.Scanner;
import java.util.Random;

class Dice{
	public int point;
	public int money;
	public Dice() {
		point = 0;
		money = 10000;
	}
	public void throw_point() {
		Random random = new Random();
		this.point = 0;
		for (int i = 0; i < 3; i++) {
			this.point += 1 + random.nextInt(5);
		}
	}
	public String confirm_point() {
		String confirm;
		if(this.point >= 10)
			confirm = "��";
		else
			confirm = "С";
		return confirm;
	}
}


public class Lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice loser = new Dice();
		System.out.println("����10000��ң������롰�󡱻�С����ʼͶע�����롰�����ˡ��˳���Ϸ��");
		Scanner input = new Scanner(System.in);
		String x;
		while(true){
			x = input.next();
			if(x.equals("��") || x.equals("С")){
				loser.throw_point();
				if(x.equals(loser.confirm_point())){
					loser.money += 800;
					System.out.println("��ϲ�㣡���+800����ǰ���Ϊ" + loser.money);
				}
				else{
					loser.money -= 1000;
					System.out.println("���ź������-1000����ǰ���Ϊ" + loser.money);
				}
				continue;
			}
			else if (x.equals("������"))
				break;
			else
				System.err.println("���������룡");
		}
		System.out.println("��Ϸ��������ǰ���Ϊ" + loser.money);
		input.close();
	}

}
