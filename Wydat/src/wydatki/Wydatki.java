/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wydatki;

/**
 *
 * @author kalem
 */
public class Wydatki 
{
    private double kwota,plus,minus,oszcz;
    private int wydatek;
    private double result=0;
   
     public void setkwota (Double kwota) 
    {
       this.kwota=kwota;
    }
    public double getkwota() 
    {
        return kwota;
    }

    public void setwydatek (int wydatek)
    {
       this.wydatek=wydatek;
    }
    public double getwydatek()
    {
        return  wydatek;
    }
        
    public double wynikWydatek()
    {
    if(wydatek==1 || wydatek==2 || wydatek==3) //1-opłaty, 2-zakupy, 3-kredyty,4-pensja,5-dodatki, 5-oszczednosci
    {
       minus=minus+kwota;  
       result=result-minus;
    }
     else 
    {   
        minus=minus+0;
         result=result+0;
    }
    return minus;  
    }
    public double wynikPrzych()
    {
    if(wydatek==4|| wydatek==5) 
    {
       plus=plus+kwota;  
        result=result+plus;
    }
     else 
    {   
       plus=plus+0;
        result=result+0;
    }
    return plus;  
    }
    public double wynikOszcz()
    {
    if(wydatek==6) 
    {
       oszcz=oszcz+kwota; 
        result=result+0;
    }
     else 
    {   
        oszcz=oszcz+0;
         result=result+0;
    }
    return oszcz;  
    }
    public double wynik()
    {
        
        return result;
    }
    
    public Wydatki()
    {
    }
}
