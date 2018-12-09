package br.edu.ifpb.jsf;

import br.edu.ifpb.domain.Integrante;
import br.edu.ifpb.intefaces.IntegranteInterface;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ControladorDeIntegrante implements Serializable {

    //@EJB
    IntegranteInterface integranteIF;
    
    Integrante integrante;

    public String deletar() {
        this.integranteIF.deletar(integrante.getId());
        return null;
    }

    public String remover() {
        this.integranteIF.atualizar(integrante);
        return null;
    }

    public List<Integrante> atualizar() {
        this.integranteIF.listarIntegrantes();
        return null;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

}
