public class Esportista extends Pessoa{

    private int idFederacao;

    //Construtores
    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    //metodo
    public String sacar(){
        return "Saque viagem...";
    }
}
