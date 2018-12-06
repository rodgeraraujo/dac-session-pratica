/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.domain.banda;

import java.util.List;

/**
 *
 * @author rodger
 */
public interface Banda {
    void adicionar(Banda banda);

    List<Banda> bandas();

    void remover(Banda banda);
    
}
