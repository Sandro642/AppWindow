package fr.sandro642.github;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        super("Ma Fenêtre");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Créer un bouton avec le texte "Cliquez ici"
        JButton bouton = new JButton("Cliquez ici");
        JLabel window = new JLabel("Ma fenêtre");

        // Ajouter le bouton à la fenêtre
        add(bouton);

        bouton.isDefaultButton();
        bouton.add(window);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Window());
    }
}
