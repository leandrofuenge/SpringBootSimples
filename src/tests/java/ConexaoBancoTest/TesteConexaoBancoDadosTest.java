package ConexaoBancoTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteConexaoBancoDadosTest {

    @Test
    public void testConexaoBancoDados() {
        TesteConexaoBancoDados testeConexao = new TesteConexaoBancoDados();

        // Verifica se a conexão é bem-sucedida
        assertTrue(testeConexao.testarConexao(), "Conexão bem-sucedida com o banco de dados");
    }
}
