/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proeficiencia;

/**
 *
 * @author mathe
 */
public class Aluno {
    String ra;
    double pontos;

    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public Aluno(String ra, double pontos) {
        this.ra = ra;
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", pontos=" + pontos + '}';
    }
    
    
}
