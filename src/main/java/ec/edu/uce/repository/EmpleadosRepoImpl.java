package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Empleados;
@Repository
public class EmpleadosRepoImpl implements IEmpleadosRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleados buscarEmpleados(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarEmpleados(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
