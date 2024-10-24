package fateclins.exposicao_agricola.repositories;

import fateclins.exposicao_agricola.entities.Julgamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JulgamentoRepository extends JpaRepository<Julgamento, UUID> {
}