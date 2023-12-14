package perfil;

public interface PerfilBuilder {
	 void construirNome(String nome);
	
	 void construirUsuario(String user);
	
	 void construirSenha(String pwd);
	
	 void construirDocumentos();
	
	 Perfil getPerfil();
}
