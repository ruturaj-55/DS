import java.rmi.*;

public class Server {
	public static void main(String args[]) {
		try {
			ServerImpl addServerimpl = new ServerImpl();
			Naming.bind("Server", addServerimpl);
		}
		catch(Exception e) {
			System.out.println("Exception " + e);
		}
	}
	
}
