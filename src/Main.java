import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable {
	static ArrayList<WorkersForArrayList> Workers= new ArrayList<>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		System.out.println("������� ����� ����� (�� ����)...");
		Integer menu=readInt();
		while (menu!=0)
		{
			System.out.println("1)�������/���������� ������;\r\n2) �������� � ����;\r\n3)��������� �� �����; ");
			System.out.println("4)�������� ������;\r\n5)������ ������ �/�;\r\n6)� ���� �/� ���� ��������;\r\n7)����� �� �������\r\n8)�������� �/� ");
			System.out.println("8)������� ����������;\r\n9)�������� ����;");
			Integer pointOfMenu=readInt();
			switch(pointOfMenu)
			{
			case 1:
				System.out.println("C������ ������� ������ ������ � ������?");
				Integer n=readInt();
				ArrayOFWorkersMethods.CreateAppend(Workers, n);
				break;
			case 2:
				ForFileClass.InFile(Workers);
				break;
				
			case 3:
				ForFileClass.FromFile(Workers);
				break;
				
			case 4: ArrayOFWorkersMethods.PrintList(Workers);
			break;
			case 5: ArrayOFWorkersMethods.SredSalary(Workers);
			break;
			case 6: 
				System.out.println("������� ����������� �/�: ");
				Integer m=readInt();
				ArrayOFWorkersMethods.PrintMinSalary(Workers, m);
				break;
			case 7:
				System.out.println("������� ID, �� ������� ������ �����: ");
				Scanner input=new Scanner(System.in);
				int surname;
				surname=readInt();
				System.out.println("������� ����� �/�: ");
				Integer s=readInt();
				ArrayOFWorkersMethods.ChangeSalary(Workers, surname, s);
				break;
			case 8:
				System.out.println("������� ID, �� ������� ������ �����: ");
				int id;
				id=readInt();
				ArrayOFWorkersMethods.DeleteWorker(Workers, id);
				break;
			case 9:
				Workers.clear();
				break;
			default :
	            System.out.println("������ �� �������");
	            break;
			}
				
			System.out.println("������� ����� �����...");
			menu=readInt();
		}
		System.out.println("�� ��������");
		
		
	}
	
	public static Integer readInt() //�������� �� ������ ����
	{
		Scanner input_start=new Scanner(System.in);
		Integer choice_met=null;
		while (true)
		{
            try 
            {
            	choice_met = Integer.parseInt(input_start.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("��������� ����!");       
            }
            
            return choice_met;
		}
        
	}
	
	public static void ClearScr()
	{
		for(int clear = 0; clear < 1000; clear++)
		  {
		     System.out.println("") ;
		  }
	}
	
	

}
