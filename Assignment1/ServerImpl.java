import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface {

	protected ServerImpl() throws RemoteException {}

	@Override
	public double add(Double a, Double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a + b;
	}
	
}
