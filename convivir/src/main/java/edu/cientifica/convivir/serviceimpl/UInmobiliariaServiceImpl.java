package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.UInmobiliariaMapper;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.service.UInmobiliariaService;

@Service
public class UInmobiliariaServiceImpl implements UInmobiliariaService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired 
	UInmobiliariaMapper uinmobiliariaMapper;
	
	@Transactional
	@Override
	public UInmobiliaria registrarUInmobiliaria(UInmobiliaria uinmobiliaria) {
		
		if (uinmobiliaria.getId()==null) {
			uinmobiliaria.setId(uinmobiliariaMapper.selectNewId());
		}
		if (uinmobiliariaMapper.insertUInmobiliaria(uinmobiliaria)<1) {
			uinmobiliaria = null;
		}else {
			uinmobiliariaMapper.insertAdministrador(uinmobiliaria);
		}
		
		LOG.info("registrarUInmobiliaria: "+uinmobiliaria);
		return uinmobiliaria;
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
		return null;
	}

	@Override
	public List<UInmobiliaria> obtenerListaUInmobiliaria() {
		// TODO Auto-generated method stub
		return null;
	}

}
