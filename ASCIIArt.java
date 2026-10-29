public class ASCIIArt {
    String img;
    //char[][] shape;
    public ASCIIArt(String img) {
        this.img = img;
        convertShape(img);
    }
    public char[][] convertShape(String img) {
        String[] lines = img.split("\\r?\\n");
        char [][] shape = new char[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            shape[i] = stringToCharArray(lines[i]);
        }
        return shape;
    }//copy and paste the full multi-line string and this function turns it into a 2d char array
    public  void printShape(char[][] shape) {
        for (int row = 0; row < shape.length; row++) {
            for (int col = 0; col < shape[row].length; col++) {
                System.out.print(shape[row][col]);
            }
            System.out.println();//moves to next line when each row is done
            try {
                Thread.sleep(20);//wait 20 ms, used try catch because Thread throws error inside for loop
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static char[] stringToCharArray(String str) {//I was trying to do something creative here by insetad of using indices to turn my art from my google doc into lines of strings and then turn those strings into a char array becuase otherwise I would have to write [0][0] for 2000+ characters. When writing this function the app tried to get me to use .toCharArray() but I decided to write my own function because I needed a 3rd function for the requirement. 
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;//this function is basically .toCharArray()
    }

    static String globe = """
              ___......___
          ,-”’      *     ‘“-,
       ,*’  *   .       .     ‘*,   
     ,’ +      +     +    *   .  ‘,
    /’     *      .   .   +     * ‘\\   
   *,  .   .    *        .   +     ,* 
  ‘-         +  _____/\\_        .   -’ 

 |”   +   *    /\\    || \\  *         “| 
(; .          /  \\       \\     *  .   ;)

 |,   *   +  /____\\_______\\ +        ,|
 ,-  +  .    |    | _   _ |  .  +  * -,
  *’         | /\\ ||±| |±||         ‘*
   \\,*+~.+.*~|_|¶_|_______|+.~*.+~,/
    ‘,                           ,’
      ‘*                        *’
       ‘*,                    ,*’
         /‘-,______________,-’\\
        /                      \\
       /                        \\
      /                          \\
     /                            \\
    /                              \\
   /                                \\

   |                                |
   ;                                ;
    ;,                            ,;
     ‘-,                        ,-’
ryc     ‘;.,________________,.;’
""";

static String cube = """
            -----------------------------
           /\\         \\         \\        \\
          /  \\         \\         \\        \\
         /    \\         \\         \\        \\
        /      \\---------\\---------\\--------\\
       /\\     / \\         \\         \\        \\
      /  \\   /   \\         \\         \\        \\
     /    \\ /     \\         \\         \\        \\
    /      /       \\---------\\---------\\--------\\
   /\\     / \\     / \\         \\         \\        \\
  /  \\   /   \\   /   \\         \\         \\        \\
 /    \\ /     \\ /     \\         \\         \\        \\
/      /       /       -----------------------------
\\     / \\     / \\     /         /         /        /
 \\   /   \\   /   \\   /         /         /        /
  \\ /     \\ /     \\ /         /         /        /
   \\       /       /---------/---------/--------/
    \\     / \\     /         /         /        /
     \\   /   \\   /         /         /        /
      \\ /     \\ /         /         /        /
       \\       /---------/---------/--------/
        \\     /         /         /        /
         \\   /         /         /        /
          \\ /         /         /        /
ryc        -----------------------------
""";
// static char[][] globe = {//snowglobe
//     stringToCharArray("              ___......___"),
//     stringToCharArray("          ,-\"'      *     '\"-,"),
//     stringToCharArray("       ,*'  *   .       .     '*, "),
//     stringToCharArray("     ,' +      +     +    *   .  ',"),
//     stringToCharArray("    /'    *      .   .   +     *  '\\"),
//     stringToCharArray("   *,  .   .    *        .   +     ,*"),
//     stringToCharArray("  '-        +   _____/\\_        .   -'"),
//     stringToCharArray(" |\"   +   *    /\\    || \\  *          \"|"),
//     stringToCharArray("(; .         /  \\       \\      *  .   ;)"),
//     stringToCharArray(" |,   *   +  /____\\_______\\ +       ,|"),
//     stringToCharArray(" ,-  +  .    |    | _   _ |  .  +  * -,"),
//     stringToCharArray("  *'         | /\\ ||±| |±||          '*"),
//     stringToCharArray("   \\,*+~.+.*~|_|¶_|_______|+.~*.+~,/"),
//     stringToCharArray("    ',                            ,'"),
//     stringToCharArray("      '*                        *'"),
//     stringToCharArray("       '*,                    ,*'"),
//     stringToCharArray("        /'-,______________,-'\\ "),
//     stringToCharArray("       /                      \\"),
//     stringToCharArray("      /                        \\"),
//     stringToCharArray("     /                          \\"),
//     stringToCharArray("    /                            \\"),
//     stringToCharArray("   /                              \\"),
//     stringToCharArray("   |                              |"),
//     stringToCharArray("   ;                              ;"),
//     stringToCharArray("    ;,                          ,;"),
//     stringToCharArray("     '-,                      ,-'"),
//     stringToCharArray("ryc     ';.,______________,.;'")
// };

// static char[][] cube = {//rubick's cube
//     stringToCharArray("            -----------------------------"),
//     stringToCharArray("           /\\         \\         \\        \\"),
//     stringToCharArray("          /  \\         \\         \\        \\"),
//     stringToCharArray("         /    \\         \\         \\        \\"),
//     stringToCharArray("        /      \\---------\\---------\\--------\\"),
//     stringToCharArray("       /\\     / \\         \\         \\        \\"),
//     stringToCharArray("      /  \\   /   \\         \\         \\        \\"),
//     stringToCharArray("     /    \\ /     \\         \\         \\        \\"),
//     stringToCharArray("    /      /       \\---------\\---------\\--------\\"),
//     stringToCharArray("   /\\     / \\     / \\         \\         \\        \\"),
//     stringToCharArray("  /  \\   /   \\   /   \\         \\         \\        \\"),
//     stringToCharArray(" /    \\ /     \\ /     \\         \\         \\        \\"),
//     stringToCharArray("/      /       /       -----------------------------"),
//     stringToCharArray("\\     / \\     / \\     /         /         /        /"),
//     stringToCharArray(" \\   /   \\   /   \\   /         /         /        /"),
//     stringToCharArray("  \\ /     \\ /     \\ /         /         /        /"),
//     stringToCharArray("   \\       /       /---------/---------/--------/"),
//     stringToCharArray("    \\     / \\     /         /         /        /"),
//     stringToCharArray("     \\   /   \\   /         /         /        /"),
//     stringToCharArray("      \\ /     \\ /         /         /        /"),
//     stringToCharArray("       \\       /---------/---------/--------/"),
//     stringToCharArray("        \\     /         /         /        /"),
//     stringToCharArray("         \\   /         /         /        /"),
//     stringToCharArray("          \\ /         /         /        /"),
//     stringToCharArray("ryc         -----------------------------")
// };


    public static void main(String[] args) throws InterruptedException {
        ASCIIArt art = new ASCIIArt(globe);
        ASCIIArt art2 = new ASCIIArt(cube);
        while(true){
            //printglobe(globe);
            art.printShape(art.convertShape(globe));
            System.out.println("");
            //printcube(cube);
            art2.printShape(art2.convertShape(cube));
            System.out.println("");//printing both images
        }
    }
    
    // public static void printglobe(char[][] globe) {
    //     for (int row = 0; row < globe.length; row++) {
    //         for (int col = 0; col < globe[row].length; col++) {//goes through each row and collumn and prints
    //             System.out.print(globe[row][col]);
    //         }
    //         System.out.println();//moves to next line when each row is done
    //         try {
    //             Thread.sleep(20);//wait 20 ms, used try catch because Thread throws error inside for loop
    //         } catch (InterruptedException e) {
    //             Thread.currentThread().interrupt();
    //         }
    //     }
    // }
    // public static void printcube(char[][] cube) {//same function as printimg1 but it is porbably useful two have two functions for this if we end up adding more ASCII images in the future and start putting them in different spaces, doign other things, etc
    //     for (int row = 0; row < cube.length; row++) {
    //         for (int col = 0; col < cube[row].length; col++) {
    //             System.out.print(cube[row][col]);
    //         }
    //         System.out.println();
    //         try {
    //             Thread.sleep(20);
    //         } catch (InterruptedException e) {
    //             Thread.currentThread().interrupt();
    //         }
    //     }
    // }

}