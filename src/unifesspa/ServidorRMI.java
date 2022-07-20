package unifesspa;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {

	public static void main(String[] args) {
		try {
			// cria um objeto para se tornar acess�vel via rede
			IGabarito gab = new Gabarito();
			String objName = "rmi://localhost/Gab";
			System.out.println("Registrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(objName, gab);
			System.out.println("Aguardando Clientes!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
