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
package distributedMiner;

import E_Vote.Classes.Eleicao;

/**
 * Created on 29/11/2023, 07:47:26
 *
 * @author IPT - computer
 * @version 1.0
 */
public interface MiningListener {

    public void onException(String title, Exception ex);

    public void onMessage(String title, String msg);

    public void onStartServer(String adress);

    public void onAddNode(RemoteInterface node);

    public void onStartMining(String message, int zeros);

    public void onStopMining(int nonce);

    public void onMining(int number);

    public void onNounceFound(int nonce);

    public void onUpdateTransactions(String transaction);
    
    public void onUpdateCandidate(String candidato);
    
    public void onUpdateEleitor(String eleitorpass, String eleitorname);
    
    public void onUpdateElection(Eleicao Election);
    
    public void onUpdateBlockchain();
    
    public void onConsensus(String title, String desc);
    


}
