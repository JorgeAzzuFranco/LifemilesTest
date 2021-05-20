import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        //Codigos codify = new Codigos();
        while(true){
          System.out.print("Mensaje: ");
          String textToCodify = keyboard.nextLine();  

          String morseText = morse(textToCodify);
          String octalText = octal(textToCodify);
          String bacediText = bacedifogu(textToCodify);
          
          System.out.println("morse: " + morseText);
          System.out.println("octal: " + octalText);
          System.out.println("bacedifogu: " + bacediText);
          
        }
        
  }

  public static String morse(String text) {
    String codeMorse = "";

    char[] lang = {'a','b','c','d','e','f','g','h','i','j','k','l',
                  'm','n','o','p','q','r','s','t','u','v','w','x',
                  'y','z','1','2','3','4','5','6','7','8','9','0'};

    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--", "--..", ".----","..---", "...--",
        "....-", ".....", "-....", "--...", "---..", "----.","-----"};
    
    text = text.toLowerCase();
    char[] chars = text.toCharArray();


    for (int i = 0; i < chars.length; i++){
      for (int j = 0; j < lang.length; j++){

        if (lang[j] == chars[i]){
        codeMorse = codeMorse + morse[j];
        }
      }
    }

    return codeMorse;
  }

  public static String octal(String text) {
  
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        sb.append(Integer.toString(c, 8));
        sb.append(" ");
    }
    return sb.toString();
  
  }

  public static String bacedifogu(String text) {
    String codeBac = "";

    char[] lang = {'a','b','c','d','e','f','g','h','i','j','k','l',
                  'm','n','o','p','q','r','s','t','u','v','w','x',
                  'y','z','1','2','3','4','5','6','7','8','9','0'};

    String[] bac = {"1","2","3","4","5","6","7","h","8","j","k","l",
                    "m","n","9","p","q","r","s","t","9","v","w","x",
                    "y","z","1","2","3","4","5","6","7","8","9","0"};
    
    text = text.toLowerCase();
    char[] chars = text.toCharArray();

    for (int i = 0; i < chars.length; i++){
      for (int j = 0; j < lang.length; j++){

        if (lang[j] == chars[i]){
        codeBac = codeBac + bac[j];
        }
      }
    }

    return codeBac;
  }

}