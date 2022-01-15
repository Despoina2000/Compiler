all: clean sablecc compile run

clean:
	rm -rf minipython

sablecc:
	./sablecc minipython.grammar

compile:
	javac ASTTest1.java

run:
	java ASTTest1 example.py

.PHONY: all sablecc
