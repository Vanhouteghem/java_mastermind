package com.jvanhouteghem.asset;

import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Generique {
	
	// Récupération d'un random avec min et max inclus
	public static int getRandomWithLimit(int min, int max){
		int randomNum = min + (int)(Math.random() * (max+1));
		return randomNum;
	}
	
	// Affichage du contenu d'un ArrayList
	public static void afficheArrayListContenu(ArrayList input){
		
		for (int i = 0; i < input.size() ; i++){
			System.out.println(input.get(i));
		}
		
	}
	
	// Demande au joueur de saisir une combinaison
	public static ArrayList askQuestion(){
		System.out.println("Sélectionnez les 5 possibilités séparées par des virgule, exemple : v, b, r, v, v");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		
		// Split la réponse pour pouvoir la comparer plus tard
		List<String> tmpReponseJoueurList = Arrays.asList(username.split(","));
		ArrayList tmpReponseJoueurArrayList = new ArrayList<String>(tmpReponseJoueurList);
		
		return tmpReponseJoueurArrayList;
	}
	
	// Compte le nombre de valeurs dans un ArrayList, s'utilise pour compter le nombre de bonne réponse
	public static int countNumberOfWantedValue(ArrayList reponse, boolean value){
		int result = 0;
		for (int i =0; i < reponse.size() ; i++){
			if (reponse.get(i).equals(value)){
				result++;
			}
		}
		return result;
	}

}
