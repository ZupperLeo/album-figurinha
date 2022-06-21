package com.album.app.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Figurinha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Integer pagina;
	
	@Column(nullable = false)
	private String descricao;
	
	@ManyToOne
	private Album album;
	
	@Deprecated
	public Figurinha() {}

	public Figurinha(Integer pagina, String descricao, Album album) {
		this.pagina = pagina;
		this.descricao = descricao;
		this.album = album;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurinha other = (Figurinha) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
