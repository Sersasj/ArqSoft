/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import java.awt.event.ActionEvent;
import telaDesktop.UIOpcao;
import telaMobile.UIEntrarAplicativo;
import javax.swing.JComboBox;
import telaMobile.UIApp;

/**
 *
 * @author sergi
 */
public class controlarEntrarAplicativo {

    
    private UIEntrarAplicativo view1;
    
    public controlarEntrarAplicativo(){
        
    }  
    
    public controlarEntrarAplicativo(UIEntrarAplicativo view1){
        this.view1 = view1;
        this.view1.setVisible(true);
        
    }     
    public void controla(){
        JComboBox valor = view1.getLinhasOnibus();
        
        view1.getConfirmar().addActionListener((ActionEvent actionEvent) -> {
            view1.dispose();
            new controlarCorrida(new UIApp(view1.getPlacaText().getText(),valor.getSelectedItem().toString())).controla();
        });  
        
    }
  
}       

