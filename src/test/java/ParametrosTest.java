package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.Parametros;

public class ParametrosTest {
    
    @Test
    public void deveRetornarNomeEmpresa() {
        Parametros.getInstance().setNomeEmpresaHC("InfenoMed");
        assertEquals("InfenoMed", Parametros.getInstance().getNomeEmpresaHC());    
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Usuario Teste");
        assertEquals("Usuario Teste", Parametros.getInstance().getUsuarioLogado());
    }
    
}
