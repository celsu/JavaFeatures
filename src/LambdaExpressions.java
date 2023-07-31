import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
    //JAVA 8
    //LAMBDA EXPRESSIONS (Interfaces Funcionais (SAM))
    //Pecorrer, Filtrar, Extrair dados de coleçoes
    //Parametro entrada -> Açao a ser feita
        //sem argumentos - [() -> Açao]
        //1 Argumento - [s -> Açao(s)]

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("T1 em execuçao");
        }
    });

    //metodo run nao tem parametro de entrada e somente tem 1 metodo o run
    //sem argumentos - [() -> Açao]
    Thread t2 = new Thread( () -> System.out.println("T2 em execuçao"));






}

class Produto2 {

    private Integer codigo;
    private String nome;
    private Double preco;

    public Produto2(Integer codigo, String nome, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

