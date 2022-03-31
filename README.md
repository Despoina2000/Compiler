# Compiler 
The purpose of the project is to implement a compiler for the miniPython language.

## Part 1
We implemented the requested BNF file in the .grammar file and created examples in the .py file
so that we check the correctness through the tree.
The .java files are the same as those used in the second workshop.

- Lexical analysis of the miniPython language.
- Syntax analysis of the miniPython language.

**Run:**
```
sablecc minipython.grammar
javac ParserTest1.java
javac ParserTest2.java
java ParserTest2 example.py
```
Τhe tree will be created by the example.py, which covers the
most cases. The example.py does not contain a check for complex use of and, or and not,
because we have had difficulty in implementing them in the grammar archive.

## Part 2
We implemented the AST in the .grammar file. The purpose of AST is to create a simpler and easy-to-use tree to help us later in debugging the code.

- Abstract Syntax Tree of the miniPython language.
- Symbols Table - Semantic Analysis of the miniPython language. (Cooming soon)

**Run:**
```
sablecc minipython.grammar
javac ASTTest1.java
javac ASTPrinter.java
java ASTTest1 example.py
```
## Team Members
- [Fiona Trimi](https://github.com/fionatrimi)
- [Despoina Papadopoulou](https://github.com/Despoina2000)
