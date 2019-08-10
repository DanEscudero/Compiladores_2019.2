#!/bin/sh

CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'

antlr4 ./MiniCCompiler/MiniC.g4
javac ./MiniCCompiler/*.java
cd MiniCCompiler
java CompileMiniC "../"$1
cd ..