package model;

public class ContaEspecial extends Conta {
	private float limite;

	public ContaEspecial(String nomeTitular, String cpf, int numConta, float saldo, float limite) {
		super(nomeTitular, cpf, numConta, saldo);
		// TODO Auto-generated constructor stub
		this.limite = limite;
	}
	
	@Override
	public boolean debitar(float valor) {
		
		if (valor <= super.saldo + this.limite) {
			super.saldo -= valor;
			if(super.saldo < 0) {
				this.limite += super.saldo;
			}
			return true;
		}
		else {
			return false;
		}
	}
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeTitular=" + nomeTitular + ", numConta=" + numConta
				+ ", saldo=" + saldo + "]";
	}
	
	
	

}
