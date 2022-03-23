public class Teste {

    public static void main(String[] args) {


        ListaLives lista = new ListaLives();

        lista.adicionarLive("Teste1", "20/01/2020", "16:00", "Youtube",
                "Ratinho", "Belo");
        lista.adicionarLive("Teste1", "20/01/2020", "16:00", "Youtube",
                "Silvio Santos", "Anitta");

        lista.exibirLives();
        lista.buscarLive("Ludmilla");
        lista.buscarLive("Anitta");

    }



}