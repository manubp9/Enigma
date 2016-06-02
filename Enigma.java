
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {

    }

    /**
     * encriptar
     */
    public int encripta(Mecanismo mecanismo,int num)
    {
        int valorDev = -1;
        if( mecanismo instanceof MecanismoMultiplicacionPrimo )
        {
            if(num>10)
            {
                valorDev =num*mecanismo.getClave();
            }    
        }
        return valorDev;
    }

    /**
     * desencriptar
     */
    public int desencripta(Mecanismo mecanismo,int num)
    {
        int valorDev = -1;
        if( mecanismo instanceof MecanismoMultiplicacionPrimo )
        {
            if(num/mecanismo.getClave()>10)
            {
                valorDev =num/mecanismo.getClave();
            }    
        }
        return valorDev;

    }
}
