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

    //1 Argumento - [s -> Açao(s)]


}
