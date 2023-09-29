package supera5.controller;


import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import supera5.model.Transferencia;
import supera5.repository.TransferenciaRepository;


@RestController
@RequestMapping("/transferecia")
public class TransferenciaController {
	
	@Autowired
	private TransferenciaRepository repository;
	
	
	
	@GetMapping ("/all")
	public List<Transferencia> findAll(){
		return repository.findAll();
		
	}

	@GetMapping("/porData")
	public List<Transferencia> getTransferenciaData(@RequestParam ZonedDateTime data){
		return repository.findByDataTransferencia(data);
	}
	
	@GetMapping("/porTipo")
	public List<Transferencia> getTransferenciaTipo(@RequestParam String tipo){
		return repository.findByTipo(tipo);
	}
}