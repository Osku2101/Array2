public class App {
    public static void main(String[] args) throws Exception {
        
        String[] huonekalut;

         int[] lampotilat;

         huonekalut = new String[4];

    huonekalut[0] = "tuoli";
    huonekalut[1] = "sohva";
    huonekalut[2] = "pöytä";
    huonekalut[3] = "kaappi";

     for (int i=0 ; i<huonekalut.length ; i++)
    {
        
        if (huonekalut[i].equals("sohva"))
        {
        System.out.println(huonekalut[i]);
    }
    }


    }
}