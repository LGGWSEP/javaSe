package Lab5;

abstract class door{
	door(){
		System.out.println("����һ����");
	}
	public void open(){}
	public void close(){}
}

interface alarm{
	void alarming();
}

class AlarmDoor extends door implements alarm{
	AlarmDoor(){
		System.out.println("�̳���door�࣬Ҳʵ����alarm�ӿڡ�");
	}
	public void open(){
		System.out.println("OPEN!");
	}
	public void close(){
		System.out.println("CLOSE!");
	}
	public void alarming(){
		System.out.println("Ringringring~");
	}
}

public class Lab5_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		AlarmDoor a = new AlarmDoor();
		a.open();
		a.close();
		a.alarming();
	}

}
