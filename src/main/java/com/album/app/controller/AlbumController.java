package com.album.app.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.album.app.controller.dto.request.AlbumRequest;

@RestController
@RequestMapping("/albuns")
public class AlbumController {

	@PostMapping
	public ResponseEntity<?> cadastrarNovoAlbum(@Valid @RequestBody AlbumRequest request, UriComponentsBuilder uriBuilder) {
		
		
		return null;
	}
	
}
