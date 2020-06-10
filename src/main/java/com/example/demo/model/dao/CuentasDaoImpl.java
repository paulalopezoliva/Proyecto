package com.example.demo.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.CuentasDTO;
@Service
public class CuentasDaoImpl implements CuentasDAO {
	
	private String insert="INSERT INTO TABLA_CUENTAS VALUES(?,?,?,?,?)";
	private String get_one="SELECT * FROM TABLA_CUENTAS WHERE CORREO=?";
	private String update="UPDATE TABLA_CUENTAS SET ID_CUENTA=?, RUTAPODERADO=?, CORREO=?, CONTRASEÑA=?, ROL=? WHERE ID_CUENTA=?";
	private String delete="DELETE FROM TABLA_CUENTAS WHERE ID_CUENTA=?";
	private String list="SELECT * FROM TABLA_CUENTAS";
	private String find="SELECT * FROM TABLA_CUENTAS WHERE CORREO=?";
	
	public CuentasDaoImpl() {
	}
	
	@Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public int insert(CuentasDTO e) {
		int rows=0;
		Object[] args= {
				e.getId_cuenta(),
				e.getRutapoderado(),
				e.getCorreo(),
				e.getContraseña(),
				e.getRol()
		};
		try {
			rows=jdbctemplate.update(insert,args);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return rows;
	}

	@Override
	public CuentasDTO get(String correo) {
		CuentasDTO cuentasdto;
		Object[] args= {correo};
		try {
			cuentasdto=jdbctemplate.queryForObject(get_one,args,BeanPropertyRowMapper.newInstance(CuentasDTO.class));
		}
		catch(EmptyResultDataAccessException e) {
	    	cuentasdto=null;
	    	e.printStackTrace();
	    } catch (Exception e) {
	    	cuentasdto=null;
	    	e.printStackTrace();
	    }
		return cuentasdto;
	}

	@Override
	public int update(CuentasDTO e) {
		int rows=0;
		Object[] args = {
				e.getId_cuenta(),
				e.getRutapoderado(),
				e.getCorreo(),
				e.getContraseña(),
				e.getRol(),
				e.getId_cuenta()
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
	public int delete(int id_cuenta) {
		int rows=0;
		Object[] args= {id_cuenta};
		try {
			rows=jdbctemplate.update(delete,args);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return rows;
	}

	@Override
	public List<CuentasDTO> lista() {
		List<CuentasDTO> listacuentas = jdbctemplate.query(list, BeanPropertyRowMapper.newInstance(CuentasDTO.class));
		return listacuentas;
	}

	@Override
	public CuentasDTO findByUserName(String correo) {
		Object[] args= {correo};
		CuentasDTO cuentasdto;
		try {
		cuentasdto=jdbctemplate.queryForObject(find,args,BeanPropertyRowMapper.newInstance(CuentasDTO.class));
		}
		catch(EmptyResultDataAccessException e) {
	    	cuentasdto=null;
	    	e.printStackTrace();
	    } catch (Exception e) {
	    	cuentasdto=null;
	    	e.printStackTrace();
	    }
		return cuentasdto;
	}


}
