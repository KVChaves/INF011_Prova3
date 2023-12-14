/*Classe responsável por realizar as chamadas das funções existentes no builder para criar um perfil de acordo com parâmetros fornecidos.
*/
package perfil;

public class DiretorPerfil {
    private PerfilBuilder builder;

    public DiretorPerfil(PerfilBuilder builder) {
        this.builder = builder;
    }

    public void construirPerfil(String nome, String user, String pwd) {
        builder.construirNome(nome);
        builder.construirUsuario(user);
        builder.construirSenha(pwd);
        builder.construirDocumentos();
    }
}