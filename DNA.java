//This program determines whether there is a protein in a strand of DNA.
//dna1 contains a protein, dna2 does not contain a protein, and dna3 contains a protein :)

public class DNA {

  public static void main(String[] args) {

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    if (start != -1 && stop != -1 && (stop-start) % 3 == 0) {
      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No such protein");
      }
  }
}
