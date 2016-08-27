/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zz.core;

/**
 *
 * @author reza
 * descriptions : this class for log functions
 *
 */

import java.io.*;
import java.util.logging.*;

public class logging {

    public logging(){
        try {
            FileHandler hand = new FileHandler("zlogme.log");
            Logger log = Logger.getLogger("log_file");
            log.addHandler(hand);
            log.warning("okes");
        } catch (Exception e) {
        }
    }

    public void warning(){
        
    }
    
    public void error(){
        
    }

    public void info(){
        
    }

    public static void main(String[] args){
        new logging();
    }

}
