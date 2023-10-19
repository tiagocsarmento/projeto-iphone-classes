package iphone;

import telefone.Telefone;
import reprodutor_musical.ReprodutorMusical;
import navegador_web.NavegadorWeb;

public class IPhone implements Telefone, ReprodutorMusical, NavegadorWeb {
	public void ligar() {
		System.out.println("Ligando do meu iPhone");
	}
	public void atender() {
		System.out.println("Chamada atendida do meu iPhone");
	}
	public void iniciarCorrerioVoz() {
		System.out.println("Escutando correio de voz no meu iPhone");
	}
	public void tocar() {
		System.out.println("Tocando música no meu iPhone");
	}
	public void pausar() {
		System.out.println("Pausando a música no meu iPhone");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando música para tocar no meu iPhone");
	}
	public void exibirPagina() {
		System.out.println("Exibindo página na web no meu iPhone");
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador do meu iPhone");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando página na web no meu iPhone");
	}
}

