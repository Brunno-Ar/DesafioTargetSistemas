public class desafio4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.println("Percentual de SP: " + (sp / total * 100) + "%");
        System.out.println("Percentual de RJ: " + (rj / total * 100) + "%");
        System.out.println("Percentual de MG: " + (mg / total * 100) + "%");
        System.out.println("Percentual de ES: " + (es / total * 100) + "%");
        System.out.println("Percentual de Outros: " + (outros / total * 100) + "%");
    }
}