package cibertec.edu.pe.Service;

import java.util.List;

import cibertec.edu.pe.Model.Producto;

public interface ProductosService {
     public List<Producto>listar();
     public Producto agregar(Producto producto);
     
}
