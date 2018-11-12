package com;

import java.awt.image.BufferedImage;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader=new BufferedReader(new FileReader("file.txt"));
//      //   BufferedWriter writer=new BufferedWriter( new FileWriter("file2.txt"));
//
////        int i=0;
////        while ((i =reader.read())!=-1){
////            System.out.print ((char)i);
////        }
////        char[] chars=new char[50];
////        while (reader.read(chars) !=-1)
////        {
////            for (int i = 0; i < chars.length; i++) {
////               if(Character.isAlphabetic(chars[i])|| Character.isWhitespace(chars[i])){ System.out.print (chars[i]);}
////
////            }
////          //  System.out.println(chars);
////        }
////        while (reader.read ()!=-1){
////            System.out.println (reader.readLine());
////        }
////
////        writer.write("string11 ");
////        writer.newLine();
////        writer.write("string22 ");
////        writer.newLine();
////        writer.write("string33 ");
////        writer.newLine();
////        writer.flush();
////        writer.close();
//
////      //  BufferedReader reader2=new BufferedReader(new FileReader("file.txt"));
////
////        BufferedWriter writer2=new BufferedWriter( new FileWriter("file3.txt"));
////
////        while (reader.read ()!=-1){
////            writer2.write(reader.readLine());
////            writer2.newLine();
////        }
////        writer2.close();
//        try( BufferedWriter writer=new BufferedWriter( new FileWriter("file2.txt"))){
//            writer.write("string11 ");
//            writer.newLine();
//            writer.write("string22 ");
//            writer.newLine();
//            writer.write("string33 ");
//            writer.newLine();
//        }
//            BufferedInputStream is=new BufferedInputStream(new FileInputStream("file.txt"));
////            int i =0;
////            while((i=is.read())!=-1){
////                System.out.println(i);
////            }
//            byte[]bytes=new byte[is.available()];
//            while (is.read(bytes)!=-1){
//                for (int i = 0; i < bytes.length; i++) {
//                   if(bytes[i]==0) {
//                       break;}
//                       System.out.println(bytes[i]);
//                }
//            }
//

//        try (OutputStream os = new FileOutputStream("file4.txt")) {
//          byte[]bytes=new byte[ ]{49,10,50};
//            os.write(bytes);
//
//        }
        try (BufferedOutputStream os = new BufferedOutputStream (new FileOutputStream("file4.txt"))) {
            byte[]bytes=new byte[ ]{49,10,50};
            os.write(bytes);

        }

    }
}
