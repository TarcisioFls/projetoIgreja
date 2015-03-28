package org.demoiselle.ProjetoIgreja.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.demoiselle.ProjetoIgreja.business.EnderecoBC;
import org.demoiselle.ProjetoIgreja.domain.Endereco;

import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@NextView("/endereco/formularioEdit.xhtml")
@PreviousView("/endereco/formularioList.xhtml")
public class EnderecoList extends AbstractListPageBean<Endereco, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EnderecoBC enderecoBC;

	@Override
	protected List<Endereco> handleResultList() {
		return this.enderecoBC.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long>  iterator = getSelection().keySet().iterator(); iterator.hasNext();) {
			Long id = iterator.next();
			delete = getSelection().get(id);
			
			if (delete) {
				enderecoBC.delete(id);
				iterator.remove();
			}
		}
		return getPreviousView();
	}

}
