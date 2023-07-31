import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

                    // ---- JAVA STREAM ----
        List<Produto> listaProdutos = new ArrayList<Produto>();

        listaProdutos.add(new Produto(1000, "Geladeira 470L", 2999.00));
        listaProdutos.add(new Produto(2000, "TV UHD 50''", 3500.00));
        listaProdutos.add(new Produto(1001, "TV UHD 65''", 5000.00));
        listaProdutos.add(new Produto(3000, "Microondas 20L", 399.00));
        listaProdutos.add(new Produto(1001, "Geladeira 120L", 900.00));
        listaProdutos.add(new Produto(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
        listaProdutos.add(new Produto(1002, "Geladeira 500L", 3100.00));

        //Cria lista só de geladeiras
        List<Produto> listaGeladeiras = new ArrayList<Produto>();
        for(Produto p : listaProdutos) {
            if(p.getNome().contains("Geladeira")) {
                listaGeladeiras.add(p);
            }
        }

        listaProdutos.stream()
                //Interface Predicate - filtrar os nomes dos produtos que contém 'Geladeira'
                .filter(p -> p.getNome().contains("Geladeira"))
                //Interface Comparator - ordenar o preço em ordem crescente de acordo com a implemetação da classe OrdenaProdutoPorPreco
                .sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
                //Interface Function - aplicar uma dada função (toUpperCase) aos elementos dessa stream
                .map(p -> p.getNome()+" - "+p.getPreco())
                //Interface Consumer - percorrer cada elemento da stream e exibi-los no console
                .forEach(System.out::println);
    }

}