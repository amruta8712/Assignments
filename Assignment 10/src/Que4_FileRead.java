import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Que4_FileRead {

	public static void main(String[] args) {
		var path="C:\\Users\\ABC\\Downloads\\Java11Assignments_StudentList.txt";
		int count=0;
		try {
			String data=Files.readString(Path.of(path));
			if(data.isBlank()) {
				System.out.println(data);
				count++;
			}
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
