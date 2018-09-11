import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ForFileClass implements Serializable
{
	public static void InFile(ArrayList<WorkersForArrayList> list)  throws IOException // запись в файл
	{
		  FileOutputStream fos = new FileOutputStream("list.out");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(list);
		  oos.flush();
		  oos.close();
	}
	
	public static void FromFile(ArrayList<WorkersForArrayList> list) throws IOException, ClassNotFoundException // чтение из файла 
	{
		  FileInputStream fis = new FileInputStream("list.out");
		  ObjectInputStream oin = new ObjectInputStream(fis);
		  ArrayList<WorkersForArrayList> list_copy = (ArrayList<WorkersForArrayList>) oin.readObject();
		  for (WorkersForArrayList workersForArrayList : list_copy) 
			{
				list.add(workersForArrayList);
			}
		}

}
