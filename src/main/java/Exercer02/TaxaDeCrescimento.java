package Exercer02;


/*Questao 17.4; Suponha que a populaçao de um pais A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a população de B
seja 20 000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
que calcule e escreva o numero de anos necessarios para que a populaçao do pais.A ultrapasse ou igual a populaçao do pais
B, mantidas as taxas de crescimentos.
 */
public class TaxaDeCrescimento {
    public static void main (String[] args){
        //Scanner scan = new Scanner(System.in);
        int popA = 80000;
        int popB = 200000;
        int cont = 0;
// cont = 0; inicia a contagem a partir do zero;

        while (popA < popB) {
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
    }
    System.out.println("Populaçao A: " +popA);
    System.out.println("Populaçao B: " +popB);
        System.out.println("Qtd anos:  "+cont);

    }

}


