public class Pessoa {
    public String receberAndarHotel(String mensagem) {
        return Hotel.getInstancia().receberAndar(mensagem);
    }

    public String receberNumeroHotel(String mensagem) {
        return Hotel.getInstancia().receberNumero(mensagem);
    }

    public String perguntaHotelHotel(String mensagem) {
        return Hotel.getInstancia().receberPergunta(mensagem);
    }
}
