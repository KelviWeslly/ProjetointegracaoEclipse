package IntegracaoGitHub;

public class ContaBancaria {
	
	 private String cliente;
	    private int numeroConta;
	    protected double saldo;
	    protected static double limite;
	    protected static boolean especial;

	    // Construtor
	    public ContaBancaria() {
	        this.setSaldo(0);
	    }
	    

	    // Contrutor com parametros
	    public ContaBancaria(String cliente, int numeroConta, double limite, boolean especial) {
	        this.cliente = cliente;
	        this.numeroConta = numeroConta;
	        ContaBancaria.especial = especial;
	        ContaBancaria.especial = especial;
	        this.setSaldo(0);
	    }

	    // Um metodo para depositar
	    public void depositar(double valor) {
	        this.setSaldo(this.getSaldo() + valor);
	        System.out.println("Depósito realizado com sucesso.");
	    }

	    // um metodo para sacar
	    public void sacar(double valor) {
	        if (getSaldo() >= valor) {
	            setSaldo(getSaldo() - valor);
	            System.out.println("Saque realizado com sucesso.");
	        } else if (especial && (getSaldo() + limite) >= valor) {
	            setSaldo(getSaldo() - valor);
	            System.out.println("Saque realizado usando cheque especial.");
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    // Consultar saldo
	    public void consultarSaldo() {
	        System.out.println("Saldo atual: R$ " + getSaldo());
	    }
	    

	    public void mostrarDados() {
	           System.out.println("Cliente: " + cliente);
	           System.out.println("Número da conta: " + numeroConta);
	           System.out.println("Saldo: R$ " + getSaldo());
	       }


	    // Cheque especial
	    public void verificarChequeEspecial() {
	        if (getSaldo() < 0) {
	            System.out.println("Cliente está usando cheque especial.");
	        } else {
	            System.out.println("Cliente não está usando cheque especial.");
	        }
	    }

	    // GETTERS E SETTERS
	    public String getCliente() {
	        return cliente;
	    }

	    public void setCliente(String cliente) {
	        this.cliente = cliente;
	    }

	    public int getNumeroConta() {
	        return numeroConta;
	    }

	    public void setNumeroConta(int numeroConta) {
	        this.numeroConta = numeroConta;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public double getLimite() {
	        return limite;
	    }

	    public void setLimite(double limite) {
	    	ContaBancaria.limite = limite;
	    }

	    public static boolean isEspecial() {
	        return especial;
	    }

	    public void setEspecial(boolean especial) {
	    	ContaBancaria.especial = especial;
	    }


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

}