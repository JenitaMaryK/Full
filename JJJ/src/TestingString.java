
// Hemavathy_12/8/2017_Difference Between String, StringBuilder, StringBuffer
public class TestingString {
public int value = 10000;
public String funcofstring()
{
String s3="0";
long starttime= System.currentTimeMillis();
for(int i=0;i<=value;i++)
{

String s1="Hello";
String s2=" Java Programers";
s3=s1.concat(s2);
// System.out.println(s3);
}
long stoptime=System.currentTimeMillis();	
long total=starttime-stoptime;
System.out.println("Time Taken for String to complete the operations "+total+" ms");
return s3;
}
public StringBuilder funcofstringbuilder()
{
StringBuilder sb1 = new StringBuilder("Hello");
long starttime= System.currentTimeMillis();
for(int i=0;i<=value;i++)
{

StringBuilder sb3=sb1.append("Java Programs");
}
long stoptime=System.currentTimeMillis();
long total=starttime-stoptime;
System.out.println("Time Taken for StringBuilder to complete the operations "+total+" ms");
return null;
}
public StringBuffer funcofstringbuffer()
{
StringBuffer sbu1=new StringBuffer("Hello");
long starttime= System.currentTimeMillis();
for(int i=0;i<=value;i++)
{

StringBuffer sbu3=sbu1.append("Java Programs");
}
long stoptime=System.currentTimeMillis();
long total=starttime-stoptime;
System.out.println("Time Taken for StringBuffer to complete the operations "+total+" ms");
return sbu1;
}

}