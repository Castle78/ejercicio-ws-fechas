/**
 * 
 */
package com.synergyj.cursos.webservices.sib;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sei.TimeService;

/**
 * 
 * @author MAC_ISRA
 *
 */
public class TimeServiceImpl implements TimeService {
	private static final Logger logger  = LoggerFactory.getLogger(TimeServiceImpl.class);
	SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
	
	/* (non-Javadoc)
	 * @see com.synergyj.cursos.webservices.sei.TimeService#getDateAsLong()
	 */
	public long getDateAsLong() {
		// TODO Auto-generated method stub
		Date fecha = new Date();
		logger.debug("Obteniendo la fecha Long " + fecha.getTime());
		return fecha.getTime();
	}

	/* (non-Javadoc)
	 * @see com.synergyj.cursos.webservices.sei.TimeService#getDateAsString()
	 */
	public String getDateAsString() {
		// TODO Auto-generated method stub
		String strDate = "";
		Date fechaActual = new Date();
		strDate = sm.format(fechaActual);
		logger.debug("Obteniedo la fecha de tipo String "+ strDate);
		return strDate;
	}

}
