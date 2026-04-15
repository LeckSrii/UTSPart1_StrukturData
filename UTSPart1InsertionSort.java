public class UTSPart1InsertionSort {
    public static void main(String[] args) {

        String[] nama = {"Aziz","Artha","Fino","Fajar","Farida","Tiara","Nawang","Cia","Hidayat","Slamet"};
        int[] nilai = {88,75,92,80,85,90,87,78,95,91};

        for (int i = 1; i < nilai.length; i++) {

            int keyNilai = nilai[i];
            String keyNama = nama[i];
            int j = i - 1;

            while (j >= 0 && nilai[j] < keyNilai) {
                nilai[j + 1] = nilai[j];
                nama[j + 1] = nama[j];
                j--;
            }

            nilai[j + 1] = keyNilai;
            nama[j + 1] = keyNama;

            System.out.println("\nIterasi " + i);
            System.out.println("No  Nama                 Nilai");
            for (int k = 0; k < nama.length; k++) {
                System.out.printf("%-3d %-20s %d\n", k+1, nama[k], nilai[k]);
            }
        }
    }
}
