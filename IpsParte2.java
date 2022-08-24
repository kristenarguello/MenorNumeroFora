import java.io.*;
import java.util.*;

public class Ipesdesgracados {
    public static String leTXT() {
        String arquivo = "";
        try {
            FileReader arq = new FileReader("ips.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String str = lerArq.readLine();
            while (str != null) {
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
                result.add(Long.parseLong(stringValue));
            } catch(NumberFormatException nfe) {
               System.out.println("Could not parse " + nfe);
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
        long limite = 4294967296L;//0 até 2^32 - 1
        int quantos=0;
        boolean continua = true;
        boolean achou = false;
        while (continua) {
            for (int i=0;i<duplo.size()-1;i+=2) {
                if (num>=duplo.get(i)) {
                    if (num<=duplo.get(i+1)) {
                        num = duplo.get(i+1) + 1;
                        achou = true;
                        if (num>=limite) {continua = false;}
                        else {continua = true;}
                        break;
                    }
                }
                else {
                    achou = false;
                }
            }
            if (!achou) {
                quantos++;
                if (num>=limite) {continua = false;}
                    else {continua = true;}
                num++;
            }
        }
        System.out.println(quantos);
    }
}
