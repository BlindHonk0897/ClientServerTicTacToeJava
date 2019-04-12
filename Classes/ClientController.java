/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Guis.ClientApp;

/**
 *
 * @author 2ndyrGroupA
 */
public class ClientController {
    
    public static void main(String []args){
        ClientApp app = new ClientApp();
        app.setVisible(true);
        app.runClient();
    }
    
}
