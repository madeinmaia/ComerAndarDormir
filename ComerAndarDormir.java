import java.util.Scanner;

public class Acoes {
    private boolean comendo = false;
    private boolean andando = false;
    private boolean dormindo = false;

    public void comer() {
        if (!comendo && !andando && !dormindo) {
            comendo = true;
            System.out.println("Você está comendo...");
        } else {
            System.out.println("Outra ação está sendo executada. Por favor, aguarde ou pare a ação atual.");
        }
    }

    public void andar() {
        if (!comendo && !andando && !dormindo) {
            andando = true;
            System.out.println("Você está andando...");
        } else {
            System.out.println("Outra ação está sendo executada. Por favor, aguarde ou pare a ação atual.");
        }
    }

    public void dormir() {
        if (!comendo && !andando && !dormindo) {
            dormindo = true;
            System.out.println("Você está dormindo...");
        } else {
            System.out.println("Outra ação está sendo executada. Por favor, aguarde ou pare a ação atual.");
        }
    }

    public void pararDeComer() {
        if (comendo) {
            comendo = false;
            System.out.println("Você parou de comer.");
        } else {
            System.out.println("Você não está comendo no momento.");
        }
    }

    public void pararDeAndar() {
        if (andando) {
            andando = false;
            System.out.println("Você parou de andar.");
        } else {
            System.out.println("Você não está andando no momento.");
        }
    }

    public void pararDeDormir() {
        if (dormindo) {
            dormindo = false;
            System.out.println("Você parou de dormir.");
        } else {
            System.out.println("Você não está dormindo no momento.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Acoes acoes = new Acoes();
        String comando;

        System.out.println("Digite uma ação (comer, andar, dormir, parardecomer, parardeandar, parardedormir) ou 'sair' para encerrar:");

        while (true) {
            comando = scanner.nextLine().trim().toLowerCase();

            switch (comando) {
                case "comer":
                    acoes.comer();
                    break;
                case "andar":
                    acoes.andar();
                    break;
                case "dormir":
                    acoes.dormir();
                    break;
                case "parardecomer":
                    acoes.pararDeComer();
                    break;
                case "parardeandar":
                    acoes.pararDeAndar();
                    break;
                case "parardedormir":
                    acoes.pararDeDormir();
                    break;
                case "sair":
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Comando inválido. Por favor, digite 'comer', 'andar', 'dormir', 'parardecomer', 'parardeandar', 'parardedormir' ou 'sair'.");
            }
        }
    }
}
