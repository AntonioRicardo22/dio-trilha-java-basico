public class SmartTv {

    Boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void aumentarVolume(){
        volume += 1;
        System.out.println("Aumentando Volume: " + volume);
    }
    public void diminuirVolume(){
        volume -= 1;
        System.out.println("Dimuindo Volume: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarCanal(){
        canal += 1;
        System.out.println("Aumentando  Canal: " + canal);
    }
    public void dimminuirCanal(){
        canal -=1;
        System.out.println("Diminuindo Canal: " + canal);
    }
    public void mudarCanal(int novocanaL){
        canal = novocanaL;
        System.out.println("Alterando Canal: " + canal);
    }
}
