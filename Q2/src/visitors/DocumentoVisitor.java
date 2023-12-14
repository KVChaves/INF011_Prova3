/*Interface base para todos os visitors necessarios. Possui as funções "visit" uma para cada modelo de documento. 
*/
package visitors;

import documentos.CPF;
import documentos.CartaoCredito;
import documentos.Email;
import documentos.RG;

public interface DocumentoVisitor {
	
    String visit(CartaoCredito documento);

    String visit(CPF documento);

    String visit(Email documento);

    String visit(RG documento);
}
