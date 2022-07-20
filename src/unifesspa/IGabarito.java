package unifesspa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGabarito extends Remote{

	public String corrige(String msg) throws RemoteException;
	
}
