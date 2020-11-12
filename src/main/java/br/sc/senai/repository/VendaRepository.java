package br.sc.senai.repository;

import br.sc.senai.model.MovimentoEstoque;
import br.sc.senai.model.Venda;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface VendaRepository extends CrudRepository<Venda, Integer> {
    @Query(value = "SELECT v FROM Venda v WHERE v.nrCupomFiscal = :cupom")
    Optional<Venda> finByCupom(@Param("cupom") String nrCupomFiscal);
}
