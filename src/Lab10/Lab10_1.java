package Lab10;

import java.util.*;

public class Lab10_1{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List<String> list = new ArrayList<>();
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
					'o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0; i < a.length; i++){
			list.add(String.valueOf(a[i]));
		}
		System.out.println("����add��ʼ����ַ�");
		System.out.println("����delete��ʼɾ���ַ�");
		System.out.println("����quit�˳�����");
		Scanner cin = new Scanner(System.in);
		String str = cin.next();
		String s = "";
		while(!str.equals("quit")){
			if(str.equals("add")){
				System.out.println("������Ҫ��ӵ��ַ�");
				Boolean flag = false;
				s = cin.next();
				while(s.length()>1){
					System.err.println("����ӦΪ�ַ������������룡");
					System.out.println("������Ҫ��ӵ��ַ�");
					s = cin.next();
				}
				for(String e : list){
					if(e.equals(s)){
						System.out.println("�б������д��ַ�");
						flag = true;
					}
				}
				if(!flag){
					list.add(s);
					System.out.println("��ӳɹ�");
				}
			}
			else if(str.equals("delete")){
				System.out.println("������Ҫɾ�����ַ�");
				Boolean flag = false;
				s = cin.next();
				while(s.length()>1){
					System.err.println("����ӦΪ�ַ������������룡");
					System.out.println("������Ҫɾ�����ַ�");
					s = cin.next();
				}
				for(int i = 0; i < list.size(); i++){
					if(list.get(i).equals(s)){
						list.remove(i);
						flag = !flag;
						break;
					}
				}
				if(flag){
					System.out.println("�Ƴ��ɹ�");
				}
				else{
					System.out.println("�б����޴��ַ����޷�ɾ��");
				}
			}
			else if(str.equals("quit")){
				break;
			}
			else{
				System.err.println("����������������룡");
			}
			System.out.println("����add��ʼ�����ĸ");
			System.out.println("����delete��ʼɾ����ĸ");
			System.out.println("����quit�˳�����");
			str = cin.next();
		}
		System.out.println("����ر�");
		cin.close();
	}

}
