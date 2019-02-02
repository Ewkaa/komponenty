/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosc;

/**
 *
 * @author kalem
 */
public class Objetosc 
{
     
        private double r,hfig;
        private double a,b,h,hpodst;
        private int wybor,wybor1;
    
     public void seta (Double a) 
    {
       this.a=a;
    }
    public double geta() 
    {
        return a;
    }

         public void setb (Double b) 
    {
       this.b=b;
    }
    public double getb() 
    {
        return b;
    }

         public void seth (Double h) 
    {
       this.h=h;
    }
    public double geth() 
    {
        return h;
    }
    
    public void sethpodst (Double hpodst) 
    {
       this.hpodst=hpodst;
    }
    public double gethpodst() 
    {
        return hpodst;
    }
           public void setr (Double r) 
    {
       this.r=r;
    }
    public double getr() 
    {
        return r;
    }
           public void sethfig (Double hfig) 
    {
       this.hfig=hfig;
    }
    public double gethfig() 
    {
        return hfig;
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
    
    
    public double wynik()
    {
    if(wybor==1) //1-sze,2-prosto,3-gra,4-ostro
    {
        return (a*a*a);
    }
    if(wybor==2) //1-sze,2-prosto,3-gra,4-ostro
    {
        return (a*b*h);
    }
    if(wybor==3) //1-sze,2-prosto,3-gra,4-ostro
    {
        return (0.5*(hpodst*a));
    }
    if(wybor==4) //1-sze,2-prosto,3-gra,4-ostro
    {
        return ((1/3)*(a*hpodst*h));
    }
    
            else
                return 0;
    }
     public double wynik1()
    {
    if(wybor1==1) //walec,stozek,kula
    {
        return (3.14*r*r*hfig);
    }
    if(wybor1==2) //walec,stozek,kula
    {
        return ((3.14*r*r*hfig)/3);
    }
    if(wybor1==3) //walec,stozek,kula
    {
        return ((3.14*r*r*r)/3);
    }
      else
                return 0;
    }
    public Objetosc()
        {
            
        }
}
  
