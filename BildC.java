
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class BildC extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,1000); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
       rect(50, 50, 400, 400);
        for (int i=0; i<3; i++) {
           circle(250, 250, 350-i*100);
        }   
        circle(250, 750, 400);
        for (int i=0; i<3; i++) {
           rect(125+i*50, 625+i*50, 250-i*100, 250-i*100);
        }
    }

 
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
    }


    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {BildC.class.getName() });
    }

}
