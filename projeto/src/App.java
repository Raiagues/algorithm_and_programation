public class App {
    public static void main(String[] args) throws Exception {
        FabricaDeVeiculos fabrica = new FabricaDeVeiculos();
        Veiculo meuVeiculo = fabrica.criarVeiculo("carro");
        meuVeiculo.acelerar();
    }
}
