
package kyruk;


  class Eleman{
      Eleman ileri;
      int icerik;
      
      Eleman(int icerik){
          ileri=null;
          this.icerik=icerik;
      }
  }
      class kuyruk{
          Eleman bas;
          Eleman son;
          
      
      boolean kuyrukBos(){
          if(bas==null){
              return true;
          } else {
              return false;
          }
      }
  public void kuyrugaEkle(int n){
          Eleman elm = new Eleman(n);
          if(!kuyrukBos()){
              son.ileri=elm;
              son=elm;
          }
          else{
              bas=elm;
              son=elm;
              
          }
      }
public int remove(){
    Eleman cikacak=bas;
    if(!kuyrukBos()){
      bas=bas.ileri;
        if(bas==null){
            son=null;
        }
    }
    return cikacak.icerik;
}
  }

class yigit{ // kuyruğu ters cevirmek için yığıt metodu yazdık
    Eleman ust=null;
    boolean yigitBos(){
        if(ust==null)
            return true;
        else 
            return false;
    }
    public void yigitEkle(int n){
        Eleman elm=new Eleman(n);
        elm.ileri=ust;
        ust=elm;
    }
    public int yigittanCikar(){
        Eleman cikacak=ust;
        if(!yigitBos())
            ust=ust.ileri;
           return cikacak.icerik;
    }
    
    public void tersCevir(kuyruk k){
        yigit y =new yigit();
        while(!k.kuyrukBos()){
            y.yigitEkle(k.remove());
        }
        while(!y.yigitBos()){
            k.kuyrugaEkle(y.yigittanCikar());
        }
        System.out.println("Ters kuyruk:");
        // k.KuyrukGoster();
                
    }
}
        

public class kyruk {

  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
