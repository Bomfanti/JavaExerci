package O_O_2;
/*
https://www.devmedia.com.br/metodos-atributos-e-classes-no-java/25404  Código desse site.
 */
public class Conta_Instancias {
    private int tamanho;
    private static int conta = 0; //IMPRIME A CONTAGEM DE 4 VALORES
    //private int conta = 0; //IMPRIME A CONTAGEM DE 1 VALOR

    public Conta_Instancias(){
        conta++;
        System.out.println("Valor = "+conta);
    }

    public static void main(String[] args) {
        Conta_Instancias c = new Conta_Instancias();

        Conta_Instancias dois = new Conta_Instancias();
        Conta_Instancias tres = new Conta_Instancias();
        Conta_Instancias quatro = new Conta_Instancias();
    }
}