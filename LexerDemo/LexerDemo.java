import java.io.File;
import java.io.FileNotFoundException;

public class LexerDemo {

	public static void main(String[] args) throws FileNotFoundException
	{
		File inputstring = new File ("input.txt");
		ILexer javaLexer;
		
		try 
		{
			javaLexer = new Lexer(inputstring);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
