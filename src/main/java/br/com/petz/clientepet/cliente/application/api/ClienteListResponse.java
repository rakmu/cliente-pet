package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.cliente.domain.Cliente;
import jakarta.validation.constraints.NotBlank;

public class ClienteListResponse {

	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		return null;
	}
}
