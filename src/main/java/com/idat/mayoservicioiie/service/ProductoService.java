package com.idat.mayoservicioiie.service;

import java.util.List;

import com.idat.mayoservicioiie.model.Productos;

public interface ProductoService {

	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);
	
}
