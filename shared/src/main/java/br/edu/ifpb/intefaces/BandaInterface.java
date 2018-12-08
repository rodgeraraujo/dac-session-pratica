package br.edu.ifpb.intefaces;

import java.util.List;

/**
 *
 * @author rodger
 */
public interface BandaInterface {
    
    boolean salvar(BandaInterface banda);
    
    boolean deletar(int id);
    
    boolean atualizar(BandaInterface banda);
    
    List<BandaInterface> todasAsBandas();
    
}
