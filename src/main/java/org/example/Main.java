package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {     // checked exception Java will warn that this may occur problem
                // READING BY SYSTEM
         /* BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
         String line=input.readLine();
        System.out.println(line);

        String []splitLine=line.split(","); // split the sentence where it finds ","
        for(String s:splitLine){
            System.out.println(s+" ");
        }*/


              // READING BY FILES
        BufferedReader restroReader= Files.newBufferedReader(Paths.get("D:\\7th Semester\\FullStackBootcamp\\test\\data\\data1.txt"));

        String line=restroReader.readLine();
        System.out.println(line);

        String []splitLine=line.split(","); // split the sentence where it finds ","
        for(String s:splitLine){
            System.out.println(s+" ");
        }
    }
}