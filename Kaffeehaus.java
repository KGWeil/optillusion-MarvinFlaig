
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       

    int s = 40; 
    int[] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10}; 

    
    @Override
    public void settings()
    {
        size(640,400);
    }     
    
    @Override
    public void setup()
    {
        background(255);        
        parallelen();           
        zeichneAlleQuadrate();  
    }

    
    public void parallelen(){
        stroke(125);
        for (int i=0; i<=9; i++){
            line(0,5+i*s, 640, 5+i*s);
        }
    }

    
    public void zeichneAlleQuadrate(){
        fill(0);
        for (int j=0; j<=8; j++){
            for (int i=0; i<=7; i++){
                rect(abstaende[j]+2*s*i, 5+j*s, s, s);
            }
        }
    }
    
 
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
