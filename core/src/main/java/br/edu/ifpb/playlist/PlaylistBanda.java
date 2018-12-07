package br.edu.ifpb.playlist;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author fernanda
 */

@Stateful
public class Playlist {
    
    @EJB
    private List<Banda> bandas = new CopyOnWriteArrayList<>();
    
    public void novaBanda(Banda banda){
        this.bandas.add(banda);
    }
    
    public void removerBanda(Banda banda) {
        this.bandas.remove(banda);
    }

    public List<String> listarBandas() {
        return Collections.unmodifiableList(bandas);
    }
}
