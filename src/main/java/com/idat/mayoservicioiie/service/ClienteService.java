package com.idat.mayoservicioiie.service;

import java.util.List;

import com.idat.mayoservicioiie.model.Cliente;

public interface ClienteService {

	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);
	 
}
