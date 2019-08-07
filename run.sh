#!/bin/bash
antlr4 MiniC.g4
javac *.javac
javac MiniC*.java
cat $1 | grun MiniC prog # $1 is program name