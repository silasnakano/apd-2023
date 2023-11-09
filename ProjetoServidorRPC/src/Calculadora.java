public class Calculadora {

    // Método para calcular a área de um quadrado
    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
    
    // Método para calcular a área de um triângulo retângulo
    public double calcularAreaTrianguloRetangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    // Método para calcular a área de uma circunferência
    public double calcularAreaCircunferencia(double raio) {
        return Math.PI * raio * raio;
    }
    
    // Método para calcular a área de uma esfera
    public double calcularAreaEsfera(double raio) {
        return 4 * Math.PI * raio * raio;
    }
    
    // Método para calcular o volume de uma esfera
    public double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }
    
    // Método para calcular a área de um cilindro
    public double calcularAreaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }
    
    // Método para calcular o volume de um cilindro
    public double calcularVolumeCilindro(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }
    
    // Método para calcular a área de superfície de um cubo
    public double calcularAreaSuperficieCubo(double lado) {
        return 6 * lado * lado;
    }
    
    // Método para calcular o volume de um cubo
    public double calcularVolumeCubo(double lado) {
        return lado * lado * lado;
    }

}
