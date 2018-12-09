package br.edu.ifpb.jsf;

import br.edu.ifpb.domain.Banda;
import br.edu.ifpb.intefaces.Playlist;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ControladorPlaylist implements Serializable{
    
    @EJB
    Playlist playlist;
    
    public String adicionar(Banda banda){
        this.playlist.adicionar(banda);
        return null;
    }

    public List<Banda> bandas(){
        this.playlist.bandas();
        return null;
    }

    public String remover(Banda banda){
        this.playlist.remover(banda);
        return null;
    }
    
}
