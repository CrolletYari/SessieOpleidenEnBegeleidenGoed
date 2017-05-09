package main;

import javax.swing.JOptionPane;

import domain.Product;
import domain.Winkel;

public class Main {

	public static void main(String[] args) {
		Winkel winkel = new Winkel();
		int keuze = -1;
		while(keuze != 0){
			keuze = Integer.parseInt(JOptionPane.showInputDialog("1.Voeg product toe\n2. Bekijk producten\n3. Bekijk Product\n\n0.Sluit"));
			switch(keuze){
			case 1:
				String naam = JOptionPane.showInputDialog("Wat is de naam van het product");
				String beschrijving = JOptionPane.showInputDialog("Wat is de beschrijving van het product");
				Double prijs = Double.parseDouble(JOptionPane.showInputDialog("Wat is de prijs van het product"));
				winkel.VoegProductToe(new Product(naam,beschrijving,prijs));
				break;
			case 2:
				String result = "";
				for(Product p: winkel.getProducten()){
					result += "Naam: "+ p.getNaam() + " Beschrijving: "+ p.getBeschrijving()+" Prijs: "+p.getPrijs()+"\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case 3:
				String naamProduct = JOptionPane.showInputDialog("Geef de naam van het product dat je wil zoeken");
				Product p = winkel.getProduct(naamProduct);
				String resultString = "Naam: "+p.getNaam()+" Beschrijving: " +p.getBeschrijving()+" Prijs: "+p.getPrijs();
				JOptionPane.showMessageDialog(null, resultString);
			}
		}
	}

}
