/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.jsf;

import br.edu.ifpb.domain.Banda;
import br.edu.ifpb.intefaces.BandaInterface;
import br.edu.ifpb.intefaces.Recomendadas;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cliente
 */

@ManagedBean
@RequestScoped
public class ControladorRecomendados {
    
@EJB
    private Recomendadas recomendadas;
    private Banda banda;
    private BandaInterface bandaIF;
    
    
    public String recomendar(Banda banda) {

        this.recomendadas.recomendar(banda);
        return null;
    }
     
    public String Remover(Banda banda){
        this.recomendadas.removerRecomendacao(banda);
        return null;
    }
    
    public List<Banda>Recomendadas(){
        this.recomendadas.listarRecomendacao();
        return null;
    }
    
    //bandaDestaque é o nome da página onde vai ficar a banda em destaque
     public String SelecionarDestaque(Banda banda){
        return "bandaDestaque?faces-redirect=true&id="+banda.getId();
    }
     
    public String BandaDestaque(){
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
