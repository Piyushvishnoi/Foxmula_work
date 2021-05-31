package Assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_occurences {
public static void main(String[] args)
{
	ArrayList <String> al=new ArrayList<String>();
	al.add("first");
	al.add("second");
	al.add("third");
	al.add("fourth");
	al.add("first");
	al.add("fourth");
	al.add("third");
	System.out.println(al);
	Iterator it=al.iterator();
	while(it.hasNext())
	System.out.println(it.next()+": "+Collections.frequency(al,it.next()));
}
}
