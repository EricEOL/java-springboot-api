package br.com.alura.forum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);
	
}
