/* Questao 35.2::. Escreva  um  método  recursivo  e  estático  que  receba  um  número
  inteiro   positivo  N  e  calcule  o  somatório  dos  números  de  1  a  N */
package Exercer10;
public class Somatorio {
    public static int somatorio(int num) {
  if (num == 1) {
      return 1;
  }
  return num + somatorio(num-1);
    }

}
/* Somatorio ::
5 = 5 + 4 + 3 + 2 + 1 (somatorio 4)
4 = 4 + 3 + 2 + 1 (somatorio 3)
3 = 3 + 2 + 1 (somatorio 2)
2 = 2 + 1 (somatorio 1)
1 = 1

 */
