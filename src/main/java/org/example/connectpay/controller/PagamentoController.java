package org.example.connectpay.controller;

import org.example.connectpay.model.Pagamento;
import org.example.connectpay.service.PagamentoService;
import org.example.connectpay.dto.PagamentoRequestDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    @GetMapping
    public List<Pagamento> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Pagamento> criar(@RequestBody @Valid PagamentoRequestDTO dto) {
        // Transformando o DTO em uma Entity (Pagamento)
        Pagamento novoPagamento = new Pagamento();
        novoPagamento.setFavorecido(dto.getFavorecido());
        novoPagamento.setCodigoBarras(dto.getCodigoBarras());
        novoPagamento.setValor(dto.getValor());

        // Agora salvamos a Entity usando o Service
        return ResponseEntity.ok(service.salvar(novoPagamento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}