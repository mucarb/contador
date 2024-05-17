import java.util.Locale;
import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o primeiro número: ");
    int primeiroParametro = scan.nextInt();
    System.out.println("Digite o segundo número: ");
    int segundoParametro = scan.nextInt();

    try {
      contar(primeiroParametro, segundoParametro);
    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
    scan.close();
  }

  static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

    if (primeiroParametro > segundoParametro) {
      /*
       * caso a condição seja verdadeira, a conição sera ativadada
       * interrompendo o restante das instruções da função
       */
      throw new ParametrosInvalidosException();
    }
    int contagem = segundoParametro - primeiroParametro;

    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }

}
