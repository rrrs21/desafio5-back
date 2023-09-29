package supera5.repository;


import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import supera5.model.Transferencia;




public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer>{

	List<Transferencia> findByDataTransferencia(ZonedDateTime dataTransferencia);
	List<Transferencia> findByTipo(String tipo);
	List<Transferencia> findByNomeOperadorTransacao(String nomeOperadorTransacao);
//	List<Transferencia> findByIdConta(Integer id_Conta);
	List<Transferencia> findAll();
	
}