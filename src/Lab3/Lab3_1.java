package Lab3;
import java.util.Scanner;
public class Lab3_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	
	//����
		//�ַ����鸳ֵ
		char[] a1 = {'a','b','c','d','e','f','g'};
		String str2=new String(a1);
		
		//�ַ������Ȼ�ȡ����λ���ٻ�ȡ����
		char[] a2 = {'a','b','c','d','e','f','g'};
		str2=new String(a2,2,4);
		
		//ֱ��String��ֵ
		String str1 = "abcdefg";
		
		//���ø�ֵ
		str2 = "abcdefg";
		
		System.out.println("�����ַ���str1Ϊabcdefg");
		System.out.println("�������ַ���str1��");
		Scanner input_String_new = new Scanner(System.in);
		str1 = input_String_new.next();
		
	//��ȡ����length
		int length = str1.length();
		System.out.println(str1+"�ĳ����ǣ�"+length);
		
	//����index of
		char index_char;
		int index1;
		Scanner input_char = new Scanner(System.in);
		while(true){
			System.out.println("����str1����Ҫ�������ַ���");
			index_char = input_char.next().charAt(0);
			index1 = str1.indexOf(index_char);
			if(index1==-1)
				System.err.println("�Ҳ������ַ���");
			else
				break;
		}
		System.out.println(str1+"��"+index_char+"������λ���ǣ�"+index1);
		
		String index_String;
		int index2;
		Scanner input_String = new Scanner(System.in);
		while(true){
			System.out.println("����str1����Ҫ�������ַ�����");
			index_String = input_String.next();
			index2 = str1.indexOf(index_String);
			if(index2==-1)
				System.err.println("�Ҳ������ַ�����");
			else
				break;
		}
		System.out.println(str1+"��"+index_String+"�����鿪ʼλ���ǣ�"+index2);
		
	//�����ַ�charAt
		int index_number;
		Scanner input_number;
		while(true){
			System.out.println("����str1����Ҫ���������������ţ�");
			input_number = new Scanner(System.in);
			index_number = input_number.nextInt();
			if(index_number>str1.length()-1||index_number<0)
				System.err.println("�������!");
			else
				break;
		}
		char mychar = str1.charAt(index_number);
		System.out.println("�ַ���str1����λ��Ϊ"+index_number+"���ַ�Ϊ��"+mychar);
		
	//��ȡ�Ӵ�substring
		int index_sub;
		Scanner input_sub;
		while(true){
			System.out.println("����str1�������Ż�ȡ�Ӵ���ĩβ��");
			input_sub = new Scanner(System.in);
			index_sub = input_sub.nextInt();
			if(index_sub>str1.length()-1||index_sub<0)
				System.err.println("�������!");
			else
				break;
		}
		String sub = str1.substring(index_sub);
		System.out.println("�ַ���str1�д�������"+index_sub+"��ȡ�Ӵ���ĩβ���ַ���Ϊ��"+sub);
		
		int index_sub1;
		int index_sub2;
		Scanner input_sub1;
		while(true){
			System.out.println("����str1�������Ż�ȡ�Ӵ���ĩβ��");
			input_sub1 = new Scanner(System.in);
			index_sub1 = input_sub1.nextInt();
			index_sub2 = input_sub1.nextInt();
			if(index_sub2>str1.length()-1||index_sub1<0||index_sub1>=index_sub2)
				System.err.println("�������!");
			else
				break;
		}
		String sub1 = str1.substring(index_sub1,index_sub2);
		System.out.println("�ַ���str1�д�������"+index_sub1+"��"+index_sub2+"��ȡ�Ӵ���ĩβ���ַ���Ϊ��"+sub1);
		
	//ȥ���ո�trim
		System.out.println("����trim��ȥ���ַ���str1�еĿո�");
		Scanner trim_String = new Scanner(System.in);
		String trim = "0";
		while(trim != "trim") {
			System.err.println("�������!");
			trim = trim_String.next();
		}
		System.out.println("ȥ���ո����ַ���str1Ϊ"+str1.trim());
		System.out.println("ȥ���ո����ַ���str1����Ϊ"+str1.trim().length());
		
	//�滻replace
		System.out.println("������Ҫ�ַ���str1�б��滻���ַ���");
		Scanner String_char = new Scanner(System.in);
		String replace1 = String_char.next();
		System.out.println("������Ҫ�ַ���str1���滻���ַ���");
		String replace2 = String_char.next();
		while(true) {
			if (str1.indexOf(replace1)==-1)
				System.err.println("�Ҳ������ַ��������������룡");
			else
				break;
		}
		System.out.println("�滻����ַ���str1Ϊ"+str1.replace(replace1,replace2));
		
	//���equal
		System.out.println("�����µ��ַ���str2�ж���str1�Ƿ�һ�£�");
		str2 = input_String.next();
		if(str1.equals(str2))
			System.out.println("str1��str2һ�£�");
		else
			System.out.println("str1��str2��һ�£�");
		
	//�Ƚ�compareTo
		System.out.println("�����µ��ַ���str2�ж���str1��һ���ֵ����ǰ��");
		str2 = input_String.next();
		if(str1.compareTo(str2) == 1)
			System.out.println("str2��str1�ֵ����ǰ��");
		else
			System.out.println("str1��str2�ֵ����ǰ��");
		
	//�ָ�split
		System.out.println("����ָ��ַ���str1�ķָ�����");
		String array = input_char.next();
		String[] Array = str1.split(array);
		for(String a : Array)
			System.out.print(a+" ");
		System.out.println();
		
		input_String_new.close();
		input_char.close();
		input_String.close();
		input_number.close();
		input_sub.close();
		input_sub1.close();
		trim_String.close();
		String_char.close();
	}
}

