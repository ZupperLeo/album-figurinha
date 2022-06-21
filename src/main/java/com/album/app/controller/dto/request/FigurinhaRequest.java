package com.album.app.controller.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.album.app.model.Album;
import com.album.app.model.Figurinha;

public class FigurinhaRequest {

	@NotBlank
	private String descricao;
	
	@NotNull
	@Positive
	private Integer pagina;

	public FigurinhaRequest(@NotBlank String descricao, @NotNull @Positive Integer pagina) {
		this.descricao = descricao;
		this.pagina = pagina;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getPagina() {
		return pagina;
	}
	
	public Figurinha toModel(Album album) {
		return new Figurinha(pagina, descricao, album);
	}
	
}
