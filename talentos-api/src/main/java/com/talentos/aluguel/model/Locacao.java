package com.talentos.aluguel.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

/*
 * Locacao será a classe pai de Reserva e Aluguel
 * Visto que cada uma terá propriedades iguais
 * Com exceção de dataReserva e dataAluguel
 */
public class Locacao {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@NotEmpty
	@Column
	private long idCliente;
	@NotEmpty
	@Column
	private long idLivro;
	/*
	 * dataDevolucao vai servir para duas coisas: A primeira seria justamente mostrar a data em que o 
	 * livro foi devolvido. A segunda seria quando ela estaria NULL, pois quando tiver assim
	 * Nós saberemos que o livro ainda não foi devolvido, o que descarta a necessidade de criar
	 * um atributo booleano só para isso, precisando simplesmente verificar se esse atributo está ou não NULL
	 */
	@NotEmpty
	@Column
	@Temporal(TemporalType.DATE) //yyy-mm-dd
	private Date dataDevolucao;
	@NotEmpty
	@Column
	private int valor;

	public long getId() {
		return id;
	}
	public long getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	
	public long getIdLivro() {
		return idLivro;
	}
	
	public void setIdLivro(long idLivro) {
		this.idLivro = idLivro;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (getIdCliente() ^ (getIdCliente() >>> 32));
		result = prime * result + (int) (getIdLivro() ^ (getIdLivro() >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locacao other = (Locacao) obj;
		if (id != other.id)
			return false;
		if (getIdCliente() != other.getIdCliente())
			return false;
		if (getIdLivro() != other.getIdLivro())
			return false;
		return true;
	}
	
	
	

	
	
}
