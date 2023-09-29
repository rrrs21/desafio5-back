package supera5.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.Column;

import jakarta.persistence.Embeddable;
//import javax.persistence.Embedded;
import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "transferencia")
public class Transferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "data_transferencia")
	private ZonedDateTime dataTransferencia;
	
	private BigDecimal valor;
	
	@Column(length =15)
	private String tipo;
	
	@Column(length =50, name="nome_operador_transacao")
	
	private String nomeOperadorTransacao;
	
	@JoinColumn(name="id_conta")
	private Integer id_conta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ZonedDateTime getDataTransferencia() {
		return dataTransferencia;
	}

	public void setDataTransferencia(ZonedDateTime dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeOperadorTransacao() {
		return nomeOperadorTransacao;
	}

	public void setNomeOperadorTransacao(String nomeOperadorTransacao) {
		this.nomeOperadorTransacao = nomeOperadorTransacao;
	}

	public Integer getId_conta() {
		return id_conta;
	}

	public void setId_conta(Integer id_conta) {
		this.id_conta = id_conta;
	}

	

	
	
	
}