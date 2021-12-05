import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lexer implements ILexer {

	private static Scanner in;
	private static final Map<String,TokenClass> tokens = new HashMap<>();
	
	Pattern pattern = Pattern.compile("(\\s+|^.?)"+
			  "|--|-|\\+\\+|\\+|>=|>|<=|<|==|=|!=|!|\\bif\\b|\\b\\belse\\b|\\bwhile\\b|\\bfor\\b"+
			  "|([a-zA-Z]\\w*)|(\\d+)"+
			  "|.");
	
	static 
	{
		for (TokenClass tokenclass : TokenClass.values())
			tokens.put(tokenclass.getLexme(), tokenclass);
	}
	
	@Override
	public TokenClass nextToken() {

		String matcher = in.findWithinHorizon(pattern, 0);
		String lexeme;
		
		if (matcher == null) 
		{
			return TokenClass.EOF;
		}
		else 
		{
			lexeme = in.match().group(0);
			
			if (in.match().group(1) != null)
			{
				return nextToken();
			}
			
			else if (in.match().group(2) != null)
			{
				return TokenClass.ID;
			}
			
			else if (in.match().group(3) != null)
			{
				return TokenClass.NUM;
			}
			
			TokenClass token = tokens.get(lexeme);
			return (token == null) ? TokenClass.ERROR : token;
		}
	}
	


	public Lexer(File inputString) throws FileNotFoundException 
	{
		in = new Scanner(inputString);
	}
	
}
