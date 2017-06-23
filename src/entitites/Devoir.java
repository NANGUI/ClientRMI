package entitites;

import java.io.Serializable;

public class Devoir implements Serializable{

	private int numero;
	private int note;
	private String matiere;
	
	public Devoir(){
		super();
	}
	public Devoir(int numero, int note, String matiere){
		this.numero = numero;
		this.note = note;
		this.matiere = matiere;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
}
