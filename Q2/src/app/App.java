/* ------------------PADRÃO VISITOR---------------------------- 
 * CLASSE PARA TESTE.
 */
package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import documentos.CPF;
import documentos.CartaoCredito;
import documentos.Documento;
import documentos.Email;
import documentos.RG;
import visitors.ValidadeVisitor;

public class App {
 public static void main(String[] args) {
	 List<Documento> documentos = new ArrayList<>();
     documentos.add(new CartaoCredito(LocalDate.now().plusDays(45)));
     documentos.add(new CPF());
     documentos.add(new Email("Kayran"));
     documentos.add(new RG(LocalDate.now().plusDays(93)));

     ValidadeVisitor validadeVisitor = new ValidadeVisitor();

     for(int i = 0;i<documentos.size();i++) {
    	 System.out.println(documentos.get(i).aceitar(validadeVisitor));
     }
 }
}