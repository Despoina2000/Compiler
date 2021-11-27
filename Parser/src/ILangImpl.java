import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ILangImpl implements ILang {
	
	Deque<String> stack;
	
	ILangImpl(String[] stack)
	{
		this.stack = new LinkedList<>(Arrays.asList(stack));
	}

	@Override
	public void S() {
		String token = stack.pop();
		System.out.println(token);
		String nextToken;
		
		switch(token) 
		{
		case "if":
			E();S();
			nextToken = stack.pop();
			System.out.println(nextToken);
			if (nextToken.equals("else")) {S();}
			break;
			
		case "{": S();
		nextToken = stack.pop();
		System.out.println(nextToken);
		if (!nextToken.equals("}")) {System.out.println("Error : / } expected");}
		break;
		
		case "System.out.print(\"":
			E();
			nextToken = stack.pop();
			System.out.println(nextToken);
			if (!nextToken.equals("\");")) {System.out.println("Error / \") expected");}
			break;
		default:
			System.out.println("Error / if or {expected}");

		}
		
	}

	@Override
	public void E() {
		String token = stack.pop();
		System.out.println(token);
		if (token.equals("(")) 
		{
			token = stack.pop();
			System.out.println(token);
			
			if (token.matches("\\d+")) 
			{
				token = stack.pop();
				System.out.println(token);
				
				if (token.equals("==")) 
				{
					token = stack.pop();
					System.out.println(token);
					
					if (token.matches("\\d+")) 
					{
						token = stack.pop();
						System.out.println(token);
						
						if (token.equals(")")) 
						{
							return;
						}
						else 
						{
							System.out.println("Error closing )");
						}

					} else { System.out.println("Error - Second num");}
				} else { System.out.println("Error ==");}
			} else { System.out.println("Error - First num");}
			
		}else { System.out.println("Error Opening (");}

		
		
		
	}

	@Override
	public boolean isEmptyStack() {
		
		try 
		{
			stack.pop();
			return false;
		}
		catch (NoSuchElementException e) 
		{
			return true;
		}
	
	}

}
