package O_O_2;


/**
 * Escreva a descrição da classe Eleitoral aqui.
 *
 * @author (Guilherme Ajalla + Miguel Bomfanti)
 * @version (número de versão ou data)
 */
public class Eleitoral
{
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void Imprimir(){
        System.out.println("-----------------------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("\n");
        Verificar();
    }

    public void Verificar(){
        if(idade<16){
            System.out.println("O eleitor não pode votar.");
        }
        else if(idade<=65){
            System.out.println("O eleitor deve votar!");
        }
        else{
            System.out.println("Voto facultativo!");
        }
    }
}

