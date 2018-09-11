import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOFWorkersMethods 
{
	public static void PrintList(ArrayList<WorkersForArrayList> list) //печатает список
	{
		try
		{
			System.out.println("Полный список:");
			for (WorkersForArrayList workersForArrayList : list) 
			{
				System.out.println(workersForArrayList.id+") "+workersForArrayList.FIO+", "+workersForArrayList.salary);
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("Пусто!");
		}
		
			
		
	}
	
	public static void CreateAppend(ArrayList<WorkersForArrayList> list,int count) //создаёт и дозаписывает
	{
		Scanner input_ID= new Scanner(System.in);
		Scanner input_FIO= new Scanner(System.in);
		Scanner input_Salary= new Scanner(System.in);
		for (int i=0;i<count;i++) 
		{
			WorkersForArrayList element=new WorkersForArrayList() ;
			System.out.println(i+"- работник: ");
			System.out.println("ID: ");
			try 
            {
            	element.id = Integer.parseInt(input_Salary.nextLine());
            } 
			catch (NumberFormatException e) 
			{
                System.out.println("Невверный ввод! Попробуйте ещё раз: ");
                System.out.print("ID: ");
            	element.id = Integer.parseInt(input_Salary.nextLine());
            }
			System.out.println("ФИО: ");
			element.FIO= input_FIO.nextLine();
			System.out.println("З/П: ");
			try 
            {
            	element.salary = Integer.parseInt(input_Salary.nextLine());
            } 
			catch (NumberFormatException e) 
			{
                System.out.println("Невверный ввод! Попробуйте ещё раз: ");
                System.out.print("З/П: ");
            	element.salary = Integer.parseInt(input_Salary.nextLine());
            }
	        
			
			
			list.add(i, element);
		}
	}
	
	public static void SredSalary(ArrayList<WorkersForArrayList> list)// вычисляет среднюю зарплату
	{
		int sum=0,k=0;
		for (WorkersForArrayList workersForArrayList : list) 
		{
			sum=sum+workersForArrayList.salary;
			k++;
		}
		int sred=sum/k;
		System.out.println(sred+"-средняя зарплата");
		
	}
	
	public static void PrintMinSalary(ArrayList<WorkersForArrayList> list,int minSalary) //показывает сотрудников с з/п выше заданной
	{
		System.out.println("Работники с з/п выше чем: "+minSalary);
		for (WorkersForArrayList workersForArrayList : list) 
		{
			if (workersForArrayList.salary>minSalary)
			{
				System.out.println("ФИО: "+workersForArrayList.FIO+" з/п: "+workersForArrayList.salary);
			}
			else
				System.out.println("Нет работников, у которых з/п выше.");
				
		}
		
	}
	
	public static void ChangeSalary(ArrayList<WorkersForArrayList> list, int surname, int sal) // меняет з/п сотрудников
	{
		
		for (WorkersForArrayList workersForArrayList : list) 
		{
			if (workersForArrayList.id==surname)
				workersForArrayList.salary=sal;
		}  	
	}
	
	public static void DeleteWorker(ArrayList<WorkersForArrayList> list, int ID) // удаляет сотрудника
	{
		
		for (WorkersForArrayList workersForArrayList : list) 
		{
			if (workersForArrayList.id==ID)
			{
				list.remove(workersForArrayList);
			    return;
			}
		}  	
	}

}
