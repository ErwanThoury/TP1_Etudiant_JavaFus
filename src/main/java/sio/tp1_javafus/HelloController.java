package sio.tp1_javafus;
/*
                                          #***********#
                                        ***++++++==--==++**
                                      #*+++++*+-------:.::=+
                                    **++++---==-----:.    ..:+
                                  **++++=:::::------.        .=*
                                #*++++++=:::::------:     .   .=+*
                               **+++++++++=-==-------..       .--+*#
                              *++++++++++*++++--------:..    ..-.:+**
                            #*++++++++++****++=----------:..:-----+++*
                           *++++++++====++*****+=======-:..:--=---++++*
                          *+++++====++*###*++===-:::-=+-   .=-----=++++*
                         *+++**=====***+=--::::::::...:-...:++---===**++*#
                        *+++#%%*++====-::::::::-----:::::=++==--=++*##*++*#
                       *+++#%%%%%#==-::::::::-+#%%*+=-::::-===+*#*++*##*++*
                      *+++#%%%##*==-::::::::+##******+==::=#####*=====+**++*
                     *+++#%%%***==-:::::::::#%%%%#####+==:=######+======++++*
                    *+++#%%%#**+==-:::::::::+%%%######+==-*######*+======++++*
                   #*++*%%%%#***==-:::::::::-*%%#####*+++*##***###*+=======+++*
                   *++*%%%%%%#**+==:::::::::::=*############***#####+=======+++#
                  *+++%#*#%%%%%#*==-::::::::::::--=+*################+=======++*
                 #*++#%%%%%%%%%%%+==::::::::::::::::::------=+*#######*======+++*
                 *++*%%%%%%%%%%%%#+=-::::::::::::::::::::::::::--=+*###*======+++*
                #+++#%%%%%%%%%%%%%#+==-:::::::::::::::::::::::::::::-+*#*+====+++*
                *++*%%%%%%%%%##%%%%%*+=-::::::::::::::::::::::::::::::-+*#+====+++*
               %*++#%%%%%%%%#***%%%%%%#+=--:::::::::::::::::::::::::...::*#====+++*#
               *+++%%%%%%%%%%###%%%%%%%%****************++==-::::::. . .::=*===+*++*
               *++*%%%%%%#%%%%%%%%%%%%%******#######*******+==::::::.   .::=+===**+*%
               *++#%%%%#####%%%%%%%%%%%******#######********+==-::::::.:::::=+==**++*
              #+++#%%%%#####%%%%%%%%%%%#****########********#+==-::::::::::::===+*++*
              #+++%##%%%%%%%%%%%%%%%%%%%%#***#######******####+==:::...::::::-==+*++*%
              *++*####%%%%#****#%%%%%%%#=--:--*###############*==-::::::::::::==+#+++#
              *++*%%%%%%%*******#%%%%%#=::::::-*###############===::::::::::::-=+#+++*
              *++#%%%%%%#*******#%%%%%#=:::::::*##########*****+==:::::::::::::==**++*
              *++#####%*********%%%%%%%#+--:--*###########*****+==:::::::::::::==**++*
              *++######*********####%%%%%#########**#######***#+==-::::::::::::=+#*++*
              *++#####********++=-+#**#%%########****####*#####+==:::::::::::::-+*+++*
              *++*%####*****+==-:-*****#%%#######***##******###+==:::::::::::::-+**++*
              #++*#####***+==-:::+#****#%%##***#######*********==-:::::::::::::=**+++#
               *+*#######+==:::::#%***#%%%##***##**###********+==-:::::::::::::+***+*
               *++######***=--:::#%***#%%%%#####****##********===:::::::::::::-***++*
               #+**#####***++++==*%%%%%%##**#****************+==::::::::::::::+***++#
                ***#####***++++++*##%%%#********************+==-:::::::::::::=****+*
                #***####***+++++++*##%%%#*****************++=-::::::::::::::=******#
                 ****####**+==+++++*#%%%###*************++=--::::::::::::::-***+++*
                 #*+**####**+++++++++**#####*********++==-::::::::::::::::-***+++*
                  #++**####**++=++++++++++***++++++==--::::::::::::::::::-****++*
                   #****####***++++++++++++++:::::::::::::::::::::::::::-*******
                    #****####***++++++++++++=::::::::::::::::::::::::::=*******
                      *++**####***++++++++++-::::::::::::::::::::::::-+*******
                       **++*#####***+++++++=:::::::::::::::::::::::=+*******#
                         **+**######***+++-::::::::::::::::::::--=+*+++++*#
                           #******#####*++==------::::::-----=+****++++*
                              #******++*************************++++*#
                                 ****++++++++++***+++++++++++++****
                                     #************************#
*/

/*
Modification Controller.java :
aleatoireMonstre (facile-moyenne)
onClickCreatePerso (moyenne)
GoToMonstre (facile-moyenne)
ClickGoToZoneTofu (facile)
GoToFichePerso (moyenne)
GoToAlea (difficile)
ClickImageAttaque (moyenne)
ClickImageFuite (moyenne)
ClickImageSoin (moyenne)
achatTest (moyenne)
*/
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class HelloController implements Initializable {
    @FXML
    private ImageView imgJouer;
    @FXML
    private ImageView imgPortrait;
    @FXML
    private ImageView imgStatPersoDefense;
    @FXML
    private ImageView imgStatPersoVie;
    @FXML
    private ImageView imgStatPersoFeu;
    @FXML
    private ImageView imgStatPersoProspection;
    @FXML
    private ImageView imgStatPersoEsquive;
    @FXML
    private ImageView imgStatPersoFuite;
    @FXML
    private ImageView imgStatPersoSoin;
    @FXML
    private ImageView imgStatPersoEau;
    @FXML
    private ImageView imgStatPersoAir;
    @FXML
    private ImageView imgStatPersoTerre;
    @FXML
    private ImageView imgStatPersoCritique;
    @FXML
    private ImageView imgStatPersoAttaque;
    @FXML
    private Label lblSlash1;
    @FXML
    private Label lblSlash2;
    @FXML
    private ImageView imgCoeurAllie;
    @FXML
    private ImageView imgZoneNomClasse;
    @FXML
    private AnchorPane apChoixZone;
    @FXML
    private ImageView imgChoixFichePerso;
    @FXML
    private Label lblNomAllie;
    @FXML
    private TextField txtNomPerso;
    @FXML
    private ImageView imgAlea;
    @FXML
    private ImageView imgBoutonSoin;
    @FXML
    private AnchorPane apChoixAction;
    @FXML
    private ImageView imgFond;
    @FXML
    private ImageView imgBarreDuHaut;
    @FXML
    private ImageView imgChoixMonstre;
    @FXML
    private ImageView imgBarreDuBas;
    @FXML
    private ImageView imgPotionRappel;
    @FXML
    private ImageView imgBoutonDefense;
    @FXML
    private ImageView imgMonstreCraqueleur;
    @FXML
    private ImageView imgLogoClasse;
    @FXML
    private ImageView imgStatMalus;
    @FXML
    private ImageView imgClasseChoix;
    @FXML
    private ImageView imgMonstreCbt;
    @FXML
    private AnchorPane apCommencement;
    @FXML
    private ImageView imgBoss;
    @FXML
    private ImageView imgInterfaceCombatAllie;
    @FXML
    private TextArea txtClasses;
    @FXML
    private AnchorPane apCombat;
    @FXML
    private ImageView imgStatBonus;
    @FXML
    private Label lblNomEnnemi;
    @FXML
    private ImageView imgBoutonAttaque;
    @FXML
    private ImageView imgBoutonFuite;
    @FXML
    private ImageView imgFlecheBonus;
    @FXML
    private AnchorPane apChoixAstrub;
    @FXML
    private ImageView imgChoixBoutique;
    @FXML
    private ImageView imgFlecheMalus;
    @FXML
    private Label lblNomClasse;
    @FXML
    private ImageView imgCoeurEnnemi;
    @FXML
    private ImageView imgMonstreTofu;
    @FXML
    private ImageView imgPersonnageCbt;
    @FXML
    private ImageView imgMonstreBouftou;
    @FXML
    private ImageView imgInterfaceCombatEnnemi;
    @FXML
    private ListView lvClasses;
    @FXML
    private Label lblCritiquePagePerso;
    @FXML
    private Label lblEsquivePagePerso;
    @FXML
    private Label lblVieActuellePagePerso;
    @FXML
    private Label lblProspectionPagePerso;
    @FXML
    private Label lblFeuPagePerso;
    @FXML
    private Label lblTerrePagePerso;
    @FXML
    private Label lblKama;
    @FXML
    private ImageView imgParchFeu;
    @FXML
    private Label lblAirPagePerso;
    @FXML
    private Label lblParchFeuMarchand;
    @FXML
    private Label lblFuitePagePerso;
    @FXML
    private Label lblParchEauMarchand;
    @FXML
    private Label lblVieMaxPagePerso;
    @FXML
    private Label lblParchAirMarchand;
    @FXML
    private ImageView imgParchTerre;
    @FXML
    private AnchorPane apBoutique;
    @FXML
    private Label lblKamaMarchand;
    @FXML
    private Label lblParchTerreMarchand;
    @FXML
    private ImageView imgParchAir;
    @FXML
    private AnchorPane apPagePerso;
    @FXML
    private Label lblSoinPagePerso;
    @FXML
    private ImageView imgFondBoutique;
    @FXML
    private Label lblAttaquePagePerso;
    @FXML
    private Label lblDefensePagePerso;
    @FXML
    private ImageView imgParchEau;
    @FXML
    private Label lblEauPagePerso;
    @FXML
    private ImageView imgClassePagePerso;
    @FXML
    private HBox hbCombat;
    @FXML
    private Label lblVieActuelleEnnemi;
    @FXML
    private Label lblVieMaxEnnemi;
    @FXML
    private Label lblVieMaxAllie;
    @FXML
    private Label lblVieActuelleAllie;
    @FXML
    private Label lblTypeMonstre;
    @FXML
    private Label lblClasseCombat;
    private String versionGraphique = "unPointVingtNeuf/"; // prend "unPointVingtNeuf/" ou "deuxPointZero/";
    private String mapCourante;
    private String bonusStat;
    private String malusStat;
    int intNumberZone = 0;
    /*
    0 = Astrub
    1 = Tofu
    2 = Bouftou
    3 = Craqueleur
     */

    //---------------------------------------------------------------------------------
    // Tofu
    //---------------------------------------------------------------------------------
    Monstre monstreTofuMineur = new Monstre("Tofu furtif"
            , "monstreTofuMineur.png"
            , 10
            , 10
            , 3
            , 30
            , 12
            , 20);
    Monstre monstreTofu = new Monstre("Tofukaz agile"
            , "monstreTofu.png"
            , 15
            , 10
            , 5
            , 30
            , 20
            , 30);
    Monstre monstreTofuMajeur = new Monstre("Grofu heureux"
            , "monstreTofuMajeur.png"
            , 20
            , 5
            , 20
            , 15
            , 25
            , 35);
    Monstre monstreTofuRoyal = new Monstre("Tofu Royal"
            , "monstreTofuRoyal.png"
            , 50
            , 20
            , 10
            , 50
            , 500
            , 1000);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // Bouftou
    //---------------------------------------------------------------------------------
    Monstre monstreBouftouMineur = new Monstre("Boufton intimidé"
            , "monstreBouftouMineur.png"
            , 50
            , 10
            , 10
            , 20
            , 50
            , 100);
    Monstre monstreBouftou = new Monstre("Bouftou assoupi"
            , "monstreBouftou.png"
            , 75
            , 10
            , 15
            , 20
            , 80
            , 120);
    Monstre monstreBouftouMajeur = new Monstre("Boufcroute énervé"
            , "monstreBouftouMajeur.png"
            , 100
            , 15
            , 20
            , 20
            , 100
            , 140);
    Monstre monstreBouftouRoyal = new Monstre("Bouftou Royal"
            , "monstreBouftouRoyal.png"
            , 250
            , 25
            , 30
            , 20
            , 1000
            , 1500);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // Craqueleur
    //---------------------------------------------------------------------------------
    Monstre monstreCraqueleurMineur = new Monstre("Craqueboule téméraire"
            , "monstreCraqueleurMineur.png"
            , 80
            , 20
            , 15
            , 30
            , 80
            , 130);
    Monstre monstreCraqueleur = new Monstre("Craqueleur terrible"
            , "monstreCraqueleur.png"
            , 110
            , 25
            , 22
            , 35
            , 130
            , 200);
    Monstre monstreCraqueleurMajeur = new Monstre("Craqueterre monstrueux"
            , "monstreCraqueleurMajeur.png"
            , 150
            , 30
            , 35
            , 40
            , 170
            , 240);
    Monstre monstreCraqueleurRoyal = new Monstre("Craqueleur Majestueux"
            , "monstreCraqueleurRoyal.png"
            , 350
            , 50
            , 55
            , 45
            , 1500
            , 2000);

    Monstre mimic;
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // CLASSES
    //---------------------------------------------------------------------------------
    ClassePerso iop = new ClassePerso("Iop", "iop.png", "Les Iops sont des guerriers fonceurs et sans reproche ! Une chose est sûre : les Iops savent faire parler les armes. D'ailleurs, se retrouver pris dans une bagarre au moins une fois par jour est pour eux un signe de bonne santé. Leur tempérament impétueux fait des Iops des paladins de l'extrême, capables du meilleur... comme du pire !", "Terre", "Feu");
    ClassePerso eniripsa = new ClassePerso("Eniripsa", "eniripsa.png", "Les Eniripsas sont des guérisseurs qui soignent d'un simple Mot. Ils utilisent le pouvoir de la parole pour soulager les souffrances de leurs alliés, mais parfois aussi pour blesser leurs ennemis. Certains Eniripsas sont même devenus de véritables arpenteurs du verbe, des rôdeurs des langues oubliées.", "Feu", "Terre");
    ClassePerso osamodas = new ClassePerso("Osamodas", "osamodas.png", "Les Osamodas sont des dompteurs nés ! Ils ont le pouvoir d'invoquer des créatures et sont de remarquables dresseurs. Une rumeur prétend qu'ils taillent leurs vêtements dans la peau de leurs ennemis, mais allez donc leur demander ce qu'il en est… Si vous êtes de son côté, un Osamodas sera aux petits soins pour vous. Dans le cas contraire, peut-être terminerez-vous votre vie sous la forme d'une botte ou d'un bonnet fourré.", "Feu", "Eau");
    ClassePerso feca = new ClassePerso("Feca", "feca.png", "Les Fécas sont de loyaux protecteurs toujours sur la défensive. Ils sont appréciés dans les groupes d'aventuriers pour leurs armures élémentaires et leur capacité à encaisser les coups durs. Ils sont également maîtres dans l’art des signes magiques : quand il va y avoir du grabuge, les Fécas sortent leurs glyphes !", "Eau", "Terre");
    ClassePerso sacrieur = new ClassePerso("Sacrieur", "sacrieur.png", "Les Sacrieurs sont des berserkers qui décuplent leurs forces dès qu'ils sont frappés ! N'ayant pas peur de recevoir des coups, ni de s'exposer aux blessures, ils seront souvent en première ligne, prêts à verser le premier sang ! Le Sacrieur est vraiment le compagnon idéal pour vos longues soirées guerrières…", "Terre", "Eau");
    ClassePerso cra = new ClassePerso("Cra", "cra.png", "Les Crâs sont des archers aussi fiers que précis ! Ils font des alliés précieux contre les adeptes de la mêlée franche. Restant à distance, décochant leurs traits empennés dans le moindre orifice laissé sans surveillance, ils ne laissent aucun répit à leurs adversaires !", "Air", "Eau");
    ClassePerso sadida = new ClassePerso("Sadida", "sadida.png", "Les Sadidas sont des invocateurs qui empoisonnent la vie de leurs ennemis ! Apprivoiser les Ronces pour en faire des armes terrifiantes, confectionner des poupées de guerre et de soins, voilà qui satisfait tout disciple Sadida digne de ce nom.", "Feu", "Terre");
    ClassePerso enutrof = new ClassePerso("Enutrof", "enutrof.png", "Les Enutrofs sont des chasseurs de trésor avides de kamas, qui malgré leur grand âge courent comme des dragodindes à la vue d'un coffre bien rempli. Ils sont experts dans l’art de ralentir leurs ennemis : ils peuvent ainsi les harceler avant de les assommer à grands coups de pelle le moment venu !", "Eau", "Air");
    ClassePerso sram = new ClassePerso("Sram", "sram.png", "Les Srams sont des assassins qui aiment les bourses, rebondies de préférence. Trousser les pans d'une tunique, tâter le fond d'une poche, faire preuve de doigté, palper enfin des bijoux tant convoités avant de poser un piège ou d'asséner un coup mortel, voilà la vie d'un disciple de Sram !", "Air", "Feu");
    ClassePerso xelor = new ClassePerso("Xelor", "xelor.png", "Les Xélors sont des mages qui maîtrisent le temps et toutes les mécaniques qui donnent l'heure : carillons, horloges, et pendules leur obéissent au doigt et à l'œil. Les Xélors jouent donc avec le temps pour ralentir un ennemi ou se téléporter où bon leur semble.", "Air", "Feu");
    ClassePerso ecaflip = new ClassePerso("Ecaflip", "ecaflip.png", "Les Ecaflips sont des guerriers joueurs qui se fourrent dans les endroits où l'on peut gagner gros, et perdre beaucoup… Un Ecaflip bien dans sa peau parie sans arrêt, pour tout et pour rien. Mais attention, il prend le jeu très au sérieux et ira même jusqu'à risquer sa vie sur un jet de dés pour tenter de remporter la mise…", "Terre", "Air");
    ClassePerso pandawa = new ClassePerso("Pandawa", "pandawa.png", "Les Pandawas sont des guerriers adeptes des arts martiaux qui savent faire des folies de leurs corps ! Ils peuvent même en faire avec le corps des autres… Le Pandawa sait comment soulever les foules, il porte ses alliés sur ses épaules pour mieux les protéger. Quant à ses ennemis, il les enverra valser dans le décor, avant de fêter sa victoire avec une bonne rasade de lait de bambou !", "Eau", "Air");
    //---------------------------------------------------------------------------------

    Personnage p = new Personnage("Null", sadida);
    ClassePerso c;
    Monstre m = new Monstre("Null", "monstreTofuMajeur.png", 0,0,0,0,0,0);



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        changeImageViewImg(imgFond, "Maps/zoneMenu.png");
        visible(apCommencement);

        lvClasses.getItems().add("Sram");
        lvClasses.getItems().add("Iop");
        lvClasses.getItems().add("Cra");
        lvClasses.getItems().add("Feca");
        lvClasses.getItems().add("Pandawa");
        lvClasses.getItems().add("Xelor");
        lvClasses.getItems().add("Sadida");
        lvClasses.getItems().add("Osamodas");
        lvClasses.getItems().add("Sacrieur");
        lvClasses.getItems().add("Eniripsa");
        lvClasses.getItems().add("Enutrof");
        lvClasses.getItems().add("Ecaflip");
        lvClasses.getSelectionModel().selectFirst();

        clickChangeClasse(new Event(null));

    }

    // Création personnage ------------------------------------------------------------------------------------------ //
    public void ohZutRebelote()
    {
        clearAll();
        changeImageViewImg(imgFond, "Maps/zoneMenu.png");
        visible(apCommencement);

        clickChangeClasse(new Event(null));
    }
    @FXML
    public void clickChangeClasse(Event event) {
        if ("Iop".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(iop);
            c = iop;
        } else if ("Ecaflip".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(ecaflip);
            c = ecaflip;
        } else if ("Cra".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(cra);
            c = cra;
        } else if ("Eniripsa".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(eniripsa);
            c = eniripsa;
        } else if ("Feca".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(feca);
            c = feca;
        } else if ("Sadida".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(sadida);
            c = sadida;
        } else if ("Pandawa".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(pandawa);
            c = pandawa;
        } else if ("Osamodas".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(osamodas);
            c = osamodas;
        } else if ("Xelor".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(xelor);
            c = xelor;
        } else if ("Sram".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(sram);
            c = sram;
        } else if ("Enutrof".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(enutrof);
            c = enutrof;
        } else if ("Sacrieur".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(sacrieur);
            c = sacrieur;
        }
    }
    public void setClasse(ClassePerso classe) {

        lblNomClasse.setText(classe.getNom().toUpperCase());
        txtClasses.setPromptText(classe.getDescription());
        Font f = new Font("Franklin Gothic Medium", 18);
        txtClasses.setFont(f);
        changeImageViewImg(imgLogoClasse, "Logo/"+classe.getLogoURL());
        changeImageViewImg(imgStatBonus, "Statistiques/stat"+classe.getBonus()+".png");
        changeImageViewImg(imgStatMalus, "Statistiques/stat"+classe.getMalus()+".png");
        changeImageViewImg(imgClasseChoix, "Classes/"+classe.getLogoURL());
        changeImageViewImg(imgPortrait, "Portrait/"+classe.getLogoURL());
        malusStat = classe.getMalus();
        bonusStat = classe.getBonus();
        if(!versionGraphique.equals("deuxPointZero/"))
        {
            deleteEffect(imgStatMalus);
            deleteEffect(imgStatBonus);
            deleteEffect(imgFlecheBonus);
            deleteEffect(imgFlecheMalus);
        }
        else{
            changeEffect(imgStatBonus, bonusStat);
            changeEffect(imgStatMalus, malusStat);
            changeEffect(imgFlecheBonus, "Up");
            changeEffect(imgFlecheMalus, "Down");
        }

    }

    @FXML
    public void onClickCreatePerso(Event event) {
        /* MOYENNE +1.5
        Cette fonction devra affecter à l'objet p, initialisé ligne 346, le personnage avec :
        - le nom saisi dans txtNomPerso
        - la classe c (déclarée ligne 347 mais affectée dans la fonction clickChangeClasse) choisie dans la listView.
        Il faudra ensuite appelé la fonction clickGoToAstrub pour pouvoir se rendre sur la carte des choix.
        */
    }

    // -------------------------------------------------------------------------------------------------------------- //

    // GoTo Function, fonction permettant de passer d'un mode à l'autre --------------------------------------------- //
    @FXML
    public void clickGoToAstrub(Event event) {
        clearAll();
        changeImageViewImg(imgFond, "Maps/zoneChoix.png");
        visible(apChoixAstrub);
        changeZone("Maps/zoneChoix.png", apChoixAstrub);
    }
    @FXML
    public void GoToZoneMonstre(Event event) {
        /* FACILE-MOYENNE +1
        Cette fonction aura pour objectif de changer l'image de fond (imgFond) en l'image de chemin "Maps/zoneMonstre.png"
        Il vous sera alors FORTEMENT recommandé de bien regarder les fonctions proposés tout en bas, notamment changeZone.
        En effet, il faudra par ailleurs mettre en avant l'AnchorPane "apChoixZone"
        */
    }
    @FXML
    public void ClickGoToZoneTofu(Event event) {
        /* FACILE +0.5
        Cette fonction doit affecter à intNumberZone, déclaré ligne 208, la valeur 1 (valeur correspondante à la zone tofu)
        Comme pour la fonction précédente, tu devras mettre l'image de chemin "Maps/zoneTofu.png" en nouvelle image de fond (imgFond)
        et tu devras mettre en avant l'AnchorPane apChoixAction



        Indice : Tu n'as pas à faire cette fonction pour les deux autres zones (craqueleur et bouftou)
        */
    }

    @FXML
    public void GoToFichePerso(Event event) {
        /* MOYENNE +1.5
        Dans cette fonction, tu devras changer la zone (changer l'image imgFond avec l'image de chemin "Maps/zonePersonnage.png
                                                        + mettre en avant l'AnchorPane apPagePerso)
        Ensuite, tu devras penser à afficher toutes les stats du personnage au bon label
        EXEMPLES :
            -> la statistique air du personnage ira dans le label lblAirPagePerso
            -> la statistique critique du personnage ira dans le label lblCritiquePagePerso
        Enfin, vous devrez changer l'imageView imgClassePagePerso pour y placer l'image de chemin "Classes/classe_du_perso.png"
        Les fonctions writeRapideInt et changeImageViewImg en bas de fichier peuvent vous être d'une grande aide.
        */
    }
    @FXML
    public void GoToBoutique(Event event) {
        changeZone("Maps/zoneMarchand.png", apBoutique);
        writeRapideInt(lblKamaMarchand, p.getNombreKama());
        writeRapideInt(lblParchAirMarchand, p.getStatAir());
        writeRapideInt(lblParchEauMarchand, p.getStatEau());
        writeRapideInt(lblParchFeuMarchand, p.getStatFeu());
        writeRapideInt(lblParchTerreMarchand, p.getStatTerre());
    }
    @FXML
    public void goToBoss(Event event) {
        if (intNumberZone == 1) {
            changeZone("Maps/zoneTofu.png", apCombat);
            m = monstreTofuRoyal;
        } else if (intNumberZone == 2) {
            changeZone("Maps/zoneBouftou.png", apCombat);
            m = monstreBouftouRoyal;
        } else if (intNumberZone == 3) {
            changeZone("Maps/zoneCraqueleur.png", apCombat);
            m = monstreCraqueleurRoyal;
        } else {
            aleatoireMonstre(monstreCraqueleurRoyal, monstreBouftouRoyal, monstreTofuRoyal);
        }
        fight();
    }
    public void aleatoireMonstre(Monstre m1, Monstre m2, Monstre m3) {
        /* FACILE-MOYENNE (+1)
        Cette fonction doit affecter à l'objet monstre, initialisé ligne 348, l'une des trois valeurs mises en paramètre.
        le m1 aura 60% de chance d'être affecté, m2 aura 30% de chance et m3 aura 10% de chance.
        */
    }
    @FXML
    public void ClickGoToZoneBouftou(Event event) { intNumberZone = 2; changeZone("Maps/zoneBouftou.png", apChoixAction); }
    @FXML
    public void ClickGoToZoneCraqueleur(Event event) { intNumberZone = 3; changeZone("Maps/zoneCraqueleur.png", apChoixAction); }
    @FXML
    public void goToAlea(Event event) {
        /* DIFFICILE +7
        Cette fonction va diriger le joueur vers deux issues :
        70% de croiser un monstre
        30% de croiser un coffre

        ---- MONSTRE ----
        Si l'évènement MONSTRE est choisi par le hasard, le "mode combat" va se lancer.
        Il faudra alors mettre en avant l'AnchorPane apCombat + changer l'imgFond (voir plus bas)
        Selon la zone intNumberZone dans laquelle se trouve le personnage, il faudra :
        - Mettre la bonne image de fond imgFond
            -> 1 : "Maps/zoneTofu.png"
            -> 2 : "Maps/zoneBouftou.png"
            -> 3 : "Maps/zoneCraqueleur.png"
        - Affecter un monstre aléatoire à l'objet m grâce à la fonction aleatoireMonstre créée plus haut.
            -> 1 : monstreTofuMineur ou monstreTofu ou monstreTofuMajeur
            -> 2 : monstreBouftouMineur ou monstreBouftou ou monstreBouftouMajeur
            -> 3 : monstreCraqueleurMineur ou monstreCraqueleur ou monstreCraqueleurMajeur
        enfin il faudra appeler la fonction fight().


        ---- COFFRES ----
        Si l'évènement MONSTRE est choisi par le hasard, l'utilisateur se verra proposer deux choix :
        (l'ouvrir) ou (tourner les talons et retourner à Astrub grâce à la fonction clickGoToAstrub)
        Si l'utilisateur choisit de l'ouvrir, voici les possibilités et leur probabilité :
        - 30% de chance de tomber sur un coffre piégé qui fera alors perdre des points de vie au personnage.
            Les points de vie perdus de base sont de 20 et sont multipliés par le niveau de la zone intNumberZone.
            Il faudra alors vérifier si le personnage a plus de 0 pv, à l'aide de la fonction mortBool() déclarée plus bas.
            Vous indiquerez les dégâts pris dans une alert, puis si le personnage et toujours vivant, vous appelerez la fonction clickGoToAstrub.

        - 50% de chance de tomber sur un coffre donnant 200 kamas de base. Cette somme est multipliée par le niveau de la zone intNumberZone.
            Vous utiliserez une alert pour indiquer le nombre de kamas gagnés puis vous appelerez la fonction clickGoToAstrub.
        - 20% de lancer un combat (rendre visible l'apCombat + lancer la fonction fight) face au monstre "Mimic"
            que vous devrait affecter à l'objet m déclaré plus haut.
            Les statistiques de base sont 50 pv 10 attaque 10 defense 10 critique 100 kamaMin 150 kamaMax et son image a pour chemin "monstreCoffre.png"
            Ses statistiques sont multipliées par le niveau de la zone intNumberZone
         */




    }
    // -------------------------------------------------------------------------------------------------------------- //






    // -------------------------------------------- Mode Combat ----------------------------------------------------- //
    @FXML
    public void ClickImageAttaque(Event event) {

        /* MOYENNE +2
        Quand cette fonction est lancée, le Personnage p attaque le Monstre m est lui fait subir son attaqueTotale.
        Si le Monstre m n'est pas mort (pv > 0), le Monstre m attaque à son tour avec son attaqueTotale.
        Il faudra penser à bien mettre les pv à jour (utiliser vitaMaj serait une bonne idée par exemple !)
        Il faudra, enfin, vérifier si le personnage P est toujours vivant.
        /!\, si le personnage tue le Monstre m, il ne faudra pas que ce dernier puisse infliger malgré tout des dégâts au Personnage p.
        */
    }
    @FXML
    public void ClickImageDefense(Event event) {

        int degatSubi = p.retourneDefense(m.attaqueTotale());
        if (!mortBool()) {
            m.perdrePDV(degatSubi);
            mortMonstre();
            vitaMaj();
        }


    }
    @FXML
    public void ClickImageFuite(Event event) {
        /* MOYENNE +2
        Cette fonction teste la fuite du Personnage p.
        Comment sait-on si la fuite est réussie ? Il faudra utiliser la statistique fuite + la fonction alea().
        EXEMPLES :
            - "Goultard" a 20 de fuite, il a donc 20% de chance de s'enfuir.
            - "Yugo" a 55 de fuite, il a donc 55% de s'enfuir.
        le Personnage p qui réussit à s'enfuir ne subit pas de dégât et peut utiliser la fonction clickGoToAstrub.
        le Personnage p qui ne réussit pas à s'enfuir se fait attaquer par le Monstre m
        Il faudra alors vérifier si le Personnage p est mort, et si ce n'est pas le cas, mettre à jour ses points de vie dans l'affichage à l'aide de vitaMaj().
        */


    }
    @FXML
    public void ClickImageSoin(Event event) {
        /* MOYENNE +1.5
        Le Personnage p se soigne grâce à la fonction gainPV()
        Malgré tout, le monstre attaque ensuite à l'aide de son attaqueTotale.
        Enfin, il faudra mettre à jour les points de vie à l'aide de vitaMaj() et vérifier si le joueur est mort.
        */

    }
    public boolean mortBool()
    {
        if(p.getStatVita()<=0){
            Alert mortAff = new Alert(Alert.AlertType.INFORMATION);
            mortAff.setContentText("Vous êtes mort ...");
            mortAff.setHeaderText("MORT !");
            mortAff.showAndWait();
            ohZutRebelote();
            return true;
        }
        return false;
    }
    public boolean mortMonstre()
    {
        if(m.getPvActuel() <= 0)
        {
            clickGoToAstrub(null);
            int gain = p.gainKama(intervalleInt(m.getKamaGagneMin(), m.getKamaGagneMax()));
            Alert coffreGain = new Alert(Alert.AlertType.INFORMATION);
            ImageView imageKama = new ImageView(getClass().getResource(
                    "/Images/"+versionGraphique+"Monstres/"+m.getImg()
            ).toExternalForm());
            imageKama.setFitWidth(100);
            imageKama.setFitHeight(100);
            coffreGain.setGraphic(imageKama);
            coffreGain.setContentText("Quelle chance ! Vous avez trouvé "+gain+" kamas sur le "+m.getNom());
            coffreGain.setTitle("Kamas !");
            coffreGain.setHeaderText("");
            coffreGain.showAndWait();
            return true;
        }
        return false;
    }

    public void fight()
    {
        hbCombat.setVisible(true);
        m.setPvActuel(m.getPvMax());
        changeImageViewImg(imgMonstreCbt, "Monstres/"+m.getImg());
        changeImageViewImg(imgPersonnageCbt, "Classes/"+p.getClasseDuPerso().getLogoURL());
        writeRapideInt(lblVieActuelleAllie, p.getStatVita());
        writeRapideInt(lblVieMaxAllie, p.getStatVitaMax());
        writeRapideInt(lblVieActuelleEnnemi, m.getPvActuel());
        writeRapideInt(lblVieMaxEnnemi, m.getPvMax());
        lblNomAllie.setText(p.getNom());
        lblNomEnnemi.setText(m.getNom());
    }

    public void vitaMaj()
    {
        writeRapideInt(lblVieActuelleAllie, p.getStatVita());
        writeRapideInt(lblVieActuelleEnnemi, m.getPvActuel());
        return;
    }
    // -------------------------------------------------------------------------------------------------------------- //


    // ----------------------------------------- Mode marchand ------------------------------------------------------ //
    @FXML
    public void ClickUpEau(Event event) {
        if(achatTest())
            p.gainEau(1);
        statMajBoutique();

    }
    @FXML
    public void ClickUpFeu(Event event) {
        if(achatTest())
            p.gainFeu(1);
        statMajBoutique();
    }
    @FXML
    public void ClickUpAir(Event event) {
        if(achatTest())
            p.gainAir(1);
        statMajBoutique();
    }
    @FXML
    public void ClickUpTerre(Event event) {
        if(achatTest())
            p.gainTerre(1);
        statMajBoutique();
    }
    public void statMajBoutique()
    {
        p.majStat();
        writeRapideInt(lblParchAirMarchand, p.getStatAir());
        writeRapideInt(lblParchFeuMarchand, p.getStatFeu());
        writeRapideInt(lblParchEauMarchand, p.getStatEau());
        writeRapideInt(lblParchTerreMarchand, p.getStatTerre());
        writeRapideInt(lblKamaMarchand,p.getNombreKama());
    }
    public boolean achatTest()
    {
        /* MOYENNE +1.5
        Cette fonction retourne true si le Personnage p a assez de kamas (il lui faut au moins 250 kamas pour acheter un parchemin
        S'il n'a pas assez de kamas, la fonction va retourner false et devra afficher une alerte indiquant la somme manquante.
        */
        return true;

    }
    // -------------------------------------------------------------------------------------------------------------- //

    // -------------------------------------------------------------------------------------------------------------- //
    // -------------------------------------------------------------------------------------------------------------- //
    // ------------------------- Ci-gisent mes fonctions que vous pourrez utiliser à votre guise -------------------- //
    // -------------------------------------------------------------------------------------------------------------- //
    // -------------------------------------------------------------------------------------------------------------- //

    // Genere un nombre aleatoire entre 0 et 100. ------------------------------------------------------------------- //
    public int alea() { return (int)(Math.random() * 101 ); } // 0 to 100

    // Prend un entier qui ira remplir le label. -------------------------------------------------------------------- //
    public void writeRapideInt(Label lblTexte, int intTexte)
    {
        lblTexte.setText(Integer.toString(intTexte));
        return;
    }

    // Prend une image qui ira remplacer l'image view --------------------------------------------------------------- //
    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/Images/"+versionGraphique+linkImage
                        ).toExternalForm()
                )
        );
        if (imgView == imgFond)
            mapCourante = linkImage;
    }

    // Rend visible/invisible une AnchorPane ------------------------------------------------------------------------ //
    public void invisible(AnchorPane apCourante){apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}

    // Change de zone ----------------------------------------------------------------------------------------------- //
    public void changeZone(String ZoneURL, AnchorPane ZoneAP)
    {
        clearAll();
        changeImageViewImg(imgFond, ZoneURL);
        visible(ZoneAP);
        return;
    }

    // Cache toutes les AnchorPanes --------------------------------------------------------------------------------- //
    public void clearAll()
    {
        invisible(apBoutique);
        invisible(apChoixAction);
        invisible(apPagePerso);
        invisible(apCombat);
        invisible(apChoixZone);
        invisible(apChoixAstrub);
        invisible(apCommencement);
        hbCombat.setVisible(false);
    }

    // Donne un entier compris entre a et b ------------------------------------------------------------------------- //
    public int intervalleInt(int a, int b)
    {
        Random random = new Random();
        return random.nextInt((b - a) + 1) + a;
    }

    // Change la version graphique du jeux -------------------------------------------------------------------------- //
    @FXML
    public void clickChangeVersion(Event event) {
        if(versionGraphique.equals("deuxPointZero/"))
        {
            versionGraphique = "unPointVingtNeuf/";
            deleteEffect(imgStatMalus);
            deleteEffect(imgStatBonus);
            deleteEffect(imgFlecheBonus);
            deleteEffect(imgFlecheMalus);
            lblVieActuelleAllie.setTextFill(Color.BLACK);
            lblVieMaxAllie.setTextFill(Color.BLACK);
            lblVieActuelleEnnemi.setTextFill(Color.BLACK);
            lblVieMaxEnnemi.setTextFill(Color.BLACK);
            lblSlash1.setTextFill(Color.BLACK);
            lblSlash2.setTextFill(Color.BLACK);
            deleteEffect(imgAlea);
        }
        else{
            versionGraphique = "deuxPointZero/";
            changeEffect(imgStatBonus, bonusStat);
            changeEffect(imgStatMalus, malusStat);
            changeEffect(imgFlecheBonus, "Up");
            changeEffect(imgFlecheMalus, "Down");
            lblVieActuelleAllie.setTextFill(Color.WHITE);
            lblVieMaxAllie.setTextFill(Color.WHITE);
            lblVieActuelleEnnemi.setTextFill(Color.WHITE);
            lblVieMaxEnnemi.setTextFill(Color.WHITE);
            lblSlash1.setTextFill(Color.WHITE);
            lblSlash2.setTextFill(Color.WHITE);
            changeEffect(imgAlea, "White");

        }
        changeImageViewImg(imgPortrait, "Portrait/"+c.getLogoURL());
        changeImageViewImg(imgFond, mapCourante);
        changeImageViewImg(imgMonstreBouftou, "Monstres/monstreBouftou.png");
        changeImageViewImg(imgMonstreTofu, "Monstres/monstreTofuMineur.png");
        changeImageViewImg(imgMonstreCraqueleur, "Monstres/monstreCraqueleur.png");
        changeImageViewImg(imgLogoClasse, "Logo/"+c.getLogoURL());
        changeImageViewImg(imgClasseChoix, "Classes/"+c.getLogoURL());
        changeImageViewImg(imgPersonnageCbt, "Classes/"+p.getClasseDuPerso().getLogoURL());
        changeImageViewImg(imgMonstreCbt, "Monstres/"+m.getImg());
        changeImageViewImg(imgBarreDuBas, "Interfaces/fond.png");
        changeImageViewImg(imgBarreDuHaut, "Interfaces/barreWindows.png");
        changeImageViewImg(imgFlecheBonus, "Interfaces/flecheVerte.png");
        changeImageViewImg(imgFlecheMalus, "Interfaces/flecheRouge.png");
        changeImageViewImg(imgJouer, "Interfaces/interfaceValider.png");
        changeImageViewImg(imgChoixFichePerso,"Interfaces/pointBleu.png");
        changeImageViewImg(imgChoixBoutique, "Interfaces/pointRouge.png");
        changeImageViewImg(imgChoixMonstre, "Interfaces/pointMarron.png");
        changeImageViewImg(imgParchAir, "Parchemins/parcheminAir.png");
        changeImageViewImg(imgParchEau, "Parchemins/parcheminEau.png");
        changeImageViewImg(imgParchFeu, "Parchemins/parcheminFeu.png");
        changeImageViewImg(imgParchTerre, "Parchemins/parcheminTerre.png");
        changeImageViewImg(imgBoutonAttaque, "Combat/combatAttaqueTerre.png");
        changeImageViewImg(imgBoutonDefense, "Combat/combatDefenseEau.png");
        changeImageViewImg(imgBoutonFuite, "Combat/combatFuiteAir.png");
        changeImageViewImg(imgBoutonSoin, "Combat/combatSoinFeu.png");
        changeImageViewImg(imgStatPersoAir, "Statistiques/statAir.png");
        changeImageViewImg(imgStatPersoFeu, "Statistiques/statFeu.png");
        changeImageViewImg(imgStatPersoTerre, "Statistiques/statTerre.png");
        changeImageViewImg(imgStatPersoEau, "Statistiques/statEau.png");
        changeImageViewImg(imgStatPersoAttaque, "Statistiques/statAttaque.png");
        changeImageViewImg(imgStatPersoCritique, "Statistiques/statCritique.png");
        changeImageViewImg(imgStatPersoDefense, "Statistiques/statDefense.png");
        changeImageViewImg(imgStatPersoProspection, "Statistiques/statPros.png");
        changeImageViewImg(imgStatPersoFuite,"Statistiques/statFuite.png");
        changeImageViewImg(imgStatPersoEsquive, "Statistiques/statEsquive.png");
        changeImageViewImg(imgStatPersoVie, "Statistiques/statVita.png");
        changeImageViewImg(imgStatPersoSoin, "Statistiques/statSoin.png");
        changeImageViewImg(imgStatMalus, "Statistiques/stat"+malusStat+".png");
        changeImageViewImg(imgStatBonus, "Statistiques/stat"+bonusStat+".png");
        changeImageViewImg(imgClassePagePerso,"Classes/"+p.getClasseDuPerso().getLogoURL());
        changeImageViewImg(imgCoeurAllie, "Statistiques/statVita.png");
        changeImageViewImg(imgCoeurEnnemi, "Statistiques/statVita.png");
        changeImageViewImg(imgAlea, "Interfaces/aleatoire.png");
        changeImageViewImg(imgBoss, "Interfaces/couronne.png");
        changeImageViewImg(imgPotionRappel, "Interfaces/potionRappel.png");
        changeImageViewImg(imgZoneNomClasse, "Interfaces/interfaceChoix.png");
        changeImageViewImg(imgFondBoutique, "Interfaces/fondBoutique.png");
    }
    public void changeEffect(ImageView imv, String bolus)
    {
        DropShadow ds = new DropShadow();
        ds.setWidth(10.0);
        ds.setRadius(10.0);
        ds.setHeight(10.0);
        ds.setSpread(0.4);
        if(bolus.equals("Air"))
            ds.setColor(Color.DARKGREEN);
        else if (bolus.equals("Terre"))
            ds.setColor(Color.DARKGOLDENROD);
        else if (bolus.equals("Feu"))
            ds.setColor(Color.DARKRED);
        else if (bolus.equals("Eau"))
            ds.setColor(Color.DARKBLUE);
        else if (bolus.equals("Up"))
            ds.setColor(Color.GREEN);
        else if (bolus.equals("Down"))
            ds.setColor(Color.DARKRED);
        else if (bolus.equals("White"))
            ds.setColor(Color.WHITE);
        imv.setEffect(ds);
    }

    public void deleteEffect(ImageView imv)
    {
        imv.setEffect(null);
    }
    // -------------------------------------------------------------------------------------------------------------- //
    // -------------------------------------------------------------------------------------------------------------- //
}