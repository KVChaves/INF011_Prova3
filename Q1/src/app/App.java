/* ------------PADRÃO BUILDER--------------
 * CLASSE PARA TESTE. 
*/
package app;

import perfil.DiretorPerfil;
import perfil.Perfil;
import perfil.PerfilBuilder;
import perfil.PerfilBuilderImplementor;

public class App {
 public static void main(String[] args) {
     PerfilBuilder builder = new PerfilBuilderImplementor();
     DiretorPerfil diretor = new DiretorPerfil(builder);

     diretor.construirPerfil("sapo cego", "", "");
     Perfil perfilk = builder.getPerfil();
     
     System.out.printf("Nome: %s\n",perfilk.getNome());
     System.out.printf("User: %s\n",perfilk.getUser());
     System.out.printf("Senha: %s\n",perfilk.getPwd());
 }
}