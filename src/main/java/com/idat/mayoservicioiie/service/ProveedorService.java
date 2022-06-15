package com.idat.mayoservicioiie.service;

import java.util.List;

import com.idat.mayoservicioiie.model.Proveedor;

public interface ProveedorService {

	void guardarProveedor(Proveedor proveedor);
	void actualizarProducto(Proveedor proveedor);
	void eliminarProveedor(Integer id);
	List<Proveedor> listarProveedor();
	Proveedor obtenerProveedorId(Integer id);
	
}
