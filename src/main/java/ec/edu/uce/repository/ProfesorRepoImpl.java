package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Profesor;
@Repository
public class ProfesorRepoImpl implements IProfesorRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el profesor");
		Object[] datosAInsertar = new Object[] { profesor.getIdProfesor(), profesor.getNombre(), profesor.getApellido(),
				profesor.getEmailProfesor(),profesor.getEdad() };

		this.jdbctemplate.update("insert into profesor(idprofesor,nombre,apellido,emailprofesor,edad)values(?,?,?,?,?)", datosAInsertar);
		
	}

	@Override
	public Profesor buscarProfesor(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from profesor where idprofesor=?", datoBuscar, new BeanPropertyRowMapper<Profesor>(Profesor.class));
	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {profesor.getIdProfesor(), profesor.getNombre(), profesor.getApellido(),
				profesor.getEmailProfesor(),profesor.getEdad() ,profesor.getIdProfesor()};
		this.jdbctemplate.update("update profesor SET idprofesor=?,nombre= ?,apellido= ?,emailprofesor =?, edad=? where idprofesor=?", datoAActualizar);
	}

	@Override
	public void borrarProfesor(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from profesor where idprofesor=?", datoABorrar);
	}

}
