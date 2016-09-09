package xyz.codingdaddy.lesson1;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

/**
 * Enables triangle rendering.
 * 
 * @author serhiy
 */
public class Renderer implements GLEventListener {

	public void init(GLAutoDrawable drawable) {
		/* nothing to initiate yet */
	}

	public void dispose(GLAutoDrawable drawable) {
		/* nothing to dispose yet */
	}

	public void display(GLAutoDrawable glAutoDrawable) {
		GL2 gl2 = glAutoDrawable.getGL().getGL2();
		
		gl2.glBegin(GL2.GL_TRIANGLES);
		gl2.glVertex3f(-0.5f, -0.5f,  0.0f);
		gl2.glVertex3f( 0.5f, -0.5f,  0.0f);
		gl2.glVertex3f(-0.5f,  0.5f,  0.0f);
		gl2.glEnd();
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,
			int height) {
		/* no action to be taken on reshape */
	}

}
