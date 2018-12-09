package br.edu.ifpb.jsf;

import br.edu.ifpb.domain.Banda;
import br.edu.ifpb.intefaces.BandaInterface;
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
public class ControladorDeBanda implements Serializable {
    
    @EJB
    private BandaInterface bandaIF;
    private Banda banda;
    
    public List<Banda> listar(){
        return this.bandaIF.bandas();
    }
    
    public String salvar(){
        this.bandaIF.adicionar(this.banda);
        return null;
    }
    
    public String atualizar(){
        this.bandaIF.atualizar(this.banda);
        return null;
    }
    
    public String deletar(){
        this.bandaIF.remover(this.banda);
        return null;
    }
        
    public String buscar(){
        this.bandaIF.buscar(this.banda.getId());
        return null;
    }
    
    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
      
}