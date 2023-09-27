package bufferedstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {
		// word.txt 파일쓰기
		try(Writer writer = new FileWriter("C:/File/word.txt")){
			
			String animal = "ant bear chicken cow eagle "
					+ "elephant horse monkey penguin tiger";
			writer.write(animal);
			writer.flush();
					
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
