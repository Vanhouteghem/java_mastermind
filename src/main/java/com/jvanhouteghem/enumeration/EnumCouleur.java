package com.jvanhouteghem.enumeration;

public class EnumCouleur {
	
	public enum Couleurs {
		AUCUN(0, "transparent", "t"),
	    ROUGE(1, "rouge", "r"),
	    BLEU(2, "bleu", "b"),
	    VERT(3, "vert", "v");

	    private int couleurId;
	    private String couleurNom;
	    private String couleurInitiale;

	    Couleurs(int couleurId, String couleurNom, String couleurInitiale) {
	        this.couleurId = couleurId;
	        this.couleurNom = couleurNom;
	        this.couleurInitiale = couleurInitiale;
	    }

	    public int couleurId() {
	        return couleurId;
	    }
	    
	    public String couleurNom() {
	        return couleurNom;
	    }
	    
	    public String couleurInitiale() {
	        return couleurInitiale;
	    }

	}
	
    public static String getCouleurById(int inputCouleurId){
    	String result = null;
        for (Couleurs status : Couleurs.values()) {
        	if (status.couleurId() == inputCouleurId){
        		//System.out.println(status);
        		result = status.couleurInitiale();
        		//System.out.println(result);
        	}
        }
        return result;
    }



}
