package com.idat.mayoservicioiie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.mayoservicioiie.model.Items;
import com.idat.mayoservicioiie.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository repository;
	
	@Override
	public void guardarItem(Items item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarItem(Items item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Items> listarItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Items obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
