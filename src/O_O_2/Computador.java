package O_O_2;

/**
 * Escreva a descrição da classe Computador aqui.
 *
 * @author (Guilherme Ajalla + Miguel Bomfanti)
 * @version (número de versão ou data)
 */
public class Computador
{
    private String marca;
    private String cor;
    private String modelo;
    private String numeroSerie;
    private double preco;

    public void getMarca(String marca){
        this.marca = marca;
    }

    public void getCor(String cor){
        this.cor = cor;
    }

    public void getModelo(String modelo){
        this.modelo = modelo;
    }

    public void getNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }

    public void getPreco(double preco){
        this.preco = preco;
    }

    public void Imprimir(){
        System.out.println("------------------------");
        System.out.println(marca);
        System.out.println(cor);
        System.out.println(modelo);
        System.out.println(numeroSerie);
        System.out.println(preco);
        System.out.println("------------------------\n");
    }

    public void calcularValor(){
        if(marca=="HP"){
            preco*=1.35;
        }
        else if(marca=="IBM"){
            preco*=1.5;
        }
    }

    public boolean alterarValor(double valor){
        if(valor>0){
            preco+=valor;
            System.out.println("Alterado!");
            return true;
        }
        System.out.println("\nNão alterado!\n");
        return false;
    }
}
