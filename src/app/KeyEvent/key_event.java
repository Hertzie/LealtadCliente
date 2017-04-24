/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.KeyEvent;

import java.awt.event.KeyEvent;

/**
 *
 * @author guill
 */
public class key_event {
    
    public static KeyEvent solo_alfabetico(KeyEvent e){
        char x;
        x = e.getKeyChar();
        boolean band = (!(x >= 'A' && x <= 'Z')) && (!(x >= 'a' && x <= 'z')) && (!(x == KeyEvent.VK_BACK_SPACE));
        System.out.println(x + " " + band);
        if(band){
            e.consume();
        }
        return e;
    }
    
    public static KeyEvent solo_numerico(KeyEvent e){
        char x;
        x = e.getKeyChar();
        boolean band = (!(x >= '1' && x <= '9')) && (!(x == KeyEvent.VK_BACK_SPACE));
        if(band){
            e.consume();
        }
        return e;
    }
}
