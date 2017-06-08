package unipe.br.projeto.java.seguradora;
import java.io.Serializable;

public class Cliente implements Serializable {
	
	public String nome;
	public int tipoPessoa;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
		
}
