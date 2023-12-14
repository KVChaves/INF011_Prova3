package documentos;

import visitors.DocumentoVisitor;

public interface Documento {
	
	String formatar();
	boolean validar();
	int pontuar();
	String aceitar(DocumentoVisitor visitor);
	
}