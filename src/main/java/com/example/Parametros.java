package main.java.com.example;

public class Parametros {
    

    private Parametros() {}

    private static Parametros instance = new Parametros();

    public static Parametros getInstance() {
        return instance;
    }

    private String nomeEmpresaHC;
    private String usuarioLogado;


    public String getNomeEmpresaHC() {
        return nomeEmpresaHC;
    }

    public void setNomeEmpresaHC(String nomeEmpresaHC) {
        this.nomeEmpresaHC = nomeEmpresaHC;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
