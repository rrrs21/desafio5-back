package supera5.model;

import javax.persistence.Column;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Conta;
	
	@Column (name = "nome_responsavel")
	private String nomeResponsavel;

	public Integer getIdConta() {
		return id_Conta;
	}

	public void setIdConta(Integer idConta) {
		this.id_Conta = idConta;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	
}