package abc.in;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str1=s.next();
	String str2=s.next();
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	char ch1[]=str1.toCharArray();
	char ch2[]=str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	String a=new String(ch1);
	String b=new String(ch2);
	if(a.equals(b))
	{
		System.out.println("Anagrams");
	}
	else
	{
		System.out.println("Not Anagrams");
	}
}
}
