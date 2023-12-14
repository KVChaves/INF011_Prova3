/*Classe responsável por implementar as funções "Visit". Cada função dessa tem como objetivo conferir a validade do documento solicitado. É feito o calculo com base na data de validade inserida na hora da instanciação, isso para os documetnos que possuem validade.
*/
package visitors;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import documentos.CPF;
import documentos.CartaoCredito;
import documentos.Email;
import documentos.RG;

public class ValidadeVisitor implements DocumentoVisitor {
    @Override
    public String visit(CartaoCredito documento) {
    	long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), documento.getVencimento());
		return Long.toString(diasRestantes);
    }

    @Override
    public String visit(CPF documento) {
		return "Sem data para vencimento";
    }

    @Override
    public String visit(Email documento) {
    	return "Sem data para vencimento";
    }

    @Override
    public String visit(RG documento) {
    	long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), documento.getValidade());
		return Long.toString(diasRestantes);
    }
}
