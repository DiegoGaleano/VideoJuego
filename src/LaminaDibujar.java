import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LaminaDibujar extends JPanel{

	private JButton clonar;
	LaminaAnimacion miAnimacion;
	
	public LaminaDibujar(){
		setLayout(new GridLayout(2,2));
		setBackground(Color.WHITE);
		
		miAnimacion=new LaminaAnimacion();
		add(miAnimacion);
		

		LaminaAnimacion animacionClonada=(LaminaAnimacion)miAnimacion.clonar();
		add(animacionClonada);
		animacionClonada.arrancarHilo();
		
		LaminaAnimacion animacionClonada2=(LaminaAnimacion)miAnimacion.clonar();
		add(animacionClonada2);
		animacionClonada2.arrancarHilo();
		
		LaminaAnimacion animacionClonada3=(LaminaAnimacion)miAnimacion.clonar();
		add(animacionClonada3);
		animacionClonada3.arrancarHilo();
	
		
	}
	 
		
}

