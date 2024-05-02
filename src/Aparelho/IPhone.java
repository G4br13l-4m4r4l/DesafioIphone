package Aparelho;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.RepodutorMusicial;

public class IPhone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet{
    public void tocar(){
     System.out.println("Tocando musica");   
    }
    public void pausar(){
        System.out.println("Pausando musica");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando musica");
    }

    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Atendendo chamada...");
    }
    public void iniciarCorrerioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(){
        System.out.println("Exibindo página...");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova aba...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página...");
    }
}
