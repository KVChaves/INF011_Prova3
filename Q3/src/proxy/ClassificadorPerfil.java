/*Interface responsavel por delegar a função nivel, que quando implementada calcula o nivel de segurança do perfil.
*/
package proxy;

import perfil.Perfil;

public interface ClassificadorPerfil {
    NivelPerfil nivel(Perfil perfil);
}
