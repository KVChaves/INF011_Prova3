//Interface do builder responsavel pelos perfil. Possui as funções de criação para cada atributo da classe;

package perfil;

public interface PerfilBuilder {
	 void construirNome(String nome);
	
	 void construirUsuario(String user);
	
	 void construirSenha(String pwd);
	
	 void construirDocumentos();
	
	 Perfil getPerfil();
}
