import java.util.Scanner;

public class alunos {

    static Scanner teclado = new Scanner(System.in);
    static String ucSub[] = new String[10];
    static String ucGp[] = new String[8];

    public static void inserirAlunos(String uc[]){
        for (int i = 0; i < uc.length; i++){
            System.out.print("Nome: ");
            uc[i] = teclado.nextLine();
        }
    }

    public static void mostrarAlunos(String uc[]){
        for (int i = 0; i < uc.length; i++){
            System.out.println("Elemento "+(i+1)+" = "+uc[i]);
        }
    }

    public static void mostrarAmbasUC(){
        int k = 0;
        String repetido[] = new String[10];
        for (int i = 0; i < ucSub.length; i++){
            for (int j = 0; j < ucGp.length; j++){
                if (ucGp[j].equals(ucSub[i])){
                    repetido[k] = ucGp[j];
                    k++;
                }
            }
        }
        System.out.print("Alunos em ambas as UCs: ");
        for (int i = 0; i < repetido.length; i++){
            if ((repetido[i] != "") && (repetido[i] != null)) {
                System.out.print(repetido[i]+", ");
            }
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        int uc = 0;
        while (opcao != 9){
            System.out.println("\n1 - Inserir alunos da UC");
            System.out.println("2 - Mostrar alunos da UC");
            System.out.println("9 - Fim");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Selecione a UC para inserir os alunos.");
                    System.out.println("1 - Sub-Rotinas");
                    System.out.println("2 - Gerência de Projetos");
                    uc = teclado.nextInt();
                    teclado.nextLine();
                    switch (uc){
                        case 1:
                            inserirAlunos(ucSub);
                            break;
                        case 2:
                            inserirAlunos(ucGp);
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                    }
                    break;
                case 2:
                    System.out.println("Selecione a UC para mostrar os alunos.");
                    System.out.println("1 - Sub-Rotinas");
                    System.out.println("2 - Gerência de Projetos");
                    System.out.println("3 - Mostrar para ambas as UC");
                    uc = teclado.nextInt();
                    teclado.nextLine();
                    switch (uc){
                        case 1:
                            mostrarAlunos(ucSub);
                            break;
                        case 2:
                            mostrarAlunos(ucGp);
                            break;
                        case 3:
                            mostrarAmbasUC();
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                    }
                    break;
                case 9:
                    System.out.println("Fim.");
            }
        }
    }
}
