
public enum TokenClass {
	
	IF("if");

	private final String lexme;

	private TokenClass(String s) {this.lexme = s;}
	
	public String getLexme() {return this.lexme;}
}


