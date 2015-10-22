// Lab05Fst.java
// This is the student, starting version of Lab 05F which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class Lab05Fst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        int x1, y1, x2, y2, x, y, r;

        // Draw Red Horizontal Lines
        Expo.setColor(g,Expo.red);
        x1 = 0;
        y1 = 5;
        x2 = 250;
        y2 = 5;
        for (int lol = 1; lol <= 32; lol++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y1 += 10;
            y2 += 10;
        }


        // Draw Blue Vertical Lines
        Expo.setColor(g,Expo.blue);
        int a1, b1, a2, b2; 
        a1 = 255;
        b1 = 0;
        a2 = 255;
        b2 = 325;
        
        for (int kek = 1; kek <= 25; kek++)
        {
         Expo.drawLine(g,a1,b1,a2,b2);
         a1 += 10;
         a2 += 10;
         
        }

        // Draw Gray Diagonal Dots
        Expo.setColor(g,Expo.gray);
        int c, d;
        c = 505;
        d = 270;
        
        for (int bruh = 1; bruh <= 24; bruh++)
        {
            Expo.drawPoint(g,c,d);
            c +=10;
            d -= 10;
        }

        // Draw Green Concentric Circles
        Expo.setColor(g,Expo.green);
        int e, h;
        int f;
        e = 875;
        f = 163;
        h = 10;
        for (int mate = 1; mate <= 12; mate++)
        {
            Expo.drawCircle(g,e,f,h);
            h += 10;
        }

        // Draw Purple Concentric Ovals
        Expo.setColor(g,Expo.purple);
        int i, j, k, l;
        i = 125;
        j = 475;
        k = 5;
        l = 7;
        
        for (int nerd = 1; nerd <= 20; nerd++)
        {
            Expo.drawOval(g,i,j,k,l);
            k += 6;
            l += 7;
        }

        // Draw Pink Concentric Arcs
        Expo.setColor(g,Expo.pink);
        int m, n, o, p, q;
        m = 255;
        n = 649;
        o = 10;
        p = 25;

        for (int oops = 1; oops <= 19; oops++)
        {
            Expo.drawArc(g,m,n,o,p,0,90);
            
            o += 12;
            p += 15;
        }
        // Draw Brown Concentric Rectangles
        




        // Draw Gold Sphere





    }
}




