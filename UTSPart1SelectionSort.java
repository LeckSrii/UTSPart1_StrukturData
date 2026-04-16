public class UTSPart1SelectionSort {
    public static void main(String[] args) {

        String[] nama = {"Faril","Fino","Ahmad","Fajar","Farida","Tiara","Nawang","Khofifah","Hidayat","Slamet" };
        int[] nilai = {88,75,92,80,85,90,87,78,95,91};

        for (int i = 0; i < nilai.length - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < nilai.length; j++) {
                if (nilai[j] > nilai[maxIndex]) {
                    maxIndex = j;
                }
            }

            int tempNilai = nilai[i];
            nilai[i] = nilai[maxIndex];
            nilai[maxIndex] = tempNilai;

            String tempNama = nama[i];
            nama[i] = nama[maxIndex];
            nama[maxIndex] = tempNama;

            System.out.println("\nIterasi " + (i + 1));
            System.out.println("No  Nama                 Nilai");
            for (int k = 0; k < nama.length; k++) {
                System.out.printf("%-3d %-20s %d\n", k+1, nama[k], nilai[k]);
            }
        }
    }
}
