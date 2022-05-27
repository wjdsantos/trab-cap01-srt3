package com.devsuperior.trabcap01srt3.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trabcap01srt3.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Antonio", "001.222.333-11", 5200.00, null, 2));
		list.add(new Client(2L, "Joao", "002.233.344-22", 4100.00, null, 1));
		list.add(new Client(3L, "Carlos", "003.244.355-33", 6000.00, null, 2));
		return ResponseEntity.ok().body(list);
	}
}
