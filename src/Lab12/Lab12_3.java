package Lab12;

public class Lab12_3 extends Thread{
	private static Thread t;
	private static Thread s;
	Lab12_3(){
		t = new Thread(new Runnable(){
			public void run(){
				while(true){
					System.out.println("�߳�t����");
					System.out.println("�߳�t��ʼ����1s");
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("�߳�t���߽���");
					System.out.println("��һ���߳�s����");
					try{
						s.start();
						s.join();
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("��һ���߳�s����");
					System.out.println("�߳�t�ж�");
					break;
				}
			}
		});
		t.start();
		s = new Thread(new Runnable(){
			public void run(){
				while(true){
					System.out.println("�߳�s����");
					System.out.println("�߳�s��ʼ����1s");
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("�߳�s���߽���");
					break;
				}
			}
		});
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Lab12_3();
	}

}
