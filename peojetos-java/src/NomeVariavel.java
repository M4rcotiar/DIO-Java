public class NomeVariavel {

public static void main(String[] args) {

                    // Declação inválida de variáveis

//int numero&um = 1;      Os únicos símbolos permitidos são _ e $.
//int 1numero = 1;        Uma variável não pode começar com númerico.
//int numero um = 1;      Não pode ter espaço no nome da variável.
//int long = 1;           long faz parte das palavras reservadas da linguagem.

 
                    // Declaração válida de veriáveis

//int numero$um = 1;
//int numero1 = 1;
//int numeroum = 1;
//int longo = 1;
		

                    // Estrutura

//Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

//exemplos

int idade = 23;
double altura = 1.62;
String dog;


    //colocando "final" no começo da varial ela nunca muda!
    final double PI = 3.14;
    final String BR = "Brasil";

    
    //se não colocar "final" ela pode ser mudadda 
    int ano = 2025;
    String mes = "Abril";


   System.out.println(ano + mes);

   System.out.println("Valor de PI = " + PI );

   System.out.println("Meu país é o " + BR);


}



}
