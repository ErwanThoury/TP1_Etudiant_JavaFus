package sio.tp1_javafus;
/*
Modification dans Personnage.java :
perteKama (facile)
majStat (facile)
gainKama (facile-moyenne)
gainPV (facile)
attaqueTotale (facile-moyenne)
reduitAttaque (facile)
perdrePDV (facile-moyenne)
*/
public class Personnage {
    public String nom;
    private ClassePerso classeDuPerso;
    private int statAir;
    private int statTerre;
    private int statFeu;
    private int statEau;
    private int statVita;
    private int statVitaMax;
    private int nombreKama;
    private int critique;
    private int attaque;
    private int fuite;
    private int esquive;
    private int soin;
    private int defense;
    private int prospection;


    public Personnage(String nom, ClassePerso classeDuPerso) {
        this.nom = nom;
        this.classeDuPerso = classeDuPerso;
        this.statAir = 5;
        this.statTerre = 5;
        this.statFeu = 5;
        this.statEau = 5;
        this.nombreKama = 500;

        if ("Iop".equals(classeDuPerso.getNom()) )
        {
            this.statTerre += 4;
            this.statFeu -= 4;
        } else if ("Ecaflip".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statAir -= 4;
        } else if ("Cra".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statEau -= 4;
        } else if ("Eniripsa".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statTerre -= 4;
        } else if ("Feca".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statTerre -= 4;
        } else if ("Sadida".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statTerre -= 4;
        } else if ("Pandawa".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statAir -= 4;
        } else if ("Osamodas".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statEau -= 4;
        } else if ("Xelor".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statFeu -= 4;
        } else if ("Sram".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statFeu -= 4;
        } else if ("Enutrof".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statAir -= 4;
        } else if ("Sacrieur".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statEau -= 4;
        }
        majStat();
        this.statVita = this.statVitaMax;

    }



    public void majStat()
    {
        /* FACILE +0.5
        Cette fonction aura pour mission de mettre à jour les statistiques, c'est à dire qu'elle va devoir modifier les
        statistiques "secondaires" :
        - statVitaMax   ( 50 + feu * 2 + air * 0.5 + terre * 0.5 + eau * 0.5 )
        - fuite         ( 20 + air * 1.5 + feu * 0.5 + terre * 0.5 + eau * 0.5 )
        - attaque       ( terre * 1.5 + feu * 0.5 + eau * 0.5 + air * 0.5 )
        - defense       ( eau * 1.5 + feu * 0.5 + terre * 0.5 + air * 0.5 )
        - soin          ( 5 + feu * 5 )
        - prospection   ( 100 + eau * 5 )
        - esquive       ( 5 + air * 0.5 )
        - critique      ( 20 + terre * 1.5 )
        */
    }

    public int gainKama(int gain)
    {
        /* FACILE-MOYENNE +1
        Cette fonction va augmenter le nombre de kama en la possession du personnage grâce à l'entier en paramètre.
        /!\ Vous devez prendre en compte la prospection du personnage qui fonctionne comme un pourcentage d'augementation
        EXEMPLE :
        - si un personnage a 125 de prospection et qu'il gagne 200 kamas, il va toucher 200 * 125% = 250 kamas
        - si un personnage a 100 de prospection et qu'il gagne 200 kamas, il va toucher 200 * 100% = 200 kamas
         */
        return 0;
    }
    public void perteKama(int perte){
        /* FACILE +0.5
        Cette fonction retire au personnage un nombre de kama donné en paramètre.
        */

    }

    public int reduitAttaque(int degat)
    {
        /* FACILE +0.5
        Cette fonction aura pour mission de réduire les dégâts mis en paramètre par rapport à la défense.
        /!\ Vous ne devez pas retourner un entier négatif car cela risquerait de soigner le personnage, si les dégâts
        deviennent négatifs, il faudra alors retourner 0.
        */
        return degat;
    }
    public int perdrePDV(int degat)
    {
        /* FACILE-MOYENNE +1
        Cette fonction aura pour mission de faire perdre des points de vie actuels au personnage par rapport au paramètre degat.
        Cette fonction retournera en plus le nombre de dêgats que le personnage a subit au total.
        La formule est : 0.5 * degat + reduitAttaque(degat)
                                         \__ reduitAttaque correspondant à la fonction ci-dessus
        Par ailleurs, il faudra prendre en compte la statistique esquive, qui permet au personnage de ne prendre aucun dégât si le jet est réussi.
        EXEMPLE :
        - Le personnage qui a 20 d'esquive aura 20% de chance de ne rien subir du tout.
        */
        return degat;
    }

    public void gainPV()
    {
        /* FACILE +0.5
        Cette fonction aura pour mission d'augmenter les points de vie actuels du personnage par rapport à son soin.
        /!\ Les points de vie actuels ne doivent pas dépasser les points de vie max.
        EXEMPLES :
        - Le personnage a 25 points de vie actuels et 60 points de vie max, il a également 20 soins, il montera alors à 45 points de vie actuels.
        - Le personnage a 55 points de vie actuels et 60 points de vie max, il a également 30 soins, il montera alors à 60 points de vie actuels.
        */
    }

    public int attaqueTotale()
    {
        /* FACILE-MOYENNE +1
        retourne l'attaque totale du personnage. Les dégâts totaux sont doublés si le personnage fait un coup critique.
        EXEMPLES :
        - Le personnage a 20 de critique et 10 d'attaque, il a donc 20% de faire un coup critique pour passer de 10 à 20 dégâts.
        - Le personnage a 55 de critique et 15 d'attaque, il a donc 55% de faire un coup critique pour passer de 15 à 30 dégâts.
        */
        return 0;
    }

    // ------------------------------------------- les accesseurs --------------------------------------------------- //
    public int getCritique() {return critique;}

    public int getAttaque() {return attaque;}

    public int getFuite() {return fuite;}

    public int getEsquive() {return esquive;}

    public int getSoin() {return soin;}

    public int getDefense() {return defense;}

    public int getProspection() {return prospection;}

    public String getNom() {return nom;}

    public ClassePerso getClasseDuPerso() {return classeDuPerso;}

    public int getStatAir() {return statAir;}

    public int getStatTerre() {return statTerre;}

    public int getStatFeu() {return statFeu;}

    public int getStatEau() {return statEau;}

    public int getStatVita() {return statVita;}

    public int getStatVitaMax() {return statVitaMax;}

    public int getNombreKama() {return nombreKama;}

    // -------------------------------------------------------------------------------------------------------------- //
    public void setStatVita(int statVita) {this.statVita = statVita;}


    // --------------------------------- Cadeau --------------------------------------------------------------------- //
    public boolean jetDeFuite()
    {
        if(alea() <= this.fuite)
            return true;
        return false;
    }
    public boolean jetDeEsquive()
    {
        if(alea() <= this.esquive)
            return true;
        return false;
    }
    public int alea() { return (int)(Math.random() * 101 );}
    public void gainAir(int gain)
    {
        this.statAir += gain;
    }
    public void gainEau(int gain)
    {
        this.statEau += gain;
    }
    public void gainFeu(int gain)
    {
        this.statFeu += gain;
    }
    public void gainTerre(int gain)
    {
        this.statTerre += gain;
    }
    public int retourneDefense(int degat)
    {
        degat = perdrePDV(degat);
        return degat;
    }
    // -------------------------------------------------------------------------------------------------------------- //

}
