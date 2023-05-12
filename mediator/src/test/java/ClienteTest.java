import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void devePedirAndar() {
        Cliente cliente = new Cliente();
        assertEquals("Seu andar será revisado.\nO hospital respondeu conforme a mensagem a seguir.\n" +
                        ">>O seu andar é: 5",
                cliente.receberAndarHotel("5"));
    }

    @Test
    void devePedirNumero() {
        Cliente cliente = new Cliente();
        assertEquals("Seu número será revisado.\nO hotel respondeu conforme a mensagem a seguir.\n" +
                        ">>Você deve ficar no quarto: 02",
                cliente.receberNumeroHotel("02"));
    }

    @Test
    void deveFazerPergunta() {
        Cliente cliente = new Cliente();
        assertEquals("Sua pergunta será revisada.\nO hotel respondeu conforme a mensagem a seguir.\n" +
                        ">>A resposta para sua pergunta é : 20 horas de estadia",
                cliente.perguntaHotelHotel("2 horas de repouso"));
    }
}
