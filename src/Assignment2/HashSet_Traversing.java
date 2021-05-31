package Assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSet_Traversing {
public static void main(String[] args)
{ // with HashSet
	System.out.println("Using HashSet");
	HashSet <String> hs=new HashSet<String>();
	hs.add("Tata");
	hs.add("Reliance");
	hs.add("Adani");
	hs.add("Bharati Airtel");
	System.out.println(hs);
	Iterator it=hs.iterator();
	while(it.hasNext())
	 System.out.println(it.next());
	
	//with TreeSet
	TreeSet <String> ts=new TreeSet<String>();
	ts.add("ITC");
	ts.add("Paytm");
	ts.add("UPI");
	ts.add("GooglePay");
	System.out.println("Using TreeSet");
	System.out.println(ts);
	Iterator itnew=ts.iterator();
	while(itnew.hasNext())
	 System.out.println(itnew.next());
}
}
