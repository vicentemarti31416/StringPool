package stringpool;

public class StringPool {
   
    public static void main(String[] args) {
        String str1 = "string1";
        String str1b = "string1";
        System.out.println(str1 == str1b);
        /* Retorna true porque str1 es colocado en el pool de Strings, 
        str1b busca en dicho pool y apunta al mismo objeto*/ 
             
        String str2 = new String("string2");
        String str2b = "string2";
        System.out.println(str2 == str2b);
        // Retorna false porque str2 no es colocado en el pool de Strings
        
        String str2c = new String("string2");
        System.out.println(str2b == str2c);
        // Devuelve false porque si se usa el constructor no busca en el pool 
    }
    
}
