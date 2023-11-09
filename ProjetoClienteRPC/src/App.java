import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);
    	
        try {
            Scanner scanner = new Scanner(System.in);
            int escolha;
            do {
                // Exibição do menu
                System.out.println("Escolha uma opção:");
                System.out.println("1. Calcular área de um Quadrado");
                System.out.println("2. Calcular área de um Triângulo Retângulo");
                System.out.println("3. Calcular área de uma Circunferência");
                System.out.println("4. Calcular área de uma Esfera");
                System.out.println("5. Calcular volume de uma Esfera");
                System.out.println("6. Calcular área de um Cilindro");
                System.out.println("7. Calcular volume de um Cilindro");
                System.out.println("8. Calcular área de superfície de um Cubo");
                System.out.println("9. Calcular volume de um Cubo");
                System.out.println("0. Sair");

                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        // Lógica para calcular a área do Quadrado
                        System.out.print("Digite o lado do quadrado: ");
                        double ladoQuadrado = scanner.nextDouble();
                        double areaQuadrado = rpc.calcularAreaQuadrado(ladoQuadrado);
                        System.out.println("Área do Quadrado: " + areaQuadrado);
                        break;
                    case 2:
                        // Lógica para calcular a área do Triângulo Retângulo
                        System.out.print("Digite a base do triângulo retângulo: ");
                        double baseTriangulo = scanner.nextDouble();
                        System.out.print("Digite a altura do triângulo retângulo: ");
                        double alturaTriangulo = scanner.nextDouble();
                        double areaTriangulo = rpc.calcularAreaTrianguloRetangulo(baseTriangulo, alturaTriangulo);
                        System.out.println("Área do Triângulo Retângulo: " + areaTriangulo);
                        break;
                    case 3:
                        // Lógica para calcular a área de uma Circunferencia
                        System.out.print("Digite o raio: ");
                        double raioCircunferencia = scanner.nextDouble();
                        double areaCircunferencia = rpc.calcularAreaCircunferencia(raioCircunferencia);
                        System.out.println("Área da Circunferência: " + areaCircunferencia);
                        break;
                    case 4:
                        // Lógica para calcular a área de uma Esfera
                        System.out.print("Digite o raio: ");
                        double raioEsfera = scanner.nextDouble();
                        double areaEsfera = rpc.calcularAreaEsfera(raioEsfera);
                        System.out.println("Área da Esfera: " + areaEsfera);
                        break;
                    case 5:
                        // Lógica para calcular o volume de uma Esfera
                        System.out.print("Digite o raio: ");
                        double raioVolumeEsfera = scanner.nextDouble();
                        double volumeEsfera = rpc.calcularVolumeEsfera(raioVolumeEsfera);
                        System.out.println("Volume da Esfera: " + volumeEsfera);
                        break;
                    case 6:
                        // Lógica para calcular a área de um Cilindro
                        System.out.print("Digite o raio: ");
                        double raioCilindro = scanner.nextDouble();
                        System.out.print("Digite a altura: ");
                        double alturaCilindro = scanner.nextDouble();
                        double areaCilindro = rpc.calcularAreaCilindro(raioCilindro, alturaCilindro);
                        System.out.println("Área de um Cilindro: " + areaCilindro);
                        break;
                    case 7:
                        // Lógica para calcular o volume de um Cilindro
                        System.out.print("Digite o raio: ");
                        double raioVolumeCilindro = scanner.nextDouble();
                        System.out.print("Digite a altura: ");
                        double alturaVolumeCilindro = scanner.nextDouble();
                        double volumeCilindro = rpc.calcularVolumeCilindro(raioVolumeCilindro, alturaVolumeCilindro);
                        System.out.println("Volume do Cilindro: " + volumeCilindro);
                        break;
                    case 8:
                        // Lógica para calcular a área de superficie de um Cubo
                        System.out.print("Digite o lado do cubo: ");
                        double ladoCubo = scanner.nextDouble();
                        double areaCubo = rpc.calcularAreaSuperficieCubo(ladoCubo);
                        System.out.println("Área de superfície de um Cubo: " + areaCubo);
                        break;
                    case 9:
                        // Lógica para calcular o volume de um Cubo
                        System.out.print("Digite o lado do cubo: ");
                        double ladoVolumeCubo = scanner.nextDouble();
                        double volumeCubo = rpc.calcularVolumeCubo(ladoVolumeCubo);
                        System.out.println("Volume do Cubo: " + volumeCubo);
                        break;
                    case 0:
                        // Lógica para sair do programa
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (escolha != 0);

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
