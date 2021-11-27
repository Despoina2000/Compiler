
public class RecursiveDescentParser {
	
	public static void main(String[] args) 
	{
		String[] tokens = {"if","(","5","==","5",")",
				"System.out.print(\"","(","5","==","5",")","\");",
				"else","System.out.print(\"","(","8","==","8",")","\");"};
		ILang lang = new ILangImpl(tokens);
		lang.S();
		
		if (lang.isEmptyStack()) 
		{
			System.out.println("Success!");
		}
	}

}
