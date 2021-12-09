/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import telaDesktop.UICadastroRota;
import telaDesktop.UIDesktop;

/**
 *
 * @author sergi
 */
public class controlarCadastroRota {
    private UICadastroRota view;
    
    public controlarCadastroRota(){
        
    }
    public controlarCadastroRota(UICadastroRota view){
    this.view = view;
    this.view.setVisible(true);
        
    }   
    public void controla(){
        
        view.getFechar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new controlarTelaDesktop(new UIDesktop()).controla();
        });  
        view.getSalvar().addActionListener((ActionEvent actionEvent) -> {
            JOptionPane.showMessageDialog(view,
        "Rota cadastrada com sucesso");            
            view.dispose();
            new controlarTelaDesktop(new UIDesktop()).controla();
        });          
        
    }    
}
