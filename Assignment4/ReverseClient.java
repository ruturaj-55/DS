import org.omg.CORBA.*;
import ReverseModule.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import java.util.*;

class ReverseClient{

    public static void main(String args[]){
        Reverse ReverseImpl = null;
        try{
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameServer");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Reverse";
            ReverseImpl = ReverseHelper.narrow(ncRef.resolve_str(name));
            System.out.println("Enter String=");
            Scanner sc = new Scanner(System.in);
            String str= sc.nextLine();
            String tempStr= ReverseImpl.reverse_string(str);
            System.out.println(tempStr);
        } 
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
