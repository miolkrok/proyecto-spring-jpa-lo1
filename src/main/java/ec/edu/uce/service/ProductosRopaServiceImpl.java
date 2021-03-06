package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.ProductosRopa;
import ec.edu.uce.repository.IProductosRopaRepo;
@Service
public class ProductosRopaServiceImpl implements IProductosRopaService{

	@Autowired
	private IProductosRopaRepo productosRepo;
	@Override
	public void insertarProductosRopaNuevo(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		this.productosRepo.insertarProductosRopa(productosRopa);
	}
	@Override
	public void actualizarProductosRopaNuevo(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		this.productosRepo.actualizarProductosRopa(productosRopa);
	}
	@Override
	public void borrarProductosRopaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.productosRepo.borrarProductosRopa(id);
	}
	@Override
	public ProductosRopa busarProductosRopaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.productosRepo.buscarProductosRopa(id);
	}



}
