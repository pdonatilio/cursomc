package com.pdonatilio.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdonatilio.cursomc.domain.Categoria;
import com.pdonatilio.cursomc.repositories.CategoriaRepository;
import com.pdonatilio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}

}
