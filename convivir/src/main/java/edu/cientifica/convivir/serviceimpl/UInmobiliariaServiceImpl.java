package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.UInmobiliariaMapper;
import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.UsuarioFinal;
import edu.cientifica.convivir.service.UInmobiliariaService;

@Service
public class UInmobiliariaServiceImpl implements UInmobiliariaService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired 
	UInmobiliariaMapper uinmobiliariaMapper;
	
	@Transactional
	@Override
	public UInmobiliaria registrarUInmobiliaria(UInmobiliaria uinmobiliaria) {
		UInmobiliaria unidad = null;
		
		if (uinmobiliaria.getId()==null) {
			unidad=uinmobiliaria;
			unidad.setId(uinmobiliariaMapper.selectNewId());
		}
		if (uinmobiliariaMapper.insertUInmobiliaria(unidad)<1) {
			unidad = null;
		}else {
			uinmobiliariaMapper.insertAdministrador(unidad);
			unidad =  uinmobiliariaMapper.selectUInmobiliariaById(uinmobiliaria.getId());
		}
		
		return unidad;
	}

	@Override
	public UInmobiliaria modificarUInmobiliaria(UInmobiliaria uinmobiliaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarUInmobiliaria(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UInmobiliaria obtenerUInmobiliariaPorId(int id) {
		// TODO Auto-generated method stub
		return uinmobiliariaMapper.selectUInmobiliariaById(id);
	}

	@Override
	public List<UInmobiliaria> obtenerListaUInmobiliaria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UInmobiliaria> obtenerUInmobiliariaPorAdministrador(Administrador administrador) {
		// TODO Auto-generated method stub
		LOG.info(this.getClass().getName()+" administrador " +administrador.toString());
		List<UInmobiliaria> lista;
		lista = uinmobiliariaMapper.selectUInmobiliariaByAdministrador(administrador);
		LOG.info(this.getClass()+" administrador " + administrador.getId());
		return lista ;
	}

	@Override
	public UInmobiliaria obtenerUInmobiliariaPorUsuarioFinal(UsuarioFinal usuarioFinal) {
		// TODO Auto-generated method stub
		return uinmobiliariaMapper.selectUInmobiliariaByUsuarioFinal(usuarioFinal);
	}
	

}
