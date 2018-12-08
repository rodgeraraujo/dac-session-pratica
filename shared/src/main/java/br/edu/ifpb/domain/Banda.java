package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rodger
 */
public class Banda implements Serializable{
    private int id;
    private String nomeFantasia;
    private String localOrigem;
    private String urlDoPerfil;

    public Banda() {
    }

    public Banda(int id, String nomeFantasia, String localOrigem, String urlDaPerfil) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.localOrigem = localOrigem;
        this.urlDoPerfil = urlDaPerfil;
    }

    public Banda(String nomeFantasia, String localOrigem, String urlDaPerfil) {
        this.nomeFantasia = nomeFantasia;
        this.localOrigem = localOrigem;
        this.urlDoPerfil = urlDaPerfil;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getUrlDoPerfil() {
        return urlDoPerfil;
    }

    public void setUrlDoPerfil(String urlDaPerfil) {
        this.urlDoPerfil = urlDaPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 97 * hash + Objects.hashCode(this.localOrigem);
        hash = 97 * hash + Objects.hashCode(this.urlDoPerfil);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.localOrigem, other.localOrigem)) {
            return false;
        }
        if (!Objects.equals(this.urlDoPerfil, other.urlDoPerfil)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nomeFantasia=" + nomeFantasia + ", localOrigem="
                + localOrigem + ", urlDaPerfil=" + urlDoPerfil + '}';
    }

}
