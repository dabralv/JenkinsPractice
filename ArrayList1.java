import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("ghostx");
		list.add("ghostfreak");
		list.add("cutthroat");
		list.add("ankit");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) //to iterate
		{ 
			System.out.println(itr.next()); 
		}
		System.out.println(list.get(1)); //to get element
		 list.set(1, "GF"); //to set element
		 System.out.println(list.get(1));
		for(String gamers:list) //to iterate
			System.out.println(gamers);
		Collections.sort(list); //to sort list
		for(String gamers:list)
		System.out.println(gamers);
	}

}
