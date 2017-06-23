package services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entitites.Devoir;

public interface IDevoir extends Remote {

	public Devoir saisie() throws RemoteException;
	public void affichage(Devoir d) throws RemoteException;
}
