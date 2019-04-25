package com.talentos.aluguel.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

public class Reserva extends Locacao {
	
	@NotEmpty
	@Column
	@Temporal(TemporalType.DATE) //yyy-mm-dd
	private Date datadeReserva;

	public Date getDatadeReserva() {
		return datadeReserva;
	}

	public void setDatadeReserva(Date datadeReserva) {
		this.datadeReserva = datadeReserva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((datadeReserva == null) ? 0 : datadeReserva.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (datadeReserva == null) {
			if (other.datadeReserva != null)
				return false;
		} else if (!datadeReserva.equals(other.datadeReserva))
			return false;
		return true;
	}
	
	

}
