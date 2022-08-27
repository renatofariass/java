
package ultimate_emoji_fight;

public class UltimateEmojiFight {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];
        l[0] = new Lutador("Pretty Boy","EUA", 22, 1.75f, 120f, 10, 0, 1);
        
        l[1] = new Lutador("Do Bronx","Brasil", 22, 1.75f, 83f, 10, 0, 1);
        
        Luta UEF01 = new Luta();
        UEF01.marcarLuta(l[1], l[1]);
        UEF01.lutar();
        l[0].status();
        
    }
    
}
