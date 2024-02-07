package sio.tp1_javafus;
/*
Modification Monstre.java :
Constructeur + attributs (facile)
reduitAttaque (facile)
perdrePDV (facile)
attaqueTotale (facile)
*/
public class Monstre {
    /* FACILE +1
    Un monstre a pour attributs :
    - nom en chaîne de caractères
    - img en en chaîne de caractères
    - pvActuel en entier
    - pvMax en entier
    - attaque en entier
    - defense en entier
    - coupCritique en entier
    - kamaGagneMax en entier
    - kamaGagneMin en entier
    Vous devrez veiller à les déclarer. /!\ à l'encapsulation
    Par ailleurs, il faudra créer le constructeur.
    */



    public int reduitAttaque(int degat)
    {
        /* FACILE +0.5
        Cette fonction aura pour mission de réduire les dégâts mis en paramètre par rapport à la défense.
        /!\ Vous ne devez pas retourner un entier négatif car cela risquerait de soigner le monstre, si les dégâts
        deviennent négatifs, il faudra alors retourner 0.
        */
        return degat;
    }

    public int perdrePDV(int degat)
    {
        /* FACILE +0.5
        Cette fonction aura pour mission de faire perdre des points de vie actuels au monstre par rapport au paramètre degat.
        Cette fonction retournera en plus le nombre de dêgats que le monstre a subit au total.
        La formule est : 0.5 * degat + reduitAttaque(degat)
                                         \__ reduitAttaque correspondant à la fonction ci-dessus
        */
        return degat;
    }

    public int attaqueTotale()
    {
        /* FACILE +0.5
        retourne l'attaque totale du personnage. Les dégâts totaux sont doublés si le monstre fait un coup critique.
        EXEMPLES :
        - Le monstre a 20 de critique et 10 d'attaque, il a donc 20% de faire un coup critique pour passer de 10 à 20 dégâts.
        - Le monstre a 55 de critique et 15 d'attaque, il a donc 55% de faire un coup critique pour passer de 15 à 30 dégâts.
        */
        return 0;
    }

    // ------------------------------------------- les accesseurs --------------------------------------------------- //
    public String getNom() {
        return nom;
    }

    public String getImg() {
        return img;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getKamaGagneMax() {
        return kamaGagneMax;
    }

    public int getKamaGagneMin() {
        return kamaGagneMin;
    }
    // -------------------------------------------------------------------------------------------------------------- //
    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    // -------------------------------------- cadeau ---------------------------------------------------------------- //
    public int alea() { return (int)(Math.random() * 101 );}

    // -------------------------------------------------------------------------------------------------------------- //



}
