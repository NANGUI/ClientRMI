package appClientRmi;

import java.rmi.Naming;

import services.IDevoir;

public class AppClientRmi {

	public static void main(String[] args) {
		
		try {
			
			IDevoir stub = (IDevoir) Naming.lookup("rmi://localhost:1899/PONDA");
			
			stub.affichage(stub.saisie());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
