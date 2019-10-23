import java.rmi.Remote;
import java.rmi.RemoteException;

//Create Remote interface for our application
public interface Hello extends Remote {
    void printMsg() throws RemoteException;
}


 