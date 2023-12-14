/*Classe que implementa o padrão proxy. Ela implementa a interface ClassificadorPerfil  e possui a função conferir(), que tem como objetivo verificar se 
 * o user e a senha condizem com o perfil que se quer avaliar o nivel do perfil.
 * 
 */
package proxy;

import perfil.Perfil;

public class ProxyClassificadorPerfil implements ClassificadorPerfil {
    private ClassificadorPerfilImpl classificador;
    private String perfilUsuario;
    private String perfilSenha;
    private Perfil perfil;

    public ProxyClassificadorPerfil(String usuario, String senha, Perfil perfil) {
        this.perfilUsuario = usuario;
        this.perfilSenha = senha;
        this.perfil = perfil;
        this.classificador = new ClassificadorPerfilImpl();
    }
    
    public NivelPerfil conferir() {
    	if(getPerfil().getUser().equals(this.perfilUsuario) && getPerfil().getPwd().equals(this.perfilSenha)){
    		NivelPerfil nivel = classificador.nivel(perfil);
    		return nivel;
    	}
    	return NivelPerfil.DESCONHECIDO;
    }

    @Override
    public NivelPerfil nivel(Perfil perfil) {
		return null;
    }

	public ClassificadorPerfilImpl getClassificador() {
		return classificador;
	}

	public void setClassificador(ClassificadorPerfilImpl classificador) {
		this.classificador = classificador;
	}

	public String getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(String perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public String getPerfilSenha() {
		return perfilSenha;
	}

	public void setPerfilSenha(String perfilSenha) {
		this.perfilSenha = perfilSenha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}