package cibertec.edu.pe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.pe.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
}
