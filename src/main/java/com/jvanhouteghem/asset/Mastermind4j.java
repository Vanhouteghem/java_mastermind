package com.jvanhouteghem.asset;

import java.util.ArrayList;
import java.util.List;

import com.jvanhouteghem.enumeration.EnumCouleur;

public class Mastermind4j {
	
	// ---------------------------------------------------------------------------------
	
	ArrayList listCombinaisonATrouver = new ArrayList();
	
	// -------------------------------- Get / Set --------------------------------------

	public ArrayList getlistCombinaisonATrouver() {
		return listCombinaisonATrouver;
	}
	
	public void affichelistCombinaisonATrouver(){
		System.out.print("-- Mode triche : ");
		for (int i = 0 ; i < listCombinaisonATrouver.size() ; i++){
			System.out.print(listCombinaisonATrouver.get(i) + " ");
		}
		System.out.println();
	}
	
	// ----------------------------------------------------------------------------------
	
	public ArrayList creerCombinaisonAleatoire(int nbCombinaison){
		
		for (int i = 0 ; i < nbCombinaison ; i++){
			int tmpRandom = Generique.getRandomWithLimit(0,3);
			String couleurChoisie = EnumCouleur.getCouleurById(tmpRandom);
			listCombinaisonATrouver.add(couleurChoisie);
		}
		return listCombinaisonATrouver;
	}
	
	// Retourne un tableau avec des boolean pour chaque partie de la combinaison
	public ArrayList comparerCombinaisonExacte(ArrayList listCombinaisonAComparer){
		
		ArrayList resultat = new ArrayList();
		
		// Pour chaque valeur cac de listCombinaisonAComparer
		for (int i = 0; i<listCombinaisonAComparer.size() ; i++){
			// Pour chaque valeur cat de listCombinaisonATrouver
			if (listCombinaisonAComparer.get(i).equals(getlistCombinaisonATrouver().get(i))){
				resultat.add(true);
			} 
			else {
				resultat.add(false);
			}
		}
		return resultat;
	}
	
	// Retourne un tableau avec des boolean pour chaque partie de la combinaison mal placée
	public int comparerCombinaisonPresque(ArrayList listCombinaisonAComparer){
		int result = 0;
		
		// Récupération de la position des positions vraies
		ArrayList exact = comparerCombinaisonExacte(listCombinaisonAComparer);
		//Generique.afficheArrayListContenu(exact);
		
		// Pour chaque valeur cac de listCombinaisonAComparer
		for (int i = 0; i<listCombinaisonAComparer.size() ; i++){
			if (!(listCombinaisonAComparer.get(i).equals(getlistCombinaisonATrouver().get(i)))){
				for (int j = 0 ; j < getlistCombinaisonATrouver().size() ; j++){
					if (
						listCombinaisonAComparer.get(i).equals(getlistCombinaisonATrouver().get(j))
						&& 	exact.get(i) != "true"
						){
							result++;
							break;
					}
				}
			}
		}

		return result;
	}

}
