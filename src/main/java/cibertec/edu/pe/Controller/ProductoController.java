package cibertec.edu.pe.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cibertec.edu.pe.Model.Producto;
import cibertec.edu.pe.Service.ProductosService;
import cibertec.edu.pe.ServiceImpl.UploadFileService;


@Controller
public class ProductoController {
	@Autowired
	private ProductosService productosService;
	@Autowired
	private UploadFileService uploadFileService;
	
	@GetMapping("/listado")
   public String listado(Model model) {
		List<Producto> lista= productosService.listar();
	   model.addAttribute("listadoProductos",lista);
		
		return"listadoProductos";
   }
	@PostMapping("/grabar")
	public String grabar(Producto producto, @RequestParam("img") MultipartFile file) throws IOException {
		
		// imagen
		if (producto.getId() == null) { // cuando se crea un producto
			String nombreImagen = uploadFileService.saveImage(file);

			producto.setImagen(nombreImagen);
		}

		productosService.agregar(producto);
		
		return "redirect:/listado";
	}
	
	@GetMapping("/agregar")
	public String Agregar(Model model) {
		   model.addAttribute("producto",new Producto());

		return "AgregarProducto";
		
	}
}
