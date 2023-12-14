package perfil;

import documentos.CPF;
import documentos.CartaoCredito;
import documentos.Email;
import documentos.RG;

public class PerfilBuilderImplementor implements PerfilBuilder {
	 private Perfil perfil;
	
	 public PerfilBuilderImplementor() {
	     this.perfil = new Perfil();
	 }
	
	 @Override
	 public void construirNome(String nome) {
	     perfil.setNome(nome);
	 }
	
	 @Override
	 public void construirUsuario(String user) {
		 if(user.isBlank()) {
			 perfil.setUser(perfil.getNome());
		 }
		 else{
			 perfil.setUser(user);
		 }
	 }
	
	 @Override
	 public void construirSenha(String pwd) {
		 if(pwd.isBlank()) {
			 perfil.setPwd(perfil.getNome());
		 }
		 else{
			 perfil.setPwd(pwd);
		 }
	 }
	
	 @Override
	 public void construirDocumentos() {
	     perfil.adicionarDocumento(new CPF());
	     perfil.adicionarDocumento(new RG());
	     for (int i = 0; i < 3; i++) {
	         perfil.adicionarDocumento(new CartaoCredito());
	     }
	     for (int i = 0; i < 2; i++) {
	         perfil.adicionarDocumento(new Email());
	     }
	 }
	
	 @Override
	 public Perfil getPerfil() {
	     return perfil;
	 }
}