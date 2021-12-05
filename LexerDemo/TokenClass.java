public enum TokenClass {
	
	IF("if"),ELSE("else"),WHILE("while"),FOR("for"),LPAREN("("),
	RPAREN(")"),LBRACE("{"),RBRACE("}"),SEMI(";"),GTEQ(">="),LTEQ("<="),
	GT(">"),LT("<"),PLUS("+"),PLUSPLUS("++"),MINUS("-"),MINUSMINUS("--"),
	STAR("*"),SLASH("/"),ASSIGN("="),NEQ("!="),BANG("!"),EQUALS("=="),
	ID(null),NUM(null),EOF(null),ERROR(null);

	private final String lexme;

	private TokenClass(String s) {this.lexme = s;}
	
	public String getLexme() {return this.lexme;}
}


