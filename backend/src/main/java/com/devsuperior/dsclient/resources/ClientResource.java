package com.devsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		Instant birthDate1 = Instant.parse("1960-06-25T15:42:07Z");
		Instant birthDate2 = Instant.parse("1963-04-10T07:38:00Z");		
		list.add(new Client(1L, "Maria José da Silva", "11111111111", 3550.0, birthDate1, 1));
		list.add(new Client(2L, "João José da Silva", "22222222222", 3000.0, birthDate2, 2));
		return ResponseEntity.ok().body(list);
	}

}
