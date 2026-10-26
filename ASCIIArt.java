public class ASCIIArt {
    public static char[] stringToCharArray(String str) {//I was trying to do something creative here by insetad of using indices to turn my art from my google doc into lines of strings and then turn those strings into a char array becuase otherwise I would have to write [0][0] for 2000+ characters. When writing this function the app tried to get me to use .toCharArray() but I decided to write my own function because I needed a 3rd function for the requirement. 
    char[] charArray = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
        charArray[i] = str.charAt(i);
    }

    return charArray;//this function is basically .toCharArray()
}

static char[][] img1 = {//snowglobe
    stringToCharArray("              ___......___"),
    stringToCharArray("          ,-\"'      *     '\"-,"),
    stringToCharArray("       ,*'  *   .       .     '*, "),
    stringToCharArray("     ,' +      +     +    *   .  ',"),
    stringToCharArray("    /'    *      .   .   +     *  '\\"),
    stringToCharArray("   *,  .   .    *        .   +     ,*"),
    stringToCharArray("  '-        +   _____/\\_        .   -'"),
    stringToCharArray(" |\"   +   *    /\\    || \\  *          \"|"),
    stringToCharArray("(; .         /  \\       \\      *  .   ;)"),
    stringToCharArray(" |,   *   +  /____\\_______\\ +       ,|"),
    stringToCharArray(" ,-  +  .    |    | _   _ |  .  +  * -,"),
    stringToCharArray("  *'         | /\\ ||±| |±||          '*"),
    stringToCharArray("   \\,*+~.+.*~|_|¶_|_______|+.~*.+~,/"),
    stringToCharArray("    ',                            ,'"),
    stringToCharArray("      '*                        *'"),
    stringToCharArray("       '*,                    ,*'"),
    stringToCharArray("        /'-,______________,-'\\ "),
    stringToCharArray("       /                      \\"),
    stringToCharArray("      /                        \\"),
    stringToCharArray("     /                          \\"),
    stringToCharArray("    /                            \\"),
    stringToCharArray("   /                              \\"),
    stringToCharArray("   |                              |"),
    stringToCharArray("   ;                              ;"),
    stringToCharArray("    ;,                          ,;"),
    stringToCharArray("     '-,                      ,-'"),
    stringToCharArray("ryc     ';.,______________,.;'")
};

static char[][] img2 = {//rubick's cube
    stringToCharArray("            -----------------------------"),
    stringToCharArray("           /\\         \\         \\        \\"),
    stringToCharArray("          /  \\         \\         \\        \\"),
    stringToCharArray("         /    \\         \\         \\        \\"),
    stringToCharArray("        /      \\---------\\---------\\--------\\"),
    stringToCharArray("       /\\     / \\         \\         \\        \\"),
    stringToCharArray("      /  \\   /   \\         \\         \\        \\"),
    stringToCharArray("     /    \\ /     \\         \\         \\        \\"),
    stringToCharArray("    /      /       \\---------\\---------\\--------\\"),
    stringToCharArray("   /\\     / \\     / \\         \\         \\        \\"),
    stringToCharArray("  /  \\   /   \\   /   \\         \\         \\        \\"),
    stringToCharArray(" /    \\ /     \\ /     \\         \\         \\        \\"),
    stringToCharArray("/      /       /       -----------------------------"),
    stringToCharArray("\\     / \\     / \\     /         /         /        /"),
    stringToCharArray(" \\   /   \\   /   \\   /         /         /        /"),
    stringToCharArray("  \\ /     \\ /     \\ /         /         /        /"),
    stringToCharArray("   \\       /       /---------/---------/--------/"),
    stringToCharArray("    \\     / \\     /         /         /        /"),
    stringToCharArray("     \\   /   \\   /         /         /        /"),
    stringToCharArray("      \\ /     \\ /         /         /        /"),
    stringToCharArray("       \\       /---------/---------/--------/"),
    stringToCharArray("        \\     /         /         /        /"),
    stringToCharArray("         \\   /         /         /        /"),
    stringToCharArray("          \\ /         /         /        /"),
    stringToCharArray("ryc         -----------------------------")
};

    public static void main(String[] args) throws InterruptedException {
        while(true){
            printimg1(img1);
            System.out.println();
            printimg2(img2);
            System.out.println();//printing both images
        }
    }
    public static void printimg1(char[][] img) {
        for (int row = 0; row < img1.length; row++) {
            for (int col = 0; col < img1[row].length; col++) {//goes through each row and collumn and prints
                System.out.print(img1[row][col]);
            }
            System.out.println();//moves to next line when each row is done
            try {
                Thread.sleep(20);//wait 20 ms, used try catch because Thread throws error inside for loop
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void printimg2(char[][] img) {//same function as printimg1 but it is porbably useful two have two functions for this if we end up adding more ASCII images in the future and start putting them in different spaces, doign other things, etc
        for (int row = 0; row < img2.length; row++) {
            for (int col = 0; col < img2[row].length; col++) {
                System.out.print(img2[row][col]);
            }
            System.out.println();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}