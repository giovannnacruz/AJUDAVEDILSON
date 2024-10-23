package senaidev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import senaidev.biblioteca.entity.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository <TipoUsuario,Long> {
	
	
}
