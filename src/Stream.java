import java.util.ArrayList;
import java.util.List;

public class Stream {
    //JAVA 8
    //https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
    //https://docs.oracle.com/javase/8/docs/api/?java/lang/StringBuilder.html
    public void metodoStream(){
        // ---- JAVA STREAM (JAVA 8)----
        List<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(new Produto(1000, "Geladeira 470L", 2999.00));
        listaProdutos.add(new Produto(2000, "TV UHD 50''", 3500.00));
        listaProdutos.add(new Produto(1001, "TV UHD 65''", 5000.00));
        listaProdutos.add(new Produto(3000, "Microondas 20L", 399.00));
        listaProdutos.add(new Produto(1001, "Geladeira 120L", 900.00));
        listaProdutos.add(new Produto(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
        listaProdutos.add(new Produto(1002, "Geladeira 500L", 3100.00));

        //Cria lista só de geladeiras SEM STREAM
        List<Produto> listaGeladeiras = new ArrayList<Produto>();
        for(Produto p : listaProdutos) {
            if(p.getNome().contains("Geladeira")) {
                listaGeladeiras.add(p);
            }
        }

        //Listar usando lambda
        listaGeladeiras.forEach((p) -> System.out.println(p.getNome()));

        //Cria lista só de geladeiras USANDO STREAM
        listaProdutos.stream()
                //Interface Predicate - filtrar os nomes dos produtos que contém 'Geladeira'
                //takeWhile = Filtra até nao satifazer a oondiçao
                //dropWhile = Ao contratio de takeWhile
                //substituir e verificar o funcionamento
                .filter(p -> p.getNome().contains("Geladeira"))
                //Interface Comparator - ordenar o preço em ordem crescente de acordo com a implemetação da classe OrdenaProdutoPorPreco
                .sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
                //Interface Function - aplicar uma dada função (toUpperCase) aos elementos dessa stream
                .map(p -> p.getNome()+" - "+p.getPreco())
                //Interface Consumer - percorrer cada elemento da stream e exibi-los no console
                .forEach(System.out::println);
    }
}

class Produto {

    private Integer codigo;
    private String nome;
    private Double preco;

    public Produto(Integer codigo, String nome, Double preco) {
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
