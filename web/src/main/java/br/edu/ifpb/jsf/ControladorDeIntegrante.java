package br.edu.ifpb.jsf;

import br.edu.ifpb.domain.Integrante;
import br.edu.ifpb.intefaces.IntegranteInterface;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author rodger
 */
@Named
@SessionScoped
//@RequestScoped
public class ControladorDeIntegrante implements Serializable{
    
    @EJB
    IntegranteInterface integranteIF;
    Integrante integrante; 
    
    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
        
    public List<Integrante> listar(){        
        this.integranteIF.listarIntegrantes();        
        return null;
    }
    
    public String salvar(){        
        this.integranteIF.salvar(integrante);        
        return null;
    }
    
    public String atualizar(){
        this.integranteIF.atualizar(integrante);
        return null;   
    }
    
    public String deletar(){
        this.integranteIF.deletar(integrante.getId());        
        return null;
    }
    
}