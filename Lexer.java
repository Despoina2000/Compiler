import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lexer implements ILexer {

	private static Scanner in;
	private static final Map<String,TokenClass> tokens = new HashMap<>();
	
	static 
	{
		for (TokenClass tokenclass : TokenClass.values())
			tokens.put(tokenclass.getLexme(), tokenclass);
	}
	
	@Override
	public TokenClass nextToken() {

		return null;
	}
	
	Pattern pettern = Pattern.compile("(\\s+|^.?)"+
									  "|--|-|\\+\\+|\\+|>=|>|<=|<|==|=|!=|!|\\bif\\b|\\b\\belse\\b|\\bwhile\\b|\\bfor\\b"+
									  "|([a-zA-Z]\\w*)|(\\d+)"+
									  "|.");

	public Lexer(File inputString) throws FileNotFoundException 
	{
		in = new Scanner(inputString);
	}
	
}
