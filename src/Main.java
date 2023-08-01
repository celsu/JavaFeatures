import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        //Stream se = new Stream();se.metodoStream();

        //LambdaExpressions la = new LambdaExpressions();
        //la.t1.start();
        //la.t2.start();

        //Lambda 1 Argumento - [s -> Açao(s)]
        /*List<Produto2> listaProdutos2 = new ArrayList<Produto2>();
        listaProdutos2.add(new Produto2(1000, "Geladeira 470L", 2999.00));
        listaProdutos2.add(new Produto2(1000, "Geladeira 470L", 2999.00));
        listaProdutos2.add(new Produto2(1000, "Geladeira 470L", 2999.00));
        listaProdutos2.forEach((p) -> System.out.println(p.getNome()));*/

        //Lambda 2 Argumento - [x, y -> x+y]

        RecordsEx re = new RecordsEx(8);
        System.out.println(re.arg1());




    }

}