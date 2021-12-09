/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import telaDesktop.UICadastroMotorista;
import telaDesktop.UICadastroOnibus;
import telaDesktop.UICadastroRota;
import telaDesktop.UIDesktop;
import telaDesktop.UIHistorico;
import telaDesktop.UIRelatorio;

/**
 *
 * @author sergi
 */
public class controlarTelaDesktop {
    private UIDesktop view;
    
    public controlarTelaDesktop(UIDesktop view){
        this.view = view;
        this.view.setVisible(true);
        
    }  
    public void controla(){
        JComboBox valor = view.getCadastrar();

        view.getCadastrar().addActionListener((ActionEvent actionEvent) -> {
            if(valor.getSelectedItem().toString().equals("Motorista")){
            view.dispose();
            new controlarCadastroMotorista(new UICadastroMotorista()).controla();                
            }
            if(valor.getSelectedItem().toString().equals("Ônibus")){
            view.dispose();
            new controlarCadastroOnibus(new UICadastroOnibus()).controla();                
            }
            if(valor.getSelectedItem().toString().equals("Rota")){
            view.dispose();
            new controlarCadastroRota(new UICadastroRota()).controla();              
            }
        });
        
        view.getRelatorio().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new controlarRelatorio(new UIRelatorio()).controla();
        });
        view.getHistorico().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new controlarHistorico(new UIHistorico()).controla();
        });        
    } 
    /**
     * @param args the command line arguments
     */

    
}
