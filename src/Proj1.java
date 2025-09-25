/*
@file: Proj1.java
@description: Contains the program’s main that checks arguments and launches the parser.
@author: Neil Sawhney
@date: September 18, 2025
 */


import java.io.FileNotFoundException;

public class Proj1 {
    public static void main(String[] args) throws FileNotFoundException{
        if(args.length != 1){
            System.err.println("Argument count is invalid: " + args.length);
            System.exit(0);
        }
        new Parser(args[0]);
    }
}