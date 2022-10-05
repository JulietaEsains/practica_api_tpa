package com.tpa.api_rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpa.api_rest.entities.Autor;
import com.tpa.api_rest.repositories.AutorRepository;
import com.tpa.api_rest.repositories.BaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

	@Autowired
	private AutorRepository autorRepository;
	
	public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
		super(baseRepository);
	}
	
}
