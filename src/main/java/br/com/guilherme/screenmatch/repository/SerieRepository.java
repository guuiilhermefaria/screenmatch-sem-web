package br.com.guilherme.screenmatch.repository;

import br.com.guilherme.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
