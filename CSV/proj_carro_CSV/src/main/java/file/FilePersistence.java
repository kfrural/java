package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kfrural
 */
public class FilePersistence {
    public void saveToFile(String text, String filePath) {
        try{
            FileWriter arq = new FileWriter(filePath);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(text);
            arq.close();
        } catch(IOException ex){
            Logger.getLogger(FilePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String loadFromFile(String filePath){
        String conteudo = "";
        try{
            File file = new File(filePath);
            Scanner ler = new Scanner(file);
            
            ler.useDelimiter("\\Z");
            while(ler.hasNext())
                conteudo += ler.next();
        }catch(FileNotFoundException ex){
        Logger.getLogger(FilePersistence.class.getName()).log(Level.SEVERE, null, ex);
    } 
        return conteudo;
}
}
