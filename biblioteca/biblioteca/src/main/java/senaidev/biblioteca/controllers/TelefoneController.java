package senaidev.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senaidev.biblioteca.entity.Telefone;
import senaidev.biblioteca.repositories.TelefoneRepository;

@RestController
@RequestMapping("value=/telefone")
public class TelefoneController {

	@Autowired
	private TelefoneRepository tb_telefone;

	@GetMapping
	public List<Telefone> findAll() {
		List<Telefone> listaTelefone = tb_telefone.findAll();
		return listaTelefone;
	}

	@GetMapping(value = "/{id}")
	public senaidev.biblioteca.entity.Telefone findById(@PathVariable Long id) {
		return tb_telefone.findById(id).get();
	}

	@PostMapping
	public Telefone insert(@RequestBody Telefone obj) {
		return obj = tb_telefone.save(obj);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		tb_telefone.deleteById(id);
	}
	
	
}
