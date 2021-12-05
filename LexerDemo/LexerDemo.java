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
			
			System.out.println();
			
			while(true) 
			{
				TokenClass token = javaLexer.nextToken();
				System.out.println(token);
				if(token==TokenClass.EOF) break;
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
