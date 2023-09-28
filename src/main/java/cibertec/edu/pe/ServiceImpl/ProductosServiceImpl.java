package cibertec.edu.pe.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.Model.Producto;
import cibertec.edu.pe.Repository.ProductoRepository;
import cibertec.edu.pe.Service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService{
   
	@Autowired
	private ProductoRepository  productoRepository;
	@Override
	public List<Producto> listar() {
		
		return productoRepository.findAll();
	}

	@Override
	public Producto agregar(Producto producto) {
		return productoRepository.save(producto);
	}

}
