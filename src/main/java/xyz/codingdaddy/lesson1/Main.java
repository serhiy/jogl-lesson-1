package xyz.codingdaddy.lesson1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;

/**
 * The main class with respective GUI components.
 * 
 * @author serhiy
 */
public class Main {
	public static void main(String[] args) {
		final GLProfile glProfile = GLProfile.getDefault();
		final GLCapabilities glCapabilities = new GLCapabilities(glProfile);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame jFrame = new JFrame ("Triangle Example");
				jFrame.setSize(640, 480);
				
				GLJPanel glJPanel = new GLJPanel(glCapabilities);
				glJPanel.addGLEventListener(new Renderer());
				glJPanel.setSize(jFrame.getSize());
				
				jFrame.getContentPane().add(glJPanel);
				
				jFrame.setVisible(true);
			}
		});
	}
}
