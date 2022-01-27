package br.com.alura.forum.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.alura.forum.models.Curso;

@DataJpaTest
class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;
	
	@Test
	public void carregarUmCursoPeloNome() {
		String courseName = "HTML 5";
		Curso course = repository.findByNome(courseName);
		
		Assertions.assertNotNull(course);
		Assertions.assertEquals(courseName, course.getNome());
	}
	
	@Test
	public void naoDeveCarregarUmCursoPeloNome() {
		String courseName = "JPA";
		Curso course = repository.findByNome(courseName);
		
		Assertions.assertNull(course);
	}

}
