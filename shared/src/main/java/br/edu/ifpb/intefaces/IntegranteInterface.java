package br.edu.ifpb.intefaces;

import java.util.List;

/**
 *
 * @author rodger
 */
public interface IntegranteInterface {
    
    boolean salvar(IntegranteInterface Integrantes);
    
    boolean deletar(int id);
    
    boolean atualizar(IntegranteInterface Integrante);
    
    List<IntegranteInterface> listarIntegrantes();
    
}
