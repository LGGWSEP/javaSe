package Lab10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Alist = new ArrayList<String>();														//����ArrayList
		List<String> Llist = new LinkedList<String>();														//����LinkedList
		Iterator<String> Aiterator = Alist.iterator();														//����ArrayList������
		Iterator<String> Literator = Llist.iterator();														//����LinkedList������
		
		long AAddstartTime = System.currentTimeMillis();													//��¼ArrayList����ǰʱ��
		for (int i = 0; i < 200000; i++) {
			Alist.add("A");																					//ArrayList����20w������
		}
		long AAddendTime = System.currentTimeMillis();														//��¼ArrayList�����ʱ��
		
		long ARemovestartTime = System.currentTimeMillis();													//��¼ArrayListɾ��ǰʱ��
		while (Aiterator.hasNext()) {	
			Alist.remove(0);																				//ArrayListɾ��20w������
		}
		long ARemoveendTime = System.currentTimeMillis();													//��¼ArrayListɾ����ʱ��
		
		long LAddstartTime = System.currentTimeMillis();													//��¼LinkedList����ǰʱ��
		for (int i = 0; i < 200000; i++) {	
			Llist.add("A");																					//LinkedList����20w������
		}
		long LAddendTime = System.currentTimeMillis();														//��¼LinkedList�����ʱ��
		
		long LRemovestartTime = System.currentTimeMillis();													//��¼LinkedListɾ��ǰʱ��
		while (Literator.hasNext()) {
			Llist.remove(0);																				//LinkedListɾ��20w������
		}
		long LRemoveendTime = System.currentTimeMillis();													//��¼LinkedListɾ����ʱ��
		
		System.out.println("ArrayList����20w����ʱ��Ϊ��"+(AAddendTime-AAddstartTime));							//����ArrayList����ʱ��
		System.out.println("ArrayListɾ��20w����ʱ��Ϊ��"+(ARemoveendTime-ARemovestartTime));						//����ArrayListɾ��ʱ��
		System.out.println("LrrayList����20w����ʱ��Ϊ��"+(LAddendTime-LAddstartTime));							//����LinkedList����ʱ��
		System.out.println("LrrayListɾ��20w����ʱ��Ϊ��"+(LRemoveendTime-LRemovestartTime));						//����LinkedListɾ��ʱ��
	}

}
