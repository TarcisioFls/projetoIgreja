package org.demoiselle.ProjetoIgreja.view;

import org.demoiselle.ProjetoIgreja.business.EnderecoBC;
import org.demoiselle.ProjetoIgreja.domain.Endereco;

import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@PreviousView("/formulario/formulario.xhtml")
public class EnderecoEdit extends AbstractEditPageBean<Endereco, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EnderecoBC enderecoBC;

	@Override
	@Transactional
	public String delete() {
		this.enderecoBC.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {
		this.enderecoBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	public String update() {
		this.enderecoBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected Endereco handleLoad(Long id) {
		return this.enderecoBC.load(id);
	}

}
