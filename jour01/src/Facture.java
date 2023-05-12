public class Facture {
    public static void main(String[] args) {
        float prix = 49.99f, tva, tarifTTC;
        int quantite = 3;
        tva = 0.2f * (prix * quantite);
        tarifTTC = (prix * quantite) + tva;
        System.out.println("Hors TVA = " + prix * quantite + "\nTVA = " + tva + "\nTarif TTC = " + tarifTTC);
    }
}