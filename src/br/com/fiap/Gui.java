package br.com.fiap;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * 
 * @author rm76856 Jhonatan S. Souza
 *
 */

public class Gui extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Gui(){
		super("Jogo Damas 1.0 ");
		this.setSize(new Dimension(32, 32));
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.initComponents();
	}
	
	private void initComponents(){
		
		JPanel painel;
//		GridLayout grid = new GridLayout(8,8);
		this.setLayout(new FlowLayout());
		
		for(int i = 0; i < 64; i++){
			if(i %4 == 0){
				System.out.println("Inverte");
			}
			painel = new JPanel();
			painel.setSize(new Dimension(256, 256));
			painel.setBorder(new BevelBorder(2));
			Color color = null;
			if(i %2 == 0){
				color = Color.black;
			}else{
				color = Color.white;
			}
			
			painel.setBackground(color);
			this.getContentPane().add(painel,0);
		}
		
	}
	
	
	
	
	
	
}
