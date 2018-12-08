package br.edu.ifpb.intefaces;

import br.edu.ifpb.domain.Banda;
import java.util.List;

/**
 *
 * @author rodger
 */
public interface BandaInterface {
    
    boolean adicionar(Banda banda);

    List<Banda> bandas();

    Banda buscar(int id);

    boolean atualizar(Banda banda);

    boolean remover(Banda banda);
}
