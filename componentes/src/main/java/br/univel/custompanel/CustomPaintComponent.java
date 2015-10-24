package br.univel.custompanel;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CustomPaintComponent {

	public static void main(String[] args) {

		// garante que o código do metodo run será executado na EDI ou seja na
		// thread de eventos
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				JFrame janela = new JFrame();
				// TAMANHO
				janela.setSize(640, 480);
				// CENTRALIZAR NA TELA
				janela.setLocationRelativeTo(null);
				// MAXIMIZAR
				janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
				 //faz o programa terminar quando fecha a janela
				janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// Usa um fundo para janela pode ser qualquer componente, inclusive um painel com outros componentes
				janela.setContentPane(new Fundo());
				// MOSTRA A JANELA. IMPORTANTE: Todas as configurações devem ser
				// feitas antes de mostrar a janela
				janela.setVisible(true);
			}
		});

	}

}
