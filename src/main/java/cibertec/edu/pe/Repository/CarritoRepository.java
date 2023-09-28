package cibertec.edu.pe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.pe.Model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito,Integer>{

}
