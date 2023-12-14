/*Classe que faz a implementação da função "Nivel". Ele classifica o nivel do perfil de acordo com a presença de números e letras maiusculas na senha,
 * caso tenha ambos, o nivel é alto, caso só um dos dois é médio e se não tiver nenhum dos dois é baixo.
 */
package proxy;

import perfil.Perfil;

public class ClassificadorPerfilImpl implements ClassificadorPerfil {
    @Override
    public NivelPerfil nivel(Perfil perfil) {
    	boolean upper = false;
    	boolean num = false;
    	
    	for(int i=0;i<perfil.getPwd().length();i++) {
    		if(Character.isDigit(perfil.getPwd().charAt(i))) {
    			System.out.println("Tem número");
    			num = true;
    		}
    		if(Character.isUpperCase(perfil.getPwd().charAt(i))) {
    			System.out.println("Tem Maiuscula");
    			upper = true;
    		}
    	}
    	
    	if(upper && num) {
    		return NivelPerfil.ALTO;
    	}
    	else if(upper || num) {
    		return NivelPerfil.MEDIO;
    	}
    	else if(!upper && !num) {
    		return NivelPerfil.BAIXO;
    	}
		return NivelPerfil.DESCONHECIDO;	
    }
}