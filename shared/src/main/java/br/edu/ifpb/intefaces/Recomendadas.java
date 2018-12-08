/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.intefaces;

import br.edu.ifpb.domain.Banda;
import java.util.List;

/**
 *
 * @author Cliente
 */
public interface Recomendadas {

    public void recomendar(Banda banda);

    public void removerRecomendacao(Banda banda);

    public List<Banda> listarRecomendacao();

}
