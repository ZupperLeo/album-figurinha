package com.album.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Integer numeroDePaginas;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "album")
	private List<Figurinha> figurinhas = new ArrayList<>();
	
	@Deprecated
	public Album() {}

	public Album(String titulo, String descricao, Integer numeroDePaginas, List<Figurinha> figurinhas) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.numeroDePaginas = numeroDePaginas;
		this.figurinhas = figurinhas;
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
		Album other = (Album) obj;
		return Objects.equals(id, other.id);
	}
	
}
