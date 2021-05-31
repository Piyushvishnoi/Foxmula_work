package Assignment2;
import java.util.ArrayList;
import java.util.*; 
import java.util.Iterator;

public class Program_1_Arraylist {
	public static boolean contain(ArrayList <String> al,String word)
	{
		System.out.println(al);
		Iterator itnew=al.iterator (); 
		while(itnew.hasNext())
			{
			if(itnew.next()==word)
					{
				return true;
					}
			}
		return false;
			
	}
public static void main(String[] args)
{
	ArrayList<String>al=new ArrayList<String>();
	al.add("I");
	al.add("love");
	al.add("my");
	al.add("India");
	System.out.println(al);
	Iterator it=al.iterator (); 
	while(it.hasNext())
		System.out.print(it.next() + " ");
	System.out.println("Checking element is in list or not using contain() function");
System.out.println(al.contains("India"));
System.out.println("Checking element is in list or not using iterator");
if(contain(al,"love"))
{
	System.out.println("love is a word in the above arrayList");
}
else
	System.out.println("love is not a word in the above arrayList");
}
}
