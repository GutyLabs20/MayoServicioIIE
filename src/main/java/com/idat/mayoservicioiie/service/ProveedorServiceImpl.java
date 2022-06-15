package com.idat.mayoservicioiie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.mayoservicioiie.model.Proveedor;
import com.idat.mayoservicioiie.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository repository;
	
	@Override
	public void guardarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.save(proveedor);
	}

	@Override
	public void actualizarProducto(Proveedor proveedor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(proveedor);
	}

	@Override
	public void eliminarProveedor(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Proveedor> listarProveedor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proveedor obtenerProveedorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
