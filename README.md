# Compilador da Linguagem MiniC

## Integrantes do grupo:

-   Daniel Escudero - 11005716
-   Bruno Massunaga - 11003216
-   Eduarda Meirinhos - 11076516

#### Este projeto é um transpilador da linguagem MiniC para C.

## Instruções para execução e teste:

É fundamental que a estrutura do repositório esteja da seguinte forma:

    |_ run.sh
    |_ arquivoDeEntrada.miniC
    |_ MiniCCompiler
    	|_ MiniC.g4
    	|_ CompileMiniC.java
    	|_ MiniCTranspilerListener.java

A dependência do projeto é o ANTLR4, que deve ser previamente instalado da seguinte forma:

    $ cd /usr/local/lib
    $ curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar

É importante que o ANTLR seja instalado na pasta `/usr/local/lib`. Caso contrário, será necessário alterar o script `run.sh` para incluir a localização correta. Na pasta do projeto, abra um terminal e execute o script shell `run.sh` da seguinte forma:

    $ chmod +x run.sh
    $ ./run.sh arquivoDeEntrada.miniC

O arquivo em linguagem C transpilado se chama `output.c`, e deverá estar na pasta do projeto. Esse arquivo pode ser compilado e executado normalmente.

## Sobre a linguagem MiniC

A gramática está definida no arquivo `MiniC.g4`, na sintaxe do ANTLR4.

Um programa deve começar com a palavra chave 'programa', e terminar com a palavra chave 'fimPrograma'.
Depois da inicialização do prorama, deve ter a declaração de variáveis. As variáveis podem ser do tipo int ou float. A declaração deve ter o tipo da variável seguido do nome das variáveis separado por vírgula.
Com as variáveis declaradas, o programa pode seguir para os comandos. Os comandos disponíveis são `escreva`, `leia`, designar valor a uma variável, estruturas condicionais (com as palavras chave `se` e `senao`), e estruturas de repetição (`enquanto` e `faca ___ enquanto`).
A linguagem não tem suporte a comentários no código.
Os programas de exemplo mostram a sintaxe da linguagem:
ex01.minic - Ola mundo
ex02.minic - Dado dois numeros do teclado, decide qual deles e maior
ex03.minic - Le numeros do teclado ate que um numero negativo seja digitado
