import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
	
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }	

    // Calcula a área do quadrado
    public double calcularAreaQuadrado(double lado) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(lado);
        Object resultado = cliente.execute("Calc.calcularAreaQuadrado", parametros);
        return (double) resultado;
    }

    // Calcula a área do Triangulo Retangulo
    public double calcularAreaTrianguloRetangulo(double base, double altura) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(base);
        parametros.add(altura);
        Object resultado = cliente.execute("Calc.calcularAreaTrianguloRetangulo", parametros);
        return (double) resultado;
    }

    // Calcula a área da Circunferencia
    public double calcularAreaCircunferencia(double raio) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(raio);
        Object resultado = cliente.execute("Calc.calcularAreaCircunferencia", parametros);
        return (double) resultado;
    }

    // Calcula a área da Esfera
    public double calcularAreaEsfera(double raio) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(raio);
        Object resultado = cliente.execute("Calc.calcularAreaEsfera", parametros);
        return (double) resultado;
    }

    // Calcula o volume da Esfera
    public double calcularVolumeEsfera(double raio) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(raio);
        Object resultado = cliente.execute("Calc.calcularVolumeEsfera", parametros);
        return (double) resultado;
    }

    // Calcula a área do Cilindro
    public double calcularAreaCilindro(double raio, double altura) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(raio);
        parametros.add(altura);
        Object resultado = cliente.execute("Calc.calcularAreaCilindro", parametros);
        return (double) resultado;
    }

    // Calcula o volume do Cilindro
    public double calcularVolumeCilindro(double raio, double altura) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(raio);
        parametros.add(altura);
        Object resultado = cliente.execute("Calc.calcularVolumeCilindro", parametros);
        return (double) resultado;
    }

    // Calcula a área do Cubo
    public double calcularAreaSuperficieCubo(double lado) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(lado);
        Object resultado = cliente.execute("Calc.calcularAreaSuperficieCubo", parametros);
        return (double) resultado;
    }

    // Calcula o volume do Cubo
    public double calcularVolumeCubo(double lado) throws Exception {
        List<Double> parametros = new ArrayList<>();
        parametros.add(lado);
        Object resultado = cliente.execute("Calc.calcularVolumeCubo", parametros);
        return (double) resultado;
    }

}
