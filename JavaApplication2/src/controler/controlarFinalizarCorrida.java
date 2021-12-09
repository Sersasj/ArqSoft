/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import telaMobile.UICorridaFinalizada;
import telaMobile.UIEntrarAplicativo;

/**
 *
 * @author sergi
 */
import telaMobile.UIApp;
public class controlarFinalizarCorrida {
    private UICorridaFinalizada view;
    
    
    public controlarFinalizarCorrida() {
    
    }
    
    public controlarFinalizarCorrida(UICorridaFinalizada view){
        this.view = view;
        this.view.setVisible(true);
        
    }
    
    public void controla(){
        view.getContinuar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new controlarCorrida(new UIApp(view.getPlaca().getText(),view.getLinha().getText())).controla();
        });
        view.getInicio().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new controlarEntrarAplicativo(new UIEntrarAplicativo()).controla();
        }); 
        view.getProblemas().addActionListener((ActionEvent actionEvent) -> {
            JOptionPane.showMessageDialog(view,
        "Problemas enviados com sucesso");
        });        
    }
    
}
