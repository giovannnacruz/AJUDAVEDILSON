package senaidev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import senaidev.biblioteca.entity.Telefone;

public interface TelefoneRepository extends JpaRepository <Telefone,Long> {	
	

}
