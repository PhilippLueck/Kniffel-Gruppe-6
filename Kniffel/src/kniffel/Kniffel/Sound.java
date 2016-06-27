//package kniffel.Kniffel;
//
//import java.applet.Applet;
//
//import java.applet.AudioClip;
//import java.awt.event.ActionEvent;
//import java.io.File;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.sound.sampled.LineUnavailableException;
//import javax.sound.sampled.UnsupportedAudioFileException;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//public class Sound {
//
//    JButton test = new JButton("Click Me!");
//    JPanel panel = new JPanel();
//
//    public void playSound(String soundName)
//     {
//       try 
//       {
//        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioInputStream);
//        clip.start();
//       }
//       catch(Exception ex)
//       {
//         System.out.println("Error with playing sound.");
//         ex.printStackTrace( );
//       }
//     }
//
//
//    public Sound() {
//        JFrame frame = new JFrame("Button-Click test");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.pack();
//        frame.add(panel);
//        frame.setSize(800, 600);
//        frame.setResizable(true);
//        frame.setVisible(true);
//
//        panel.add(test);
//
//        test.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {
//             playSound("C:/Users/IBM_ADMIN/git/New folder (5)/Kniffel-Gruppe-6/Kniffel/src/kniffel/Kniffel/Sound/Shake And Roll Dice-SoundBible.com-591494296.wav");
//            }
//        });
//    }
//    public static void main(String[] args) {
//        new Sound();
//    }
//}
