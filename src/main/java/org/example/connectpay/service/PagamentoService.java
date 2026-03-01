package org.example.connectpay.service;

import org.example.connectpay.model.Pagamento;
import org.example.connectpay.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository repository;

    public List<Pagamento> listarTodos() {
        return repository.findAll();
    }

    public Pagamento salvar(Pagamento pagamento) {
        pagamento.setStatus("PENDENTE");
        return repository.save(pagamento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}