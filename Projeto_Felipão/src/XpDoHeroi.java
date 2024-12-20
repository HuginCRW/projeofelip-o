import java.util.Scanner;

public class XpDoHeroi {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite o nome do seu personagem:");
            String nomePersonagem = scanner.nextLine();
            System.out.println("Bem-vindo, " + nomePersonagem + "!");
            int nivel = 1;
            int xp = 0;
            int xpTotal = 0;
            System.out.println("Seu nível inicial é: " + nivel);
            System.out.println("Seus pontos de experiência iniciais são: " + xp);
            boolean continuar = true;
         
            while (continuar) {
               
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar experiência");
                System.out.println("2. Exibir status do personagem");
                System.out.println("3. Sair");
                
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite a quantidade de experiência a adicionar:");
                        int xpAdicional = scanner.nextInt();
                        xp += xpAdicional;
                        xpTotal += xpAdicional; 
                        
                        
                        while (xp >= 1000) {
                            xp -= 1000;
                            nivel++;
                            System.out.println("Parabéns! Você subiu para o nível " + nivel + "!");
                        }
                    }
                        
                    case 2 -> {
                       
                        System.out.println("\nStatus do Personagem:");
                        System.out.println("Nome: " + nomePersonagem);
                        System.out.println("Nível: " + nivel);
                        System.out.println("XP atual: " + xp + "/1000");
                        System.out.println("XP total: " + xpTotal);
                        System.out.println("Classificação: " + verificarClassificacao(xpTotal));
                    }
                        
                    case 3 -> {
                        
                        System.out.println("Saindo... Até logo, " + nomePersonagem + "!");
                        continuar = false;
                    }
                        
                    default -> 
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }
            
        }
    }

    
    public static String verificarClassificacao(int xpTotal) {
        if (xpTotal < 1000) {
            return "Ferro";
        } else if (xpTotal <= 2000) {
            return "Bronze";
        } else if (xpTotal <= 5000) {
            return "Prata";
        } else if (xpTotal <= 7000) {
            return "Ouro";
        } else if (xpTotal <= 8000) {
            return "Platina";
        } else if (xpTotal <= 9000) {
            return "Ascendente";
        } else if (xpTotal <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }
}