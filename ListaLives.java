import java.util.ArrayList;
import java.util.Iterator;


public class ListaLives {

    ArrayList<Live> live = new ArrayList<>();


    public void adicionarLive(String titulo, String data, String hora, String plataforma, String apresentador, String artista){

        this.live.add(new Live(titulo, data, hora, plataforma, apresentador, artista));
        System.out.println("Live de " + artista + " adicionada com sucesso.");
        System.out.println();
    }

    public void exibirLives(){

        System.out.println("-------");
        System.out.println("Lives listadas: ");
        int contador = 1;
        for(Live lives: live) {

            System.out.println(contador + ". " + lives.getArtista());
            contador++;

        }
        System.out.println("-------");
        System.out.println();
    }

    public void buscarLive(String artista){

        boolean achou = false;
        for(Live lives: live) {

            if (lives.getArtista() == artista) {
                System.out.println(lives.toString());
                achou = true;
            }
        }

        if (achou == false){
            System.out.println("Nao existe live cadastrada com esse artista.");
            System.out.println();
        }


    }

    public void removerLive(String artista){

        Iterator i = live.iterator();

        while (i.hasNext()){
            Live proxLive = (Live) i.next();

            if (proxLive.getArtista() == artista){
                i.remove();
                System.out.println("Live de " +artista+ " removida com sucesso.");
                break;
            }
        }
    }
}


