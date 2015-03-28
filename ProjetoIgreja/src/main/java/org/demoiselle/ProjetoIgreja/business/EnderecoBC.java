package org.demoiselle.ProjetoIgreja.business;

import org.demoiselle.ProjetoIgreja.domain.Endereco;
import org.demoiselle.ProjetoIgreja.persistence.EnderecoDAO;

import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class EnderecoBC extends DelegateCrud<Endereco, Long, EnderecoDAO>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		
	}

}
