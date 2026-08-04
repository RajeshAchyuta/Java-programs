public class Main {
    public static void main(String[] args) {
        String text = "I am preparing myself for MNC’s and Product based companies.";
        
        text = text.replace(" ", "");
        
        int k = 0; // Current character index
        int rowSize = 1; // How many characters to print in the current row

        while (k < text.length()) {
            // Print 'rowSize' number of characters
            for (int i = 0; i < rowSize && k < text.length(); i++) {
                System.out.print(text.charAt(k) + "");
                k++;
            }
            System.out.println(); // Jump to next line
            rowSize++; // Increase the number of characters for the next row
        }
    }
}