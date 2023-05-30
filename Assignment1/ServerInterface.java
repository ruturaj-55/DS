
import java.rmi.*;
import java.rmi.server.*;

public interface ServerInterface extends Remote{
	double add(Double a, Double b) throws RemoteException;
}
