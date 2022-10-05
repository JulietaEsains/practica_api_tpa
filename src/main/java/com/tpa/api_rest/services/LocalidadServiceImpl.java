package com.tpa.api_rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpa.api_rest.entities.Localidad;
import com.tpa.api_rest.repositories.BaseRepository;
import com.tpa.api_rest.repositories.LocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
	
	@Autowired
	private LocalidadRepository localidadRepository;
	
	public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
		super(baseRepository);
	}
	
}
