import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


	 public class TablaJuego implements ActionListener{
	
	//intanciamos objetos
	JButton boton1; 
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton botonVacio;
	JButton botonTiempo;
	
	JPanel panel;

	
	private TablaJuego  (){
	 
	        JFrame ventana = new JFrame("Juego Ordenar Botones!");
	    	
	        //cambiamos el color a la ventana
	        ventana.setBackground(java.awt.Color.red);
	       
	        // Inicializa todos los elementos del menu
			JMenuBar menu = new JMenuBar();

			//cambiamos el color del jmenu
			menu.setBackground(java.awt.Color.red);
			
			JMenu archivo = new JMenu("Archivo");
			
			JMenu ayuda = new JMenu("Infromación");

			
			JMenuItem guardar = new JMenuItem("Guardar");
			JMenuItem salir = new JMenuItem("Salir");
			JMenuItem acercaDe = new JMenuItem("Como jugar");

			// Añade los elementos al menu
			archivo.add(guardar);
			archivo.add(salir);		
			ayuda.add(acercaDe);

			menu.add(archivo);
			menu.add(ayuda);

			// Añade la barra de menu a la ventana
			ventana.setJMenuBar(menu);
	        
	        
	        ventana.setLayout(new BorderLayout(60, 20));
	        
	        ventanabotones();
	 
	        ventana.add(panel, BorderLayout.CENTER);
	        
	        salir.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
	        
	        acercaDe.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null, " Ordena los números es un juego para divertirte! consiste en la ordenación del los botones  , pulsa el botón vació y luego los botones que están a su alrededor para ordenarlos.");
				}
			});
	        
	        guardar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null, " El estado del juego a sido guardado!");
				}
			});
	        
	        ventana.setSize(800, 500);
	        ventana.setLocation(300, 200);
	        ventana.setVisible(true);
	        ventana.setResizable(true);
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
	    }
	 
	
	    public void ventanabotones(){
	        
	    	
	    	
	    	botonTiempo = new JButton("Tiempo!");
	        
	     
	    	// creamos un panel y le pasamos un gridlayout  , de 3 filas por dos columnas y  un espacio entre botones de 2
	        panel = new JPanel(new GridLayout(3, 3, 2, 2));
	        
	        // creamos un objeto Font  , le pasamos la letra que queremos , el estilo de la letra y la grandaría
	        Font tipoFuente=new Font("Times New Roman", Font.PLAIN, 30);
	        
	        //creacion de los botones
	       boton1 = new JButton("1"); 
	        boton2 = new JButton("2"); 
	        boton3 = new JButton("3");
	        boton4 = new JButton("4"); 
	        boton5 = new JButton("5"); 
	        boton6 = new JButton("6");
	        boton7 = new JButton("7"); 
	        boton8 = new JButton("8"); 
	        botonVacio = new JButton(" ");
	       
	       
	       
	        //cambiamos el color de los botones , algunos amarillos y otros naranjas
	        boton1.setBackground(java.awt.Color.yellow);
	        boton2.setBackground(java.awt.Color.orange);
	        boton3.setBackground(java.awt.Color.yellow);
	        boton4.setBackground(java.awt.Color.orange);
	        boton5.setBackground(java.awt.Color.yellow);
	        boton6.setBackground(java.awt.Color.orange);
	        boton7.setBackground(java.awt.Color.yellow);
	        boton8.setBackground(java.awt.Color.orange);
	        botonVacio.setBackground(java.awt.Color.yellow);
	        
	        //pasamos a los botones el tipo de funte creada en anterioridad
	        boton1.setBounds(56, 101, 218, 23);
	        boton1.setFont(tipoFuente);
	       
	        boton2.setBounds(56, 101, 218, 23);
	        boton2.setFont(tipoFuente);
	        
	        boton3.setBounds(56, 101, 218, 23);
	        boton3.setFont(tipoFuente);
	        
	        boton4.setBounds(56, 101, 218, 23);
	        boton4.setFont(tipoFuente);
	        
	        boton5.setBounds(56, 101, 218, 23);
	        boton5.setFont(tipoFuente);
	        
	        boton6.setBounds(56, 101, 218, 23);
	        boton6.setFont(tipoFuente);
	        
	        boton7.setBounds(56, 101, 218, 23);
	        boton7.setFont(tipoFuente);
	        
	        boton8.setBounds(56, 101, 218, 23);
	        boton8.setFont(tipoFuente);
	        
	        botonVacio.setBounds(56, 101, 218, 23);
	        botonVacio.setFont(tipoFuente);
	        
	        
	        //añadimos los botones al panel
	        panel.add(botonVacio);
	        panel.add(boton8); 
	        panel.add(boton7); 
	        panel.add(boton6); 
	        panel.add(boton5); 
	        panel.add(boton4); 
	        panel.add(boton3); 
	        panel.add(boton2); 
	        panel.add(boton1); 
	 
	        //escucha de los botones
	        boton1.addActionListener(this); 
	        boton2.addActionListener(this); 
	        boton3.addActionListener(this);
	        boton4.addActionListener(this); 
	        boton5.addActionListener(this); 
	        boton6.addActionListener(this);
	        boton7.addActionListener(this); 
	        boton8.addActionListener(this); 
	        botonVacio.addActionListener(this);
	        botonTiempo.addActionListener(this);
	       
	    }
	    
	  
	    /* Metodo para el comportamiento de los botones , cuando pulsemos el botón vacio posicionará el botón en la
	    sexta posición y ahí empezará el juego.*/
		
	    
	    @Override
	    public void actionPerformed(ActionEvent e) {
	 
			
	    	if(e.getSource()==botonVacio){  
	    	
			
		String posicion=boton4.getText();  
		//empieza al juego
	    	boton4.setText(botonVacio.getText());  
	    	botonVacio.setText(posicion);  
	    	posicion=boton1.getText();  
	    	boton1.setText(boton5.getText());  
	    	boton5.setText(posicion);  
	    	posicion=boton2.getText();  
	    	boton2.setText(boton7.getText());  
	    	boton7.setText(posicion);  
	    	}  
	    	
	    	
	    	/*según el botón que ponemos  , guardaremos el valor en una variable y la compararemos en los demás botones si uno de los botones 
	    	está vacio entonces se intercambiarán los valores quedando los botones cambiados*/
	    
	    	if(e.getSource()==boton1){  
	    	String posicion=boton1.getText();  
	    	if(boton2.getText().equals(" ")){ boton2.setText(posicion); boton1.setText(" ");}  
	    	else if(boton4.getText().equals(" ")){ 
	    		boton4.setText(posicion); 
	    		boton1.setText(" ");}  
	    	 }//end of if  
	    	    
	    
	    	
	    if(e.getSource()==boton2){  
	    	String posicion=boton2.getText();  
	    	if(boton1.getText().equals(" ")){ boton1.setText(posicion); boton2.setText(" ");}  
	    	else if(boton3.getText().equals(" ")){ boton3.setText(posicion); boton2.setText(" ");}  
	    	else if(boton5.getText().equals(" ")){ boton5.setText(posicion); boton2.setText(" ");}  
	    	 }//end of i  
	    	
	   
	    if(e.getSource()==boton3){  
	    	String posicion=boton3.getText();  
	    	if(boton2.getText().equals(" ")){ boton2.setText(posicion); boton3.setText(" ");}  
	    	else if(boton6.getText().equals(" ")){ boton6.setText(posicion); boton3.setText(" ");}  
	    	 }//end of if  
	    	  
	
	    if(e.getSource()==boton4){  
	    	String posicion=boton4.getText();  
	    	if(boton1.getText().equals(" ")){ boton1.setText(posicion); boton4.setText(" ");}  
	    	else if(boton7.getText().equals(" ")){ boton7.setText(posicion); boton4.setText(" ");}  
	    	else if(boton5.getText().equals(" ")){ boton5.setText(posicion); boton4.setText(" ");}  
	    	 }//end of if  
	    	  
	    	
	    if(e.getSource()==boton5){  
	    	String posicion=boton5.getText();  
	    	if(boton2.getText().equals(" ")){ boton2.setText(posicion); boton5.setText(" ");}  
	    	else if(boton4.getText().equals(" ")){ boton4.setText(posicion); boton5.setText(" ");}  
	    	else if(boton6.getText().equals(" ")){ boton6.setText(posicion); boton5.setText(" ");}  
	    	else if(boton8.getText().equals(" ")){ boton8.setText(posicion); boton5.setText(" ");}  
	    	 }//end of if  
	    	  
	    	
	    if(e.getSource()==boton6){  
	    	String posicion=boton6.getText();  
	    	if(botonVacio.getText().equals(" ")){ botonVacio.setText(posicion); boton6.setText(" ");}  
	    	else if(boton3.getText().equals(" ")){ boton3.setText(posicion); boton6.setText(" ");}  
	    	else if(boton5.getText().equals(" ")){ boton5.setText(posicion); boton6.setText(" ");}  
	    	  
	    	 }
	    	  
	    if(e.getSource()==boton7){  
	    	String posicion=boton7.getText();  
	    	if(boton4.getText().equals(" ")){ boton4.setText(posicion); boton7.setText(" ");}  
	    	else if(boton8.getText().equals(" ")){ boton8.setText(posicion); boton7.setText(" ");}  
	    	  
	    	 }
	    	  
	    if(e.getSource()==boton8){  
	    	String posicion=boton8.getText();  
	    	if(boton7.getText().equals(" ")){ boton7.setText(posicion); boton8.setText(" ");}  
	    	else if(botonVacio.getText().equals(" ")){ botonVacio.setText(posicion); boton8.setText(" ");}  
	    	else if(boton5.getText().equals(" ")){ boton5.setText(posicion); boton8.setText(" ");}  
	    	  
	    	 }
	    	  
	    if(e.getSource()==botonVacio){  
	    	String posicion=botonVacio.getText();  
	    	if(boton6.getText().equals(" ")){ boton6.setText(posicion); botonVacio.setText(" ");}  
	    	else if(boton8.getText().equals(" ")){ boton8.setText(posicion); botonVacio.setText(" ");}  
	    	  
	    	
	    	//En caso de que todos esten en su sitio , abremos ganado!
	    	
	    	if(boton1.equals("1")&&boton2.equals("2")&&boton3
	    	.equals("3")&&boton4.equals("4")&&boton5.equals("5")  
	    	&&boton6.equals("6")&&boton7.equals("7")&&boton8
	    	.equals("8")&&botonVacio.equals(" ")){   
	    		
	    		//Mostramos el joption panel al ganador
	    		JOptionPane.showMessageDialog(null, "Has ganado! enorabuena!");
	    		
	    	}  
	     } 
	    
	    	  
	 }
	    
	 
	    public static void main(String[] args) {        
	    	TablaJuego  a = new TablaJuego  ();//se invoca el constructor        
	    }
	 
	  
	}