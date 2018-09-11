import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable {
	static ArrayList<WorkersForArrayList> Workers= new ArrayList<>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		System.out.println("Введите любое число (не ноль)...");
		Integer menu=readInt();
		while (menu!=0)
		{
			System.out.println("1)Создать/Дозаписать список;\r\n2) Записать в файл;\r\n3)Прочитать из файла; ");
			System.out.println("4)Показать список;\r\n5)Узнать средню з/п;\r\n6)У кого з/п выше заданной;\r\n7)Найти по фамилии\r\n8)Изменить з/п ");
			System.out.println("8)Удалить сотрудника;\r\n9)Очистить Лист;");
			Integer pointOfMenu=readInt();
			switch(pointOfMenu)
			{
			case 1:
				System.out.println("Cколько человек хотите внести в список?");
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
				System.out.println("Введите минимальную з/п: ");
				Integer m=readInt();
				ArrayOFWorkersMethods.PrintMinSalary(Workers, m);
				break;
			case 7:
				System.out.println("Введите ID, по которой хотите найти: ");
				Scanner input=new Scanner(System.in);
				int surname;
				surname=readInt();
				System.out.println("Введите новую з/п: ");
				Integer s=readInt();
				ArrayOFWorkersMethods.ChangeSalary(Workers, surname, s);
				break;
			case 8:
				System.out.println("Введите ID, по которой хотите найти: ");
				int id;
				id=readInt();
				ArrayOFWorkersMethods.DeleteWorker(Workers, id);
				break;
			case 9:
				Workers.clear();
				break;
			default :
	            System.out.println("Ничего не выбрали");
	            break;
			}
				
			System.out.println("Введите любое число...");
			menu=readInt();
		}
		System.out.println("До свидания");
		
		
	}
	
	public static Integer readInt() //проверка на верный ввод
	{
		Scanner input_start=new Scanner(System.in);
		Integer choice_met=null;
		while (true)
		{
            try 
            {
            	choice_met = Integer.parseInt(input_start.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Невверный ввод!");       
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
