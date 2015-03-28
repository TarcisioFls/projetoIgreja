package org.demoiselle.ProjetoIgreja.business;

import org.demoiselle.ProjetoIgreja.domain.Usuario;
import org.demoiselle.ProjetoIgreja.persistence.UsuarioDAO;

import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class UsuarioBC extends DelegateCrud<Usuario, Long, UsuarioDAO>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		
	}

}
