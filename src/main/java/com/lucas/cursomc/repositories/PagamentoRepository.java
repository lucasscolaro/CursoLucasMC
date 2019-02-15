package com.lucas.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lucas.cursomc.domain. Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository< Pagamento, Integer>{

}
