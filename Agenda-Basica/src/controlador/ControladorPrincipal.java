/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import vista.Principal;

public class ControladorPrincipal implements ActionListener, MouseListener {
	Principal principal=new Principal();
	public enum accionesPrincipal{
		ANADIR_CONTACTO
	}
	
	public ControladorPrincipal(Principal principal) {
		this.principal=principal;
	}
	
	public void Iniciar() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(principal);
			principal.setVisible(true);
			principal.setLocationRelativeTo(null);
		} catch (UnsupportedLookAndFeelException ex) {
		} catch (ClassNotFoundException ex) {
		} catch (InstantiationException ex) {
		} catch (IllegalAccessException ex) {
		}
		
		principal.PrincipalBotonAnadirContacto.addActionListener(this);
		principal.PrincipalBotonAnadirContacto.setActionCommand("ANADIR_CONTACTO");
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(accionesPrincipal.valueOf(e.getActionCommand())) {
		case ANADIR_CONTACTO:
			break;
		}
	}
	
	public void presionarjTable1() {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		presionarjTable1();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}
