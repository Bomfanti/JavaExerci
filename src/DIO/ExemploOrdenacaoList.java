package DIO;

/*
Aula Collections da DIO.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Champs> meusChamps = new ArrayList<>(){{
            add(new Champs("Qiyanna", 19, "Assassina"));
            add(new Champs("Fizz", 897, "Peixe Assassino"));
            add(new Champs("Kassadin", 72, "Assassino com problemas respiratórios"));
            add(new Champs("Zed", 38, "Assassino com Sombra"));
            add(new Champs("Syndra", 38, "Mago"));

        }};
        meusChamps.sort(Comparator.comparing(Champs::getNome));


        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusChamps);
        System.out.println(meusChamps);

        System.out.println("--\tOrdem Idade\t---");
        meusChamps.sort(new ComparatorIdade());
        System.out.println(meusChamps);

        System.out.println("--\tOrdem funcao\t---");
        meusChamps.sort(new ComparatorFuncao());
        System.out.println(meusChamps);

    }
}

class Champs implements Comparable<Champs>{
    private String nome;
    private Integer idade;
    private String funcao;

    public Champs(String nome, Integer idade, String funcao) {
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return
                "\nnome='" + nome + '\'' + "\nidade=" + idade + "\nfuncao='" + funcao + "\n";
    }

    @Override
    public int compareTo(Champs champs) {
        return this.getNome().compareToIgnoreCase(champs.getNome());
    }
}

class ComparatorIdade implements Comparator<Champs> {
    @Override
    public int compare(Champs g1, Champs g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorFuncao implements Comparator<Champs> {

    @Override
    public int compare(Champs g1, Champs g2) {
        return g1.getFuncao().compareToIgnoreCase(g2.getFuncao());
    }
}
