package com.devsuperior.trabcap01srt3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.trabcap01srt3.entities.Client;
import com.devsuperior.trabcap01srt3.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<Client> finAll() {
		return repository.findAll();
	}
}
