import java.io.*;
import java.util.*;

public class Ips {
    public static String leTXT() {
        String arquivo = "";
        try {
            FileReader arq = new FileReader("ips.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String str = lerArq.readLine();
            while (str != null) {
                //System.out.printf("%s\n", str);
                arquivo += str + "-";
                str = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo!");
        }
        return arquivo;
    }
    public static ArrayList<Long> getLongArray(ArrayList<String> stringArray) {
        ArrayList<Long> result = new ArrayList<Long>();
        for(String stringValue : stringArray) {
            try {
                // Convert String to Long, and store it into Long array list.
                result.add(Long.parseLong(stringValue));
            } catch(NumberFormatException nfe) {
               System.out.println("Could not parse " + nfe);
                //Log.w("NumberFormat", "Parsing failed! " + stringValue + " can not be an Long");
                //System.out.println("deu ruim");
            } 
        }       
        return result;
    }
    public static void main (String [] args) {
        String teste = leTXT();
        List<String> list = Arrays.asList(teste.split("-"));
        
        ArrayList<String> list2 = new ArrayList<String>(list);
        ArrayList<Long> duplo = getLongArray(list2);
       
        int menor = duplo.indexOf(Collections.min(duplo));
        int pos_prox = menor + 1;
        long num = duplo.get(pos_prox) + 1;
        boolean continua = true;
        while (continua) {
            for (int i=0;i<duplo.size()-1;i+=2) {
                if (num>=duplo.get(i)) {
                    if (num<=duplo.get(i+1)) {
                        continua = true;
                        num = duplo.get(i+1) + 1;
                        break;
                    }
                }
                else {
                    continua = false; 
                }
            }
        }
        System.out.println(num);
    }

}
