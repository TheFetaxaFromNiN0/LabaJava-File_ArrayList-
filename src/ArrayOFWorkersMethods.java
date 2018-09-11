import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOFWorkersMethods 
{
	public static void PrintList(ArrayList<WorkersForArrayList> list) //�������� ������
	{
		try
		{
			System.out.println("������ ������:");
			for (WorkersForArrayList workersForArrayList : list) 
			{
				System.out.println(workersForArrayList.id+") "+workersForArrayList.FIO+", "+workersForArrayList.salary);
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("�����!");
		}
		
			
		
	}
	
	public static void CreateAppend(ArrayList<WorkersForArrayList> list,int count) //������ � ������������
	{
		Scanner input_ID= new Scanner(System.in);
		Scanner input_FIO= new Scanner(System.in);
		Scanner input_Salary= new Scanner(System.in);
		for (int i=0;i<count;i++) 
		{
			WorkersForArrayList element=new WorkersForArrayList() ;
			System.out.println(i+"- ��������: ");
			System.out.println("ID: ");
			try 
            {
            	element.id = Integer.parseInt(input_Salary.nextLine());
            } 
			catch (NumberFormatException e) 
			{
                System.out.println("��������� ����! ���������� ��� ���: ");
                System.out.print("ID: ");
            	element.id = Integer.parseInt(input_Salary.nextLine());
            }
			System.out.println("���: ");
			element.FIO= input_FIO.nextLine();
			System.out.println("�/�: ");
			try 
            {
            	element.salary = Integer.parseInt(input_Salary.nextLine());
            } 
			catch (NumberFormatException e) 
			{
                System.out.println("��������� ����! ���������� ��� ���: ");
                System.out.print("�/�: ");
            	element.salary = Integer.parseInt(input_Salary.nextLine());
            }
	        
			
			
			list.add(i, element);
		}
	}
	
	public static void SredSalary(ArrayList<WorkersForArrayList> list)// ��������� ������� ��������
	{
		int sum=0,k=0;
		for (WorkersForArrayList workersForArrayList : list) 
		{
			sum=sum+workersForArrayList.salary;
			k++;
		}
		int sred=sum/k;
		System.out.println(sred+"-������� ��������");
		
	}
	
	public static void PrintMinSalary(ArrayList<WorkersForArrayList> list,int minSalary) //���������� ����������� � �/� ���� ��������
	{
		System.out.println("��������� � �/� ���� ���: "+minSalary);
		for (WorkersForArrayList workersForArrayList : list) 
		{
			if (workersForArrayList.salary>minSalary)
			{
				System.out.println("���: "+workersForArrayList.FIO+" �/�: "+workersForArrayList.salary);
			}
			else
				System.out.println("��� ����������, � ������� �/� ����.");
				
		}
		
	}
	
	public static void ChangeSalary(ArrayList<WorkersForArrayList> list, int surname, int sal) // ������ �/� �����������
	{
		
		for (WorkersForArrayList workersForArrayList : list) 
		{
			if (workersForArrayList.id==surname)
				workersForArrayList.salary=sal;
		}  	
	}
	
	public static void DeleteWorker(ArrayList<WorkersForArrayList> list, int ID) // ������� ����������
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
