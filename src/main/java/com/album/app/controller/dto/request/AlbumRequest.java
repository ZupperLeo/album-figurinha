package com.album.app.controller.dto.request;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import com.album.app.model.Album;

public class AlbumRequest {

	@NotBlank
	private String titulo;
	
	@NotBlank
	@Length(max = 500)
	private String descricao;
	
	@NotNull
	@Positive
	@Length(min = 10, max = 100)
	private Integer numeroDePaginas;
	
	@NotNull
	private List<FigurinhaRequest> figurinhas = new ArrayList<>();

	public AlbumRequest(@NotBlank String titulo, @NotBlank @Length(max = 500) String descricao,
			@NotNull @Length(min = 10, max = 100) Integer numeroDePaginas) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
	public Album toModel() {
		// TODO - Implementar a funcionalidade para retornar um objeto Album
		return null;
	}
	
}
