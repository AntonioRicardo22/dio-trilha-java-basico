public class Usuario {
    public static void main(String[] args) throws Exception {
        

        // programa logíco de tv - onde é permitido ligar/desligar , aumentar/dimunir de canais e volume \\
        SmartTv smartTv = new SmartTv();
        System.out.println("TV LIGADA ? " + smartTv.ligada);
        System.out.println("CANAL ATUAL : " + smartTv.canal);
        System.out.println("VOLUME ATUAL : " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("aumentando volume:" + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Dimunindo volume: " + smartTv.volume);
        
        smartTv.aumentarCanal(); 
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();      
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(13);
        
    }
}
