//package java. Collections;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetExample 
{
public static void main(String args[])
{
HashSet<String> set=new HashSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Ravi");
set.add("Ajay");
java.util.Iterator<String> itr= set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}