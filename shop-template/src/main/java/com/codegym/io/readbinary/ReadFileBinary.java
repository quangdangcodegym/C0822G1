package com.codegym.io.readbinary;

import com.codegym.io.readcharacter.ReadFileCharacter;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class ReadFileBinary {
    public static void main(String[] args) throws IOException {

        InputStream fileReader = new FileInputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\products.json");




        byte[] mang10byte = new byte[10];

        mang10byte[20] = 7;



        byte[] results = new byte[10];
        List<Byte> list = new ArrayList<>();
        while (fileReader.read(mang10byte) != -1) {

            Byte[] byteObjects = new Byte[mang10byte.length];
            int i=0;
            for(byte b: mang10byte)
                byteObjects[i++] = b;

            list.addAll(Arrays.asList(byteObjects));
        }
        Byte [] listBytes = new Byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listBytes[i] = list.get(i);
        }
        byte[] listB = new byte[listBytes.length];
        for (int i = 0; i < listBytes.length; i++) {
            listB[i] = listBytes[i].byteValue();
        }
        String s = Base64.getEncoder().encodeToString(listB);
        System.out.println(s);

        String jsonFile = ReadFileCharacter.readFileToString();
        byte[] output1 = jsonFile.getBytes();
        String sJson = Base64.getEncoder().encodeToString(output1);
        System.out.println(sJson);

        String str = "[\n" +
                "  {\n" +
                "    \"name\": \"Humpty\",\n" +
                "    \"age\": \"18\",\n" +
                "    \"address\": \"28 Nguyễn Tri Phuong\",\n" +
                "    \"createdAt\": \"2022-12-10\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Humpty\",\n" +
                "    \"age\": \"18\",\n" +
                "    \"address\": \"28 Nguyễn Tri Phuong\",\n" +
                "    \"createdAt\": \"2022-12-10\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Humpty\",\n" +
                "    \"age\": \"18\",\n" +
                "    \"address\": \"28 Nguyễn Tri Phuong\",\n" +
                "    \"createdAt\": \"2022-12-10\"\n" +
                "  }\n" +
                "]";
        byte[] output2 = str.getBytes(Charset.forName("US-ASCII"));
    }
}
