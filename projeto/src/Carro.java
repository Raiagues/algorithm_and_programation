interface Veiculo {
    void acelerar();
    void frear();
}

class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}

class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando");
    }
}

class FabricaDeVeiculos {
    public Veiculo criarVeiculo(String tipo){
        if(tipo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if(tipo.equalsIgnoreCase("moto")) {
            return new Moto();
        } else {
            throw new IllegalArgumentException("Tipo de veículo desconhecido");
        }

    }
}
