package br.edu.ifpb.intefaces;

import br.edu.ifpb.domain.Banda;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface Playlist {
    void adicionar(Banda banda);

    List<Banda> bandas();

    void remover(Banda banda);
    
    void finalizar();
    
}
