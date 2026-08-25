// Nombre y Apellido: Díaz Vera Nicolás
// Programación IV
// UNLAR - Sede Chamical

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class App {
public static void main(String[] args) {
JFrame ventana = new JFrame("Programa en VS Code");
ventana.setSize(350, 150);
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ventana.setLocationRelativeTo(null);

JPanel panel = new JPanel(new
GridLayout(3,2));
JLabel etiqueta = new JLabel("Nombre:");
JTextField cajaTexto = new JTextField(15);
JLabel etiquetaEdad = new JLabel("Edad:");
JTextField cajaTextoEdad = new JTextField(15);
JButton boton = new JButton("Confirmar");

boton.addActionListener(e -> {
String texto = cajaTexto.getText();
String edad = cajaTextoEdad.getText();
JOptionPane.showMessageDialog(ventana, "¡Hola, " + texto
 + "!"+ " Tu edad es:" + edad + " años.");
});

panel.add(etiqueta);
panel.add(cajaTexto);
panel.add(etiquetaEdad);
panel.add(cajaTextoEdad);
panel.add(new JLabel(""));
panel.add(boton);

ventana.add(panel);
ventana.setVisible(true);
}
}