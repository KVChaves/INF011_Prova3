/* ------------------PADRÃO PROXY---------------------------- 
 * CLASSE PARA TESTE.
 */
package app;

import perfil.DiretorPerfil;
import perfil.Perfil;
import perfil.PerfilBuilder;
import perfil.PerfilBuilderImplementor;
import proxy.NivelPerfil;
import proxy.ProxyClassificadorPerfil;

public class App {
    public static void main(String[] args) {
    	PerfilBuilder builder = new PerfilBuilderImplementor();
        DiretorPerfil diretor = new DiretorPerfil(builder);

        diretor.construirPerfil("kayran", "Kay", "12Aa3");
        Perfil perfilk = builder.getPerfil();

        ProxyClassificadorPerfil proxy = new ProxyClassificadorPerfil("kay", "12Aa3", perfilk);

        NivelPerfil nivel = proxy.conferir();

        if(nivel.equals("DESCONHECIDO")) {
        	System.out.println("DESCONHECIDO: Usúario ou senha errado.");
        }
        else {
        	System.out.printf("Nivel de Confiança: %s",nivel);
        }
        
    }
}