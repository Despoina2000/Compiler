# Compiler 
## Part 1
We implemented the requested BNF file in the .grammar file and created examples in the .py file
so that we check the correctness through the tree.
The .java files are the same as those used in the second workshop.
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
