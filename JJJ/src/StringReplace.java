
public class StringReplace
{
	public String replace(String str, int index, char replace)
	{     
	    if(str==null)
	    {
	        return str;
	    }
	    else if(index<0 || index>=str.length())
	    {
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}
	public static void main(String args[])
	{
		StringReplace r=new StringReplace();
		r.replace("JenitaMary", 7, ' ');
	}

}
