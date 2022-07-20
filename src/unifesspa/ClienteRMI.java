package unifesspa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteRMI {
	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));;
	 //bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a resposta: ");
			String s = bufferedReader.readLine();
			String objName = "rmi://localhost:1099/Gab";
			IGabarito gab = (IGabarito) Naming.lookup(objName);
			System.out.println("Correçao pelo gabarito: " + gab.corrige(s));
		}
//		System.out.println("Digite a resposta: ");
//		String s = bufferedReader.readLine();
//		String objName = "rmi://localhost:1099/Gab";
//		IGabarito gab = (IGabarito) Naming.lookup(objName);
//		System.out.println("Correçao pelo gabarito: " + gab.corrige(s));
	}
}
