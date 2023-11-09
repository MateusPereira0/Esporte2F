public class Main {
    public static void main(String[] args) {
       Pessoa qualquer = new Pessoa();
        qualquer.setNome("Rebeca Andrade");
         System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
         jogadora.setNome("Taissa do Volei");
          System.out.println(jogadora.getNome());

        Esportista surfista = new Esportista();
        surfista.setNome("Medina");
        System.out.println(surfista.getNome());

        String resultado = qualquer.sacar();
        System.out.println(resultado);

        //Esportista sacando
        resultado = jogadora.sacar();
        System.out.println(resultado);
    }
 }