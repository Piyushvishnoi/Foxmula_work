package Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class program2_set {
	public static boolean contain(Set <String> al,String word)
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
	Set <String> obj=new HashSet<String>(); 
	obj.add("Adidas");
	obj.add("Nike");
	obj.add("puma");
	obj.add("Yonex");
	Iterator it=obj.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	System.out.println("Nike is present in the list: "+obj.contains("Nike"));
	if(contain(obj,"Asics"))
	{
		System.out.println("Asics is present in the list");
	}
	else
		System.out.println("Asics is not present in the list");
		
}
}
