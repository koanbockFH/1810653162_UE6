package at.ac.fhkufstein;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        int[] array = new int[100];

        for(int i = 0; i < array.length; i++)
        {
            Random rnd = new Random();
            array[i] = rnd.nextInt(1000);
        }

        while(true)
        {
            int index = Integer.parseInt(JOptionPane.showInputDialog("Gimme Index"));

            JOptionPane.showMessageDialog(null, "Value is: " + array[index]);

            int newValue = Integer.parseInt(JOptionPane.showInputDialog("Gimme NewValue"));
            array[index] = newValue;
        }
    }
}
