import Aparelho.IPhone;

public class Usuario {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        //reprodutor de musica
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        //navegador
        iPhone.adicionarNovaAba();
        iPhone.exibirPagina();
        iPhone.atualizarPagina();

        //aparelho telefonico
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorrerioVoz();
    }
}
