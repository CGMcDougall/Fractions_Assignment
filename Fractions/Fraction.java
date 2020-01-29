
public class Fraction
{
   private int Num = 1;
   private int Dem = 1;
    public Fraction() {
        Num = 1;
        Dem = 1;
        
    }
    
    public Fraction(int N, int D){
     Num = N;
     Dem = D;
     if(Dem == 0)Dem = 1;
    }
    
    public Fraction(String a){
     Num = Integer.parseInt(a.substring(0));
     Dem = Integer.parseInt(a.substring(a.length()-1)); 
     if(Dem == 0)Dem = 1;
    }
    
    public Fraction(Fraction f) {
        this.Num = f.Num;
        this.Dem = f.Dem;
        if(Dem == 0)Dem = 1;
    }
    public void Show(){
    System.out.println(Num);   
    System.out.println("/");   
    System.out.println(Dem);   
    }
    public int getNum() {   
     return Num;   
    }
    public int getDem(){
     return Dem;   
    }
    public String toString(){
        String Re = "";
       Re = String.valueOf(Num) +"/"+ String.valueOf(Dem);
       return Re;
    }
    public double toDouble() {
     double Re; 
     Re = Num / Dem;
     return Re;
    }
    public void reduce(){
        int x =1;
        for(int i = 0; i <= Num; i++){
         if(Dem  % i == 0)x = i;  
        }
        Num = Num/x;
        Dem = Dem/x;
    }
    public void setNum(int x){
        Num = x;
    }
    public void setDem(int x){
     Dem = x;   
    }
    
}
