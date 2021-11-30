/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proeficiencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proeficiencia.Tela_Inicial.getConnection;

/**
 *
 * @author mathe
 */
public class DAOAlunos {
    public static ArrayList<Aluno> getList(){
        ArrayList<Aluno> ar = null;
        try {
            Connection bd = getConnection();
            PreparedStatement ps = bd.prepareStatement("SELECT * FROM matheuspeixoto.tb_resultado where idResultado > 1;");
            ResultSet rs = ps.executeQuery();
            ar = new ArrayList<Aluno>();
            
            while(rs.next()){
                Aluno a = new Aluno(rs.getString("ra"), rs.getDouble("pontos"));
                ar.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return ar;
        }
    }
    public static void main(String[] args) {
        for(Aluno a: getList()){
            System.out.println(a);
        }
    }
}
