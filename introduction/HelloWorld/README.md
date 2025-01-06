# Hello World

Este tutorial fornece um passo a passo detalhado de como compilar e executar um programa Java utilizando o `javac` (compilador Java) e o comando `java` para execução. Vamos criar um exemplo simples chamado `HelloWorld.java`.

## Pré-requisitos

- **Java Development Kit (JDK)** instalado.
  - Certifique-se de que o comando `javac` está disponível no terminal.
  - Para verificar, execute o comando abaixo no terminal:
    ```bash
    javac -version
    ```
  - Se você não tem o JDK instalado, [baixe aqui](https://www.oracle.com/java/technologies/javase-jdk-downloads.html).

---

## Passo 1: Criar o arquivo-fonte Java

1. Abra um editor de texto e crie um novo arquivo chamado `HelloWorld.java`.
2. Adicione o seguinte código no arquivo:

   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Olá, Mundo!");
       }
   }
   ```

3. Salve o arquivo na pasta desejada.

---

## Passo 2: Compilar o programa Java

1. Abra o terminal ou prompt de comando e navegue até o diretório onde o arquivo `HelloWorld.java` foi salvo.

   ```bash
   cd /caminho/para/seu/arquivo
   ```

2. Execute o seguinte comando para compilar o arquivo:

   ```bash
   javac HelloWorld.java
   ```

3. Após a execução do comando, um novo arquivo chamado `HelloWorld.class` será criado no mesmo diretório. Este arquivo contém o bytecode que a JVM (Java Virtual Machine) executará.

---

## Passo 3: Executar o programa compilado

1. Ainda no terminal, execute o seguinte comando para rodar o programa:

   ```bash
   java HelloWorld
   ```

2. Se tudo estiver correto, você verá a seguinte saída no terminal:

   ```bash
   Olá, Mundo!
   ```

---

## Solução de problemas

- **Erro: `javac` não é reconhecido como um comando interno**  
  Certifique-se de que o JDK está instalado corretamente e que a variável de ambiente `PATH` inclui o diretório `bin` do JDK.

- **Erro: Arquivo `.class` não encontrado ao executar o comando `java`**  
  Certifique-se de que você está executando o comando `java` no mesmo diretório onde o arquivo `.class` foi gerado.

---

## Referências

- [Documentação Oficial Java](https://dev.java/)
- [Baixar JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html)
