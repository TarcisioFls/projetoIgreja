package org.demoiselle.ProjetoIgreja.view;

import javax.inject.Inject;

import org.demoiselle.ProjetoIgreja.business.UsuarioBC;
import org.demoiselle.ProjetoIgreja.domain.Usuario;

import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@PreviousView("/formularioList.xhtml")
public class UsuarioEdit extends AbstractEditPageBean<Usuario, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioBC usuarioBC;

	@Override
	@Transactional
	public String delete() {
		this.usuarioBC.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {
		this.usuarioBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		this.usuarioBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected Usuario handleLoad(Long id) {
		return this.usuarioBC.load(id);
	}	

}
