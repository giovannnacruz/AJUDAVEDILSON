package senaidev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import senaidev.biblioteca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
	
	
}
