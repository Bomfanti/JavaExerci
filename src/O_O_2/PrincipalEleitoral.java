package O_O_2;


/**
 * Escreva a descrição da classe PrincipalEleitoral aqui.
 *
 * @author (Guilherme Ajalla + Miguel Bomfanti)
 * @version (número de versão ou data)
 */
public class PrincipalEleitoral
{
    public static void main(String[] args){
        int valor;
        Eleitoral []elet = new Eleitoral[3];

        elet[0] = new Eleitoral();
        elet[0].setNome("Guilherme");
        elet[0].setIdade(24);

        elet[1] = new Eleitoral();
        elet[1].setNome("Rebeca");
        elet[1].setIdade(11);

        elet[2] = new Eleitoral();
        elet[2].setNome("Vozinho");
        elet[2].setIdade(76);

        for (valor=0; valor<3; valor++){
            elet[valor].Imprimir();
        }
    }
}

