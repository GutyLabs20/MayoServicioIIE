package com.idat.mayoservicioiie.service;

import java.util.List;

import com.idat.mayoservicioiie.model.Items;

public interface ItemService {

	void guardarItem(Items item);
	void actualizarItem(Items item);
	void eliminarItem(Integer id);
	List<Items> listarItem();
	Items obtenerItemId(Integer id);
	
}
