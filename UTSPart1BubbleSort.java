public class UTSPart1BubbleSort {
    public static void main(String[] args) {

        String[] nama = {"Faril","Fino","Ahmad","Fajar","Farida","Tiara","Nawang","Khofifah","Hidayat","Slamet" };
        int[] nilai = {88,75,92,80,85,90,87,78,95,91};

        for (int i = 0; i < nilai.length - 1; i++){

            for (int j = 0; j < nilai.length - i - 1; j++) {
                if (nilai[j] < nilai[j + 1]) {

                    int tempNilai = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = tempNilai;

                    String tempNama = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = tempNama;
                }
            }

            // Tabel tiap iterasi
            System.out.println("\nIterasi " + (i + 1));
            System.out.println("No  Nama                 Nilai");
            for (int k = 0; k < nama.length; k++) {
                System.out.printf("%-3d %-20s %d\n", k+1, nama[k], nilai[k]);
            }
        }
    }
}
