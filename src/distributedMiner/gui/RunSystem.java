//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//::                                                                         ::
//::     Antonio Manuel Rodrigues Manso                                      ::
//::                                                                         ::
//::     I N S T I T U T O    P O L I T E C N I C O   D E   T O M A R        ::
//::     Escola Superior de Tecnologia de Tomar                              ::
//::     e-mail: manso@ipt.pt                                                ::
//::     url   : http://orion.ipt.pt/~manso                                  ::
//::                                                                         ::
//::     This software was build with the purpose of investigate and         ::
//::     learning.                                                           ::
//::                                                                         ::
//::                                                               (c)2023   ::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//////////////////////////////////////////////////////////////////////////////
package distributedMiner.gui;

import E_Vote.GUI.Main;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created on 05/12/2023, 08:47:09
 *
 * @author IPT - computer
 * @version 1.0
 */
public class RunSystem {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ServerMiner(10_010, 0, 0).setVisible(true);
        });
        java.awt.EventQueue.invokeLater(() -> {
            new ServerMiner(10_011, 400, 0).setVisible(true);
        });

        java.awt.EventQueue.invokeLater(() -> {
            new ServerMiner(10_012, 800, 0).setVisible(true);
        });
        java.awt.EventQueue.invokeLater(() -> {
            new ServerMiner(10_013, 0, 500).setVisible(true);
        });
        java.awt.EventQueue.invokeLater(() -> {
            new ServerMiner(10_014, 400, 500).setVisible(true);
        });
         java.awt.EventQueue.invokeLater(() -> {
            try {
                new Main("//localhost:10010/RemoteMiner").setVisible(true);
            } catch (RemoteException ex) {
                Logger.getLogger(RunSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202312050847L;
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2023  :::::::::::::::::::
    ///////////////////////////////////////////////////////////////////////////
}
