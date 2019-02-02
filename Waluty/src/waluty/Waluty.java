/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waluty;

/**
 *
 * @author kalem
 */
public class Waluty {
        private double kwota;
        private int wybor, wybor1;
        private String result;
    
    public void setkwota (Double kwota) 
    {
       this.kwota=kwota;
    }
    public double getkwota() 
    {
        return kwota;
    }

    public void setwybor (int wybor)
    {
       this.wybor=wybor;
    }
    public double getwybor()
    {
        return  wybor;
    }
     public void setwybor1 (int wybor1)
    {
       this.wybor1=wybor1;
    }
    public double getwybor1()
    {
        return  wybor1;
    }
    
    public String wynik()
    {
    if(wybor==1 && wybor1==2) //1-pln, 2-euro, 3-frank, 4-dolar
    {
      result=  String.format("%.2f",(kwota/4.2935));
    }
     if(wybor==1 && wybor1==3) //1-pln, 2-euro, 3-frank, 4-dolar
    {
        result= String.format("%.2f",(kwota/3.8044));
    }
      if(wybor==1 && wybor1==4) //1-pln, 2-euro, 3-frank, 4-dolar
    {
      result=  String.format("%.2f",(kwota/3.7893));
    }
       if(wybor==2 && wybor1==1) //1-pln, 2-euro, 3-frank, 4-dolar
    {
     result= String.format("%.2f",(kwota*4.2935));
    }
        if(wybor==3 && wybor1==1) //1-pln, 2-euro, 3-frank, 4-dolar
    {
       result=  String.format("%.2f",(kwota*3.8044));
    }
         if(wybor==4 && wybor1==1) //1-pln, 2-euro, 3-frank, 4-dolar
    {
       result=  String.format("%.2f",(kwota*3.7893));
    }
          if(wybor==2 && wybor1==3) //1-pln, 2-euro, 3-frank, 4-dolar
    {
       result=  String.format("%.2f",(kwota/1.13));
    }
           if(wybor==2 && wybor1==4) //1-pln, 2-euro, 3-frank, 4-dolar
    {
        result= String.format("%.2f",(kwota/1.13));
    }
            if(wybor==3 && wybor1==2) //1-pln, 2-euro, 3-frank, 4-dolar
    {
       result= String.format("%.2f",(kwota*0.8861));
    }
           return result;
    }
    public Waluty()
        {
            
        }
}
