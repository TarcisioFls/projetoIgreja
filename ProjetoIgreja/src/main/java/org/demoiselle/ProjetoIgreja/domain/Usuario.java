package org.demoiselle.ProjetoIgreja.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Atributos
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Column
	private String nome;

	@Column
	private String nomePai;

	@Column
	private String nomeMae;

	@Column
	private Date dataNascimento;

	@Column
	private Date dataBatismo;

	@Column
	private String sexo;
	
	@Column
	private String estadoCivil;

	@Column
	private String conjugue;

	@Column
	private int quantidadeFilho;

	@Column
	private String RG;

	@Column
	private String CPF;

	@OneToOne
	private Endereco endereco;

	@Column
	private String status;

	@Column
	private String nivel;

	@Column
	private String fone1;

	@Column
	private String fone2;

	@Column
	private String email;

	// Getters e Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataBatismo() {
		return dataBatismo;
	}

	public void setDataBatismo(Date dataBatismo) {
		this.dataBatismo = dataBatismo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getConjugue() {
		return conjugue;
	}

	public void setConjugue(String conjugue) {
		this.conjugue = conjugue;
	}

	public int getQuantidadeFilho() {
		return quantidadeFilho;
	}

	public void setQuantidadeFilho(int quantidadeFilho) {
		this.quantidadeFilho = quantidadeFilho;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getFone1() {
		return fone1;
	}

	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}

	public String getFone2() {
		return fone2;
	}

	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
