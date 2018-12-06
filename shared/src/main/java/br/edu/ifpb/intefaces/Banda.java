package br.edu.ifpb.intefaces;

import java.util.List;

/**
 *
 * @author rodger
 */
public interface Banda {
    
    boolean salvar(Banda banda);
    
    boolean deletar(int id);
    
    boolean atualizar(Banda banda);
    
    List<Banda> todasAsBandas();
    
}
