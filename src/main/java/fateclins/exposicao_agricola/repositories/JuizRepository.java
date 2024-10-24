package fateclins.exposicao_agricola.repositories;

import fateclins.exposicao_agricola.entities.Juiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JuizRepository extends JpaRepository<Juiz, UUID> {
}
