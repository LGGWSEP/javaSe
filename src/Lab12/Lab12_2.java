package Lab12;

public class Lab12_2 extends Thread{
	static Thread test1 = new Thread(new Runnable(){
		public void run(){
			int count = 0;
			while(true){
				count++;
				try{
					System.out.println("1���߳��������У���ǰʱ����"+System.nanoTime()+"����");
				}catch(Exception e){
					e.printStackTrace();
				}
				if(count > 100)
					break;
			}
		}
	});
	static Thread test2 = new Thread(new Runnable(){
		public void run(){
			int count = 0;
			while(true){
				count++;
				try{
					System.out.println("2���߳��������У���ǰʱ����"+System.nanoTime()+"����");
				}catch(Exception e){
					e.printStackTrace();
				}
				if(count > 100)
					break;
			}
		}
	});
	static Thread test3 = new Thread(new Runnable(){
		public void run(){
			int count = 0;
			while(true){
				count++;
				try{
					System.out.println("3���߳��������У���ǰʱ����"+System.nanoTime()+"����");
				}catch(Exception e){
					e.printStackTrace();
				}
				if(count > 100)
					break;
			}
		}
	});
	static Thread test4 = new Thread(new Runnable(){
		public void run(){
			int count = 0;
			while(true){
				count++;
				try{
					System.out.println("4���߳��������У���ǰʱ����"+System.nanoTime()+"����");
				}catch(Exception e){
					e.printStackTrace();
				}
				if(count > 100)
					break;
			}
		}
	});
	static Thread test5 = new Thread(new Runnable(){
		public void run(){
			int count = 0;
			while(true){
				count++;
				try{
					System.out.println("5���߳��������У���ǰʱ����"+System.nanoTime()+"����");
				}catch(Exception e){
					e.printStackTrace();
				}
				if(count > 100)
					break;
			}
		}
	});
	public static void main(String[] args) {
		new Lab12_2();
		Lab12_2.test1.start();
		Lab12_2.test2.start();
		Lab12_2.test3.start();
		Lab12_2.test4.start();
		Lab12_2.test5.start();
	}

}
