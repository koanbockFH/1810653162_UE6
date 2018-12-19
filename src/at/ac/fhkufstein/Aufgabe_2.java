package at.ac.fhkufstein;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_2 {

    public static void main(String[] args)
    {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Array Size pls:"));
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            Random rnd = new Random();

            array[i] = rnd.nextInt(1000);
        }

        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
