package com.idat.mayoservicioiie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.mayoservicioiie.model.Cliente;
import com.idat.mayoservicioiie.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
