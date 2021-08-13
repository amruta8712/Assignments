import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class Que4_FileRead {

	public static void main(String[] args) {
		var path="C:\\Users\\ABC\\Downloads\\Java11Assignments_StudentList.txt";
		File file = new File("C:\\\\Users\\\\ABC\\\\Downloads\\\\Java11Assignments_StudentList.txt");
      
        
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			  
			  String line;
			  System.out.println("-----Reading Data From File-----");
			  while ((line = br.readLine()) != null)
			    System.out.println(line);
			  
			  System.out.println("-----After Removing Whitspace From File-----");
			  Files.lines(new File("C:\\\\Users\\\\ABC\\\\Downloads\\\\Java11Assignments_StudentList.txt").toPath())
			    .map(s -> s.trim())
			 .filter(s -> !s.isEmpty())
			 .forEach(System.out::println);
			  
			  System.out.println("-----Total Count of Students-----"); 
			 Long count= Files.lines(new File("C:\\\\Users\\\\ABC\\\\Downloads\\\\Java11Assignments_StudentList.txt").toPath())
					 .map(s -> s.trim())
					 .filter(s -> !s.isEmpty()).count();
			 
			 System.out.println(count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
