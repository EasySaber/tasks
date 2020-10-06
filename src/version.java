public class version {
    public static void main(String[] args) {
        final String v1 = "8.1.13.41";
        final String v2 = "8.1.009.125";
        String res = " = ";

        String vz1 = v1;
        String vz2 = v2;
        int n1;
        int n2;
        int m1;
        int m2;

        do {
            n1 = vz1.indexOf(".");
            n2 = vz2.indexOf(".");
            m1 = Integer.parseInt(vz1.substring(0, n1 != -1 ? n1 : vz1.length()));
            m2 = Integer.parseInt(vz2.substring(0, n2 != -1 ? n2 : vz2.length()));
            if (m1 > m2) {
                res = " older ";
                break;
            }
            if (m1 < m2) {
                res = " under ";
                break;
            }
            if (n1 == -1) {
                break;
            }
            vz1 = vz1.substring(n1 + 1);
            vz2 = vz2.substring(n2 + 1);
        } while (true);

        System.out.println("Result: " + v1 + res + v2);
    }
}
