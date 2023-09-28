package cibertec.edu.pe.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.Model.Carrito;
import cibertec.edu.pe.Repository.CarritoRepository;
import cibertec.edu.pe.Service.CarritoService;

@Service
public class CarritoServiceImpl  implements CarritoService  {
    
	@Autowired
	private CarritoRepository carritoRepository;
	
	@Override
	public List<Carrito>listar() {	
		return carritoRepository.findAll();
	}

}
