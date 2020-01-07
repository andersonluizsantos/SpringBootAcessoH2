package com.accenture.db.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;

import com.accenture.db.enums.TipoTransacao;

@Entity
@Table(name = "transacao")
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "is_ativo", nullable = false)
	private Boolean ativo;

	@Enumerated(EnumType.ORDINAL)
	private TipoTransacao tipoTransacao;

	@Column(name = "vlr_transacao", nullable = false, precision = 2)
	private Float valorTransacao;

	@Column(name = "dt_transacao", nullable = false)
	@CreatedBy
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTimeTransferencia;

	@Column(name = "conta", nullable = false)
	private String conta;

	public Transacao() {
		
	}

	public Transacao(long id, String descricao, Boolean ativo, TipoTransacao tipoTransacao, Float valorTransacao,
			Date dateTimeTransferencia, String conta) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.ativo = ativo;
		this.tipoTransacao = tipoTransacao;
		this.valorTransacao = valorTransacao;
		this.dateTimeTransferencia = dateTimeTransferencia;
		this.conta = conta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(Float valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public Date getDateTimeTransferencia() {
		return dateTimeTransferencia;
	}

	public void setDateTimeTransferencia(Date dateTimeTransferencia) {
		this.dateTimeTransferencia = dateTimeTransferencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(TipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	@Override
	public String toString() {
		return "Transacao [id=" + id + ", descricao=" + descricao + ", ativo=" + ativo + ", tipoTransacao="
				+ tipoTransacao + ", valorTransacao=" + valorTransacao + ", dateTimeTransferencia="
				+ dateTimeTransferencia + ", conta=" + conta + "]";
	}
}
