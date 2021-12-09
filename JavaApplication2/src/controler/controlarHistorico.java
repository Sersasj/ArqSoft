/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import telaDesktop.UIDesktop;
import telaDesktop.UIHistorico;

/**
 *
 * @author sergi
 */
public class controlarHistorico {
    private UIHistorico view;
    
    public controlarHistorico(){
        
    }
    
    public controlarHistorico(UIHistorico view){
        this.view = view;
        this.view.setVisible(true);
    }
    
    public void controla(){
    view.getFechar().addActionListener((ActionEvent actionEvent) -> {
        view.dispose();
        new controlarTelaDesktop(new UIDesktop()).controla();
    });
    }    
}
