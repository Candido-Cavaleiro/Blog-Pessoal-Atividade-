package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;

@ReadingConverter
public interface PostagemRepository extends JpaRepository<Postagem, Long> { 
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}
