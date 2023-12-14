package perfil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import documentos.Documento;

//Classe Perfil
public class Perfil {
	 private String nome;
	 private String user;
	 private String pwd;
	 private List<Documento> documentos;
	
	 public Perfil() {
	     this.documentos = new ArrayList<>();
	 }
	 
	 public Perfil(String nome, String user, String pwd) {
			this(nome, user, pwd, new LinkedList<Documento>());
		}
		
		public Perfil(String nome, String user, String pwd, List<Documento> documentos) {
			this.documentos = documentos;
			this.nome = nome;
			this.user = user;
			this.pwd = pwd;
		}	
		
		public void adicionar(Documento documento) {
			this.documentos.add(documento);
		}
		
		public String toString() {
			StringBuilder str = new StringBuilder();
			str.append(this.nome + "\n");
			for(Documento doc : this.documentos)
				str.append(doc.formatar() + (doc.validar() ? " [Válido]" : "") + "\n");
			return str.toString();
			
		}
		
	 public String getNome() {
			return nome;
	 }
	
	 public String getUser() {
			return user;
	 }
	
	 public String getPwd() {
			return pwd;
	 }
	
	 public void setNome(String nome) {
	     this.nome = nome;
	 }
	
	 public void setUser(String user) {
	     this.user = user;
	 }
	
	 public void setPwd(String pwd) {
	     this.pwd = pwd;
	 }
	
	 public List<Documento> getDocumentos() {
		return documentos;
	 }
	
	 public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	 }
	
	 public void adicionarDocumento(Documento documento) {
	     documentos.add(documento);
     }
}
