public record RecordsEx(double arg1) {
    //JAVA 14
    //Objeto tipo POJO
    //Gera automaticamente contrutor, getter, equal, hascode e toString
    //Nao pode estender ou ser estendido (compilador entende que é classe final)
    //Nao pode ser abstrato
    //Nao pode ter atributos nao staticos
    //todos atributos sao final e privado
    //Pode implementar interface
    //permite metodos staticos

    //JAVA 15 teve mais features
    //Metodos nativos nao podem ser declarados (public native void nomeMetodo())
    //Reflexao (https://www.udemy.com/course/java-avancado-new-features/learn/lecture/37703868#questions)
    //Se tiver uma variavel final, usando Reflexao é possivel mudar o valor, porem com record gera excessao
    //"Controle de heranças"


}
