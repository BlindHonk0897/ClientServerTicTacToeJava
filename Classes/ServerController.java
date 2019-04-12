/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Guis.ServerApp;



/**
 *
 * @author alingasada_sd2021
 */
public class ServerController {

    public static void main(String []args){
        ServerApp app = new ServerApp();
        app.setVisible(true);
        app.runServer();
    }
    
}
