
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Welle2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Welle2 extends PApplet
{       
    int gruen = 0xff33cc33;
    int weiss = 0xffffff;    
    int farbe;
    boolean qf = true;
    int a = 5;       // abstand quadrate
    int s = 50;      // seitenlänge
    int x = 0;       // position
    int x2 = 0;      // position 1.Quadrat
    int y = 0;  
    boolean l = true;//line

    public void settings()
    {
        size(600,600);
    }        

    
    public void setup()
    {
        background(255);
        //background(200);
        zeichneQuadrate();
    }

 
    public void zeichneQuadrate(){
        noStroke();
        for(int z=0; z<=13; z++) {
            for(int i=0; i<=13; i++) {
                farbe = gruen;
                fill(farbe);
                rect(x+i*(s*2), y+z*s, s, s);          // print Quadrat 2 (großes Quadrat)

                if (qf == true){                    //Farbauswahl Quadrat 1 (kleines Quadrat)
                    farbe = weiss;
                }
                else {
                    farbe = gruen;
                }
                //fill(255, 255, 255);
                fill(farbe);
                rect((x2+i*s)+a, (y+z*s)+a, s-a*2, s-a*2);      // print Quadrat 1 (kleines Quadrat) 
                //   (0+0*50)+5, (0+0*50)+5,
                qf = !qf;
            }

            if (l == true) {                    //einschieben jede 2. Zeile
                x = 50;
            }
            else {
                x = 0;
            }
            l = !l;         
            qf = !qf;   //Farbe für 1. Quadrat in eingerückten Zeilen "umdrehen"

        }  

    }

    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Welle2.class.getName() });
    }

}
