package senaidev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import senaidev.biblioteca.entity.emprestimo;


public interface EmprestimoRepository extends JpaRepository <emprestimo,Long> {
	
	
}

