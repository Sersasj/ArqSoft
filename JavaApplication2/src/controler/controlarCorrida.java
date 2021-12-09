/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import telaMobile.UIApp;
import telaMobile.UICorridaFinalizada;
import telaMobile.UIEntrarAplicativo;

/**
 *
 * @author sergi
 */
public class controlarCorrida {
    private UIApp view;
    
    public controlarCorrida(){
        
    }
    
    public controlarCorrida(UIApp view){
        this.view = view;
        this.view.setVisible(true);
    }
    
    public void controla(){
        view.getFinalizar().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            new controlarFinalizarCorrida(new UICorridaFinalizada(view.getPlaca().getText(),view.getLinha().getText())).controla();
        });
        
        view.getEmergencia().addActionListener((ActionEvent actionEvent) -> {
            JOptionPane.showMessageDialog(view,
        "Emergência enviada com sucesso, aguarde em um local seguro");
        });
    }
}
