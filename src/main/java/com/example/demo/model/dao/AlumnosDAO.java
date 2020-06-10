package com.example.demo.model.dao;

import java.util.List;
/*import java.text.SimpleDateFormat;
import java.text.ParseException;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.AlumnosDTO;


@Service
public class AlumnosDAO implements AlumnosInterface {

	public String insert="INSERT INTO TABLA_ALUMNO VALUES(?,?,?,?,?,?,?,?,?)";
	public String update="UPDATE TABLA_ALUMNO SET RUTALUMNO=?, RUTDIGITOALUMNO=?, NOMBREALUMNO=?, ALUMNAPELLIDOPAT=?, ALUMNAPELLIDOMAT=?, ALUMNFECHANACIM=?, ALUMNDIRECCION=?, ALUMNTELEFONO=?, ID_CURSO=? WHERE RUTALUMNO=?";
	public String delete="DELETE FROM TABLA_ALUMNO WHERE RUTALUMNO=?";
	public String get_one="SELECT * FROM TABLA_ALUMNO WHERE RUTALUMNO=?";
	public String get_all="SELECT * FROM TABLA_ALUMNO";
	
	public AlumnosDAO() {
	}
	@Autowired
    private JdbcTemplate jdbctemplate;
	
	@Override
	public List<AlumnosDTO> lista() {
		List<AlumnosDTO> listaalumno = jdbctemplate.query(get_all, BeanPropertyRowMapper.newInstance(AlumnosDTO.class));
		return listaalumno;
	}

	@Override
	public int update(AlumnosDTO e) {
		int rows = 0;
		Object[] args= {
				e.getRutalumno(),
				e.getRutdigitoalumno(),
				e.getNombrealumno(),
				e.getAlumnapellidopat(),
				e.getAlumnapellidomat(),
				e.getAlumnfechanacim(),
				e.getAlumndireccion(),
				e.getAlumntelefono(),
				e.getId_curso(),
				e.getRutalumno()
		};
		try {
			rows=jdbctemplate.update(update,args);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return rows;
	}

	@Override
	public int insert(AlumnosDTO e) {
		/*SimpleDateFormat formato= new SimpleDateFormat("dd/mm/yy");
		Date fecha=null;*/
		int rows =0;
		Object[] args = {
				e.getRutalumno(),
				e.getRutdigitoalumno(),
				e.getNombrealumno(),
				e.getAlumnapellidopat(),
				e.getAlumnapellidomat(),
				e.getAlumnfechanacim(),
				e.getAlumndireccion(),
				e.getAlumntelefono(),
				e.getId_curso()
		};
		try {
		rows=jdbctemplate.update(insert,args); 
		}
		catch (Exception ex) {
	    	ex.printStackTrace();
	    }
		return rows;
	}
	
	@Override
	public AlumnosDTO getOne(Integer rutalumno) {
		Object[] args = {rutalumno};
		AlumnosDTO alumnosdto;
		try {
			alumnosdto=jdbctemplate.queryForObject(get_one,args ,BeanPropertyRowMapper.newInstance(AlumnosDTO.class));
		}
		catch(EmptyResultDataAccessException e) {
	    	alumnosdto=null;
	    	e.printStackTrace();
	    } catch (Exception e) {
	    	alumnosdto=null;
	    	e.printStackTrace();
	    }
		
		return alumnosdto;
		}
		

	@Override
	public int delete(Integer rutalumno) {
		int rows=0;
		Object[] args= {rutalumno};
		try {
			rows=jdbctemplate.update(delete,args);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return rows;

	}


}
