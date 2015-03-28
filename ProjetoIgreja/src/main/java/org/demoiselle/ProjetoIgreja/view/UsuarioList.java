package org.demoiselle.ProjetoIgreja.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.demoiselle.ProjetoIgreja.business.UsuarioBC;
import org.demoiselle.ProjetoIgreja.domain.Usuario;

import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@NextView("/formularioEdit.xhtml")
@PreviousView("/formularioList.xhtml")
public class UsuarioList extends AbstractListPageBean<Usuario, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioBC usuarioBC;

	@Override
	protected List<Usuario> handleResultList() {
		return this.usuarioBC.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long>  iterator = getSelection().keySet().iterator(); iterator.hasNext();) {
			Long id = iterator.next();
			delete = getSelection().get(id);
			
			if (delete) {
				usuarioBC.delete(id);
				iterator.remove();
			}
		}
		return getPreviousView();
	}

}
