/**
 * 
 */
package com.synergyj.cursos.webservices.sei;

/**
 * @author MAC_ISRA
 * Interface que expone el servicio SEI
 */
public interface TimeService {

	/**
	 * Obtiene la  fecha con formato long
	 * @return
	 */
	long getDateAsLong();
	
	/**
	 * Obtiene la fecha con formato String (dd/mm/yyyy)
	 * @return
	 */
	String getDateAsString();
	
}
