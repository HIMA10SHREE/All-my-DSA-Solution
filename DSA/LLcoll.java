import java.util.*;
class LLcoll{
	public static void main(String[] args){
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(2);
		list.addFirst(1);
		list.add(3);
		list.addFirst(8);
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(2,8);
		System.out.println(list);

		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"->");
		}
		System.out.println("null");

	}
}