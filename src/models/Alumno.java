package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author MANUEL LOZA
 */
@Entity
@Table(name = "Alumno")
public class Alumno {

    @Id
    private String cveAlu;

    @Column(name = "nomAlu", nullable = false, length = 80)
    private String nomAlu;

    @Column(name = "edaAlu", nullable = false)
    private int edaAlu;

    @ManyToOne
    @JoinColumn(name = "cveGru")
    private Grupo cveGru;

    public Alumno() {
    }

    public Alumno(String cveAlu, String nomAlu, int edaAlu, Grupo cveGru) {
        this.cveAlu = cveAlu;
        this.nomAlu = nomAlu;
        this.edaAlu = edaAlu;
        this.cveGru = cveGru;
    }

    public String getCveAlu() {
        return cveAlu;
    }

    public void setCveAlu(String cveAlu) {
        this.cveAlu = cveAlu;
    }

    public String getNomAlu() {
        return nomAlu;
    }

    public void setNomAlu(String nomAlu) {
        this.nomAlu = nomAlu;
    }

    public int getEdaAlu() {
        return edaAlu;
    }

    public void setEdaAlu(int edaAlu) {
        this.edaAlu = edaAlu;
    }

    public Grupo getCveGru() {
        return cveGru;
    }

    public void setCveGru(Grupo cveGru) {
        this.cveGru = cveGru;
    }

    @Override
    public String toString() {
        return this.getNomAlu() + " " + this.getEdaAlu();
    }

}
