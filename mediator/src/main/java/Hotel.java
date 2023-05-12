public abstract class Hotel implements Andar {
    private static Hotel instancia = new Hotel() {
        @Override
        public String receberAndar(String mensagem) {
            return null;
        }

        @Override
        public String receberNumero(String mensagem) {
            return null;
        }
    };

    private Hotel() {}

    public static Hotel getInstancia() {
        return instancia;
    }

    public String receberAndar(String mensagem) {
        return "O seu andar é: " + mensagem;
    }

    public String receberNumero(String mensagem) {
        return "O seu número de identificação é: " + mensagem;
    }

    public String receberPergunta(String mensagem) {
        return "A sua pergunta é: " + mensagem;
    }
}
