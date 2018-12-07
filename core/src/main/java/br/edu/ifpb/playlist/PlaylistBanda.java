package br.edu.ifpb.playlist;

import br.edu.ifpb.domain.Banda;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import br.edu.ifpb.domain.playlist.Playlist;
import java.util.ArrayList;
import java.util.Collections;
import javax.ejb.EJB;
import javax.ejb.Remove;

/**
 *
 * @author fernanda
 */
@Stateful
@Remote(Playlist.class)
public class PlaylistBanda implements Playlist {
  
    @EJB
    private List<Banda> bandas = new ArrayList<>();

    @Override
    public void adicionar(Banda banda) {
        this.bandas.add(banda);
    }

    @Override
    public List<Banda> bandas() {
        return Collections.unmodifiableList(this.bandas);
    }

    @Override
    public void remover(Banda banda) {
        this.bandas.remove(banda);
    }

    @Remove
    @Override
    public void finalizar() {
        System.out.println("--- Bandas ----");
        this.bandas.forEach(System.out::println);
    }

}
