public class ProteinTranslation {
    public static void main(String[] args) {
        String s = args[0];
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'A')
                a[i] = 'U';
            else if (a[i] == 'C')
                a[i] = 'G';
            else if (a[i] == 'G')
                a[i] = 'C';
            else if (a[i] == 'T')
                a[i] = 'A';
        }

        String protein = "";
        for (int x = 0; x < a.length; x++) {
            protein += a[x];
        }
        int start = protein.indexOf("AUG");
        String bigBoiProtein = "";
        
        for(int i = start; i < protein.length(); i+=3)
        {
            if (i <= protein.length() && i+3 <= protein.length())
            {
                String subProtein = protein.substring(i, i+3);
                if(subProtein.equals("UAA") || subProtein.equals("UGA") || subProtein.equals("UAG"))
                {
                    break;
                }
                String brotein = translate(subProtein);
                bigBoiProtein += brotein;
            }
        }
        System.out.println(bigBoiProtein + "\n");
    }

    public static String translate(String condons) {
        switch (condons) {
            case ("GCA"):
                return "Ala ";
            case ("GCC"):
                return "Ala ";
            case ("GCG"):
                return "Ala ";
            case ("GCU"):
                return "Ala ";
            case ("CGA"):
                return "Arg ";
            case ("CGC"):
                return "Arg ";
            case ("CGG"):
                return "Arg ";
            case ("CGU"):
                return "Arg ";
            case ("AGA"):
                return "Arg ";
            case ("AGG"):
                return "Arg ";
            case ("AAU"):
                return "Asn ";
            case ("AAC"):
                return "Asn ";
            case ("GAU"):
                return "Asp ";
            case ("GAC"):
                return "Asp ";
            case ("UGU"):
                return "Cys ";
            case ("UGC"):
                return "Cys ";
            case ("CAA"):
                return "Gln ";
            case ("CAG"):
                return "Gln ";
            case ("GAA"):
                return "Glu ";
            case ("GAG"):
                return "Glu ";
            case ("GGA"):
                return "Gly ";
            case ("GGC"):
                return "Gly ";
            case ("GGG"):
                return "Gly ";
            case ("GGU"):
                return "Gly ";
            case ("CAU"):
                return "His ";
            case ("CAC"):
                return "His ";
            case ("AUU"):
                return "lle ";
            case ("AUC"):
                return "lle ";
            case ("AUA"):
                return "lle ";
            case ("CUA"):
                return "leu ";
            case ("CUC"):
                return "leu ";
            case ("CUG"):
                return "leu ";
            case ("CUU"):
                return "leu ";
            case ("UUA"):
                return "leu ";
            case ("UUG"):
                return "leu ";
            case ("AUG"):
                return "Met ";
            case ("UUU"):
                return "Phe ";
            case ("UUC"):
                return "Phe ";
            case ("CCA"):
                return "Pro ";
            case ("CCC"):
                return "Pro ";
            case ("CCG"):
                return "Pro ";
            case ("CCU"):
                return "Pro ";
            case ("UCA"):
                return "Ser ";
            case ("UCC"):
                return "Ser ";
            case ("UCG"):
                return "Ser ";
            case ("UCU"):
                return "Ser ";
            case ("AGU"):
                return "Ser ";
            case ("AGC"):
                return "Ser ";
            case ("ACA"):
                return "Thr ";
            case ("ACC"):
                return "Thr ";
            case ("ACG"):
                return "Thr ";
            case ("ACU"):
                return "Thr ";
            case ("UGG"):
                return "Trp ";
            case ("UAU"):
                return "Tyr ";
            case ("UAC"):
                return "Tyr ";
            case ("GUA"):
                return "Val ";
            case ("GUC"):
                return "Val ";
            case ("GUG"):
                return "Val ";
            case ("GUU"):
                return "Val ";
            default:
                return "";
        }
    }
}