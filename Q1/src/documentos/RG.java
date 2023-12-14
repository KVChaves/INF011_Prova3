package documentos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RG implements Documento {
	 private String nome;
	 private String numero;
	 private String expedidor;
	 private LocalDate validade;
	
	 @Override
		public String formatar() {
			StringBuilder fmt = new StringBuilder();
			fmt.append("RG\n");
			fmt.append(this.nome + "\n");
			fmt.append(this.numero.substring(0, this.numero.length() - 2) + "-");
			fmt.append(this.numero.substring(this.numero.length() - 2, this.numero.length()) + " - ");
			fmt.append(this.expedidor + "\n");
			fmt.append("Validade: " + this.validade.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
			return fmt.toString();
		}

		@Override
		public boolean validar() {
			return this.validade.isAfter(LocalDate.now());
		}

		@Override
		public int pontuar() {
			return this.validar() ? 1 : 0;
		}
}