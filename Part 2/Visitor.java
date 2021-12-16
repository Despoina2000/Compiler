import minipython.analysis.*;
import minipython.node.*;
import java.util.*;

public class Visitor extends DepthFirstAdapter {
    private Hashtable symtable;	

	Visitor(Hashtable symtable) 
	{
		this.symtable = symtable;
	}
@Override
	public void inAFunctionCall(AFunctionCall node) 
	{
		String fName = node.getId().toString();
		int line = ((TId) node.getId()).getLine();
		if (symtable.containsKey(fName))
		{
			System.out.println("Line " + line + ": " +" Function " + fName +" is already defined");
		}
		else
		{
			symtable.put(fName, node);
		}
	}
}