package at.ac.fhkufstein;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_4
{
    public static void main(String[] args)
    {
        List<String> meineFreunde = new ArrayList<String>(){
            @Override
            public String toString()
            {
                String text = "";

                for(String f: this)
                {
                    text += f + "\n";
                }
                return text;
            }
        };

        meineFreunde.add(JOptionPane.showInputDialog("Gimme Name"));
        meineFreunde.add(JOptionPane.showInputDialog("Gimme Name"));
        meineFreunde.add(JOptionPane.showInputDialog("Gimme Name"));
        meineFreunde.add(JOptionPane.showInputDialog("Gimme Name"));
        meineFreunde.add(JOptionPane.showInputDialog("Gimme Name"));

        System.out.println(meineFreunde);
    }
}

