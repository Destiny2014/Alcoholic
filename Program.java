
import java.util.Scanner;

public class Program 
{	
	public static String otv;
	public static String da="да";
	public static String no="нет";
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Live live=new Live();	
		System.out.println ("Трезвый?"); 
		otv=in.nextLine();
		try{
			if(otv!=da || otv!=no)
				throw new Exception();
		}
		catch(Exception e){
			System.out.println("Введи да или нет");
			otv=in.nextLine();
		}
		if(otv.equals(da))
		live.trezv1();
		else if(otv.equals(no))
		{
			live.notrezv();
		}
	}
}

