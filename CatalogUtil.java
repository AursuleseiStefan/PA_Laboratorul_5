package com.company;

import java.awt.*;
import java.io.*;

public class CatalogUtil {
    private String path;

    public static void save(Catalog catalog)
    throws IOException
    {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
    public static <InvalidCatalogException extends Throwable> Catalog load(String path)
            throws InvalidCatalogException, IOException {
        FileReader f = null;
        try {
            f = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            int c;
            while ( (c = f.read()) != -1)
                System.out.print((char)c);
            f.close();
        }


        return null;
    }
    public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();
        //… browse or open, depending of the location type
    }

}
