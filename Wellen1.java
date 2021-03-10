
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    
    int s = 100;
    int a = 3;
    int d;
    int aktuellefarbe;

    public void settings()
    {
        size(1000,1000);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
 
        public void setup()
    {
        background(255);
        alleQuadrate();
        linien();
    }

    //  Hilfsmethode
    int farbwechsel (int farbe) {
        if (farbe == 255) { // Farbe ist weiß
            farbe = 0;
        } else {  // Farbe ist nicht weiß
            farbe = 255;
        }
        return farbe;
    }

    /**
     * Zeichnet ein Quadrat mit Kreisen in den Ecken
     * @param   x   x-Koordinate des Quadrats
     * @param   y   y-Koordinate des Quadrats
     * @param   farbe   Füllfarbe des Quadrats
     * @param   links   true: Kreise links | false: Kreise rechts
     */
    public void zeichneQuadrat(int x, int y, int farbe, boolean rechts) {
        fill(farbe); // der übergebene Wert der Variable farbe wird als Füllfarbe übergeben
        rect(x, y, s, s); // ein Quadrat mit Seitenlänge s wird an der Position (x|y) gezeichnet

        // Farbauswahl Kreise
        fill(farbwechsel(farbe));

        // Zeichnen der beiden kleinen Kreise
        ellipseMode(CORNERS);
        noStroke();
        int d=s/4;
        if (rechts == true) {
            ellipse(x+a, y+a, x+d+a, y+d+a);  // links oben
            ellipse(x+a, y + 3*d-a, x+d+a, y+s-a); // links unten
        } else {
            ellipse(x + 3*d-a, y+a, x+s-a, y+d+a);  // rechts oben
            ellipse(x + 3*d-a, y + 3*d-a, x+ s-a, y+s-a);  // rechts unten
        }
    }

    /**
     * Zeichnet alle Quadrate
     */
    public void alleQuadrate() {
        noStroke();
        int aktuelleFarbe = 255; // Farbe des ersten Quadrates ist weiß
        boolean pos_aktuell = true; // Kreise sind zunächst links
        for (int j=0; j<=9; j++) {
            for (int i=0; i<=9; i++) {
                zeichneQuadrat(d + i*s, d + j*s, aktuelleFarbe, pos_aktuell);
                aktuelleFarbe = farbwechsel( aktuelleFarbe );// Farbwechsel für nächstes Quadrat
            } // end Zeichnen einer Reihe
            aktuelleFarbe = farbwechsel( aktuelleFarbe );// Wechsel Startfarbe
            // Wechsel Position der Kreise
            if (pos_aktuell == true) {
                pos_aktuell = false;
            } else {
                pos_aktuell = true;
            }
        }
    }

    /**
     * zeichne die drei Linien zwischen die Quadrate
     */
    public void linien()
    {
        stroke(127, 255, 0);  // Linienfarbe hellgrün
        strokeWeight(a);
        for (int i=0; i<=9; i++) {
            line(d-a, d + s + s*i, d + a + 10*s, d + s + s*i);
        }
    }
    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
