package br.edu.ifpb.jsf;

import br.edu.ifpb.intefaces.BandaInterface;
import br.edu.ifpb.domain.Banda;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author rodger
 */
@Named
@SessionScoped
public class ControladorDeBanda implements Serializable {
    
    @EJB
    BandaInterface bandaIF;
    
    Banda banda;

    public BandaInterface getBandaIF() {
        return bandaIF;
    }
    
    public String salvar(){
        this.bandaIF.adicionar(banda);
        return null;
    }

    public String remover(){
        this.bandaIF.remover(banda);
        return null;
    }
    
    public String atualizar(){
        this.bandaIF.atualizar(banda);
        return null;
    }
    
    public String listar(){
        this.bandaIF.bandas();
        return null;
    }
    
    public String buscar(Banda banda){
        this.bandaIF.buscar(banda.getId());
        return null;
    }
    
    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
    
}
