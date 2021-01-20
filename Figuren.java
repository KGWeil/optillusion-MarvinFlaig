
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size( 500, 1000); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
       
        //Figur oben
        rect( 50, 50, 400, 400);
        ellipse( 250, 250, 300, 300);
        ellipse( 250, 250, 200, 200);
        ellipse( 250, 250, 100, 100);
        
        //Figur unten
        ellipse( 250, 750, 400, 400);
        rect( 125, 625, 250, 250);
        rect( 166.6f, 666.6f, 166.8f, 166.8f);
        rect( 208.2f, 708.2f, 83.6f, 83.6f);

        
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************        triangle(x1,y1,x2,y2,x3,y3) 
    public void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************

        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
        // zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
