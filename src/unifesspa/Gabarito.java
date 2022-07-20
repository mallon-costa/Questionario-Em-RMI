package unifesspa;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class Gabarito extends UnicastRemoteObject implements IGabarito{
	private String questao1 = "1;5;VVFF";
    private String questao2 = "2;2;FFFF";
    private String questao3 = "3;1;FVFV";
    private int quantAcertos = 0;
    
    public Gabarito() throws RemoteException { 
		//super() is allways called!
    }
    
	public String corrige(String msg) throws RemoteException{
		switch (msg.charAt(0)) {
   		case '1':
   			for(int i = 4; i <= 7; i++) {
   				if (Character.compare(msg.charAt(i), questao1.charAt(i))==0){
         		   quantAcertos++;
         	   }
   			}
   		break;
   		
   		case '2':
   			for(int i = 4; i <= 7; i++) {
   				if (Character.compare(msg.charAt(i), questao2.charAt(i))==0){
	            		   quantAcertos++;
	            	}
   			}
       	break;
       	
   		case '3':
   			for(int i = 4; i <= 7; i++) {
   				if (Character.compare(msg.charAt(i), questao3.charAt(i))==0){
	            		   quantAcertos++;
	            	}
   			}
       	break;
   		
   		default:
   			System.out.println("Alternativa nao encontrada!");
   		break;
   		
		}
		//char[] conc = (msg.charAt(0) + ";" + quantAcertos + ";" + (quantAcertos-1)).toCharArray();
   		//String saida = new String(conc);
		String resultado =(msg.charAt(0) + ";" + quantAcertos + ";" + (4-quantAcertos));
		quantAcertos = 0;
   		return resultado;
	}
}
