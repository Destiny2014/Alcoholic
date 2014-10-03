import java.util.Scanner;


public class Live 
{
	public static String otv;
	public static String da="да";
	public static String no="нет";
	public static Scanner in = new Scanner(System.in);
	
	public void trezv1()	
	{
		System.out.println ("Есть ли напитки?");
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
				drink();
		else if(otv.equals(no)) 
			trezv2();
	}
	
	

	public void trezv2()	
	{
		System.out.println ("Есть ли деньги?");
		otv=in.nextLine();
		try{
			if(otv!=da || otv!=no)
				throw new Exception();
		}
		catch(Exception e){
			System.out.println("Введи да или нет");
			otv=in.nextLine();
		}
		if(otv.equals(da))		{
			System.out.println ("Пойти купить.Купил?");
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
				drink();
			else if(otv.equals(no))
				trezv2();
		}
		else if(otv.equals(no))		
		{
			System.out.println ("Пойти побираться. Много собрал?");
			otv=in.nextLine();
			try{
				if(otv!=da || otv!=no)
					throw new Exception();
			}
			catch(Exception e){
				System.out.println("Введи да или нет");
				otv=in.nextLine();
			}
			if(otv.equals(da))			{
				System.out.println ("Пойти купить.Купил?");
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
					drink();
				else if(otv.equals(no))
					trezv2();
			}
			else if(otv.equals(no))
				apteka();
		}
	}

	public void apteka()
	{
		System.out.println ("Пойти в аптеку, купить боярышник.Купил?");
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
				drink();
		else if(otv.equals(no))
			apteka();
	}

	public void notrezv()
	{
		System.out.println ("Уверен?");
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
		{
			System.out.println ("Подумать о смысле жизни.Подумал?");
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
				drink();
			else if(otv.equals(no))
				trezv1();
		}
		else if(otv.equals(no))
			trezv1();
		
	}

	public void drink()
	{
		System.out.println ("Напиться.Напился?");
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
		{
			System.out.println ("Уснуть во дворе.Проснулся?");
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
			{
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
					trezv1();
				else if(otv.equals(no))
					notrezv();
			}
			else if(otv.equals(no))
				System.out.println ("Умер");	
		}
		else if(otv.equals(no))
			trezv1();
	}
	
	
}
