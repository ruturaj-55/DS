import java.rmi.*;

public class Client {
	public static void main(String args[]) {
		try {
			String addServerURL = "rmi://"+ args[0]+"/Server";
			ServerInterface addserverIntf = (ServerInterface)Naming.lookup(addServerURL);
			System.out.println("The first number is:"+args[1]);
			Double num1 = Double.parseDouble(args[1]);
			System.out.println("The second number is:"+args[2]);
			Double num2 = Double.parseDouble(args[2]);
			Double addition = addserverIntf.add(num1, num2);
			System.out.println("The Addition is:"+addition);
		}
		catch(Exception e) {
			System.out.println("Exception is:"+e);
		}
		
		
	}
}
