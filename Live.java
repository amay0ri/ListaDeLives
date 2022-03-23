public class Live {

    private String titulo;
    private String data;
    private String hora;
    private String plataforma;
    private String apresentador;
    private String artista;


    public Live(String titulo, String data, String hora, String plataforma, String apresentador, String artista){
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.plataforma = plataforma;
        this.apresentador = apresentador;
        this.artista = artista;
    }

    public String getArtista(){

        return this.artista;
    }

    @Override
    public String toString() {
        return "Informacoes da live de " + this.getArtista() +": "+System.lineSeparator() +
                "Titulo: " + titulo + System.lineSeparator()  +
                "Data: " + data + System.lineSeparator() +
                "Hora: " + hora + System.lineSeparator()  +
                "Plataforma: " + plataforma + System.lineSeparator() +
                "Apresentador: " + apresentador + System.lineSeparator()  +
                "Artista: " + artista + System.lineSeparator()
                ;
    }


}