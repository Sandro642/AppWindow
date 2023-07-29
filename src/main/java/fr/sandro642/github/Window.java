package fr.sandro642.github;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        // Appeler le constructeur de la classe JFrame
        super("Ma Fenêtre");
        
        // Configurer la taille et la fermeture par défaut
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        // Centrer la fenêtre sur l'écran
        setLocationRelativeTo(null);
        
        // Appeler la méthode pour ajouter des composants à la fenêtre
        ajouterComposants();
    }

    // Méthode pour ajouter des composants à la fenêtre
    private void ajouterComposants() {
        // Obtenir le contenu de la fenêtre
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());

        // Exemples de composants possibles
        contenu.add(new JButton("Bouton"));
        contenu.add(new JLabel("Étiquette"));
        contenu.add(new JTextField("Champ de texte"));
        contenu.add(new JPasswordField("Mot de passe"));
        contenu.add(new JTextArea("Zone de texte", 5, 30));
        contenu.add(new JCheckBox("Case à cocher"));
        contenu.add(new JRadioButton("Bouton radio 1"));
        contenu.add(new JRadioButton("Bouton radio 2"));
        ButtonGroup groupeRadio = new ButtonGroup();
        groupeRadio.add((AbstractButton) contenu.getComponent(6));
        groupeRadio.add((AbstractButton) contenu.getComponent(7));
        contenu.add(new JToggleButton("Basculer"));
        contenu.add(new JSlider(JSlider.HORIZONTAL, 0, 100, 50));
        contenu.add(new JProgressBar(0, 100));
        contenu.add(new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"}));
        contenu.add(new JList<>(new String[]{"Élément 1", "Élément 2", "Élément 3"}));

        // Exemple de panneau avec GridLayout contenant des boutons
        JPanel panneauBoutons = new JPanel(new GridLayout(2, 2));
        panneauBoutons.add(new JButton("Bouton 1"));
        panneauBoutons.add(new JButton("Bouton 2"));
        panneauBoutons.add(new JButton("Bouton 3"));
        panneauBoutons.add(new JButton("Bouton 4"));
        contenu.add(panneauBoutons);
        
        // ... Ajouter d'autres composants ...
    }

    // Méthode pour démarrer l'application
    public void demarrer() {
        // Rendre la fenêtre visible
        setVisible(true);
    }

    // Méthode principale pour tester la classe
    public static void main(String[] args) {
        // Créer une instance de la classe MaFenetre
        Window window = new Window();
        
        // Démarrer l'application
        window.demarrer();
    }
}

}
