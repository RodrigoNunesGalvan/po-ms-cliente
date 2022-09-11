package br.com.a2like.pocmscliente.application;

import br.com.a2like.pocmscliente.domain.Cliente;
import br.com.a2like.pocmscliente.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getByCPF(String cpf){
        return clienteRepository.findByCpf(cpf);
    }
}
