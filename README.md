# ContaTerminal.java
Explicação do código:

Importação da classe Scanner:

import java.util.Scanner; é necessário para usar a classe Scanner, que permite a leitura de dados inseridos pelo usuário via terminal.
Método main:

public static void main(String[] args) é o ponto de entrada do programa Java.
Instanciando o Scanner:

Scanner scanner = new Scanner(System.in); cria um objeto Scanner que lê dados do input padrão (teclado).
Solicitação e leitura dos dados:

Para cada atributo (número da conta, agência, nome do cliente e saldo), o programa solicita ao usuário que insira a informação e então lê essa informação usando os métodos apropriados do Scanner (nextInt(), next(), nextLine(), nextDouble()).
Construção e exibição da mensagem final:

A mensagem final é construída concatenando as informações lidas com strings fixas.
String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."; cria a mensagem.
System.out.println(mensagem); exibe a mensagem no terminal.
Fechando o Scanner:

scanner.close(); fecha o objeto Scanner, liberando os recursos associados a ele.
