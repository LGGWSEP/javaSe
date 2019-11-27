package Lab10;

import java.util.*;

public class Lab10_3 {
	private String id;
	private String name;
	public Lab10_3(String id,String name){
		this.id = id;
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		Lab10_3 emp1 = new Lab10_3("351", "����");
		Lab10_3 emp2 = new Lab10_3("512", "����");
		Lab10_3 emp3 = new Lab10_3("853", "��һ");
		Lab10_3 emp4 = new Lab10_3("125", "����");
		Lab10_3 emp5 = new Lab10_3("341", "����");
		
		map.put(emp4.getId(), emp4.getName());
		map.put(emp5.getId(), emp5.getName());
		map.put(emp1.getId(), emp1.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
		while (it.hasNext()) {
			String str = (String)it.next();
			String name = (String)map.get(str);
			System.out.println(str+" "+name);
			
		}
		
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.putAll(map);
		Iterator<String> iter = treemap.keySet().iterator();
		System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������");
		while (iter.hasNext()) {
			String str = (String) iter.next();
			String name = (String) treemap.get(str);
			System.out.println(str+" "+name);
		}
	}
	

}
