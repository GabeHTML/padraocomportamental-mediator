public class Recepcionista {
    private static Recepcionista instancia = new Recepcionista();

    private Recepcionista() {}

    public static Recepcionista getInstancia() {
        return instancia;
    }

    public String receberAndarHotel(String mensagem) {
        return "Seu andar será revisado.\n"+
                "O hotel respondeu conforme a mensagem a seguir.\n" +
                ">>" + Hotel.getInstancia().receberAndar(mensagem);
    }

    public String receberNumeroHotel(String mensagem) {
        return "Seu número será revisado.\n"+
                "O hotel respondeu conforme a mensagem a seguir.\n" +
                ">>" + Hotel.getInstancia().receberNumero(mensagem);
    }

    public String receberPerguntaHotel(String mensagem) {
        return "Sua pergunta será revisada.\n"+
                "O hotel respondeu conforme a mensagem a seguir.\n" +
                ">>" + Hotel.getInstancia().receberPergunta(mensagem);
    }

}
