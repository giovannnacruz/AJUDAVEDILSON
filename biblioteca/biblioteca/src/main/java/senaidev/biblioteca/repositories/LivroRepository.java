package senaidev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import senaidev.biblioteca.entity.Livro;


public interface LivroRepository extends JpaRepository <Livro,Long>{

}
