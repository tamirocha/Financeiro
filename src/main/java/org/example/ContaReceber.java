package org.example;

public class ContaReceber extends Conta{


    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void receber() {
        System.out.println("O valor de R$ " + this.getValor() + " foi recebido em sua conta corrente!");
    }

    public void cancelar() throws OperacaoContaException {
        if (valor <= 50000.00) {
            situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("Está conta a receber pode ser CANCELADA, seu valor é menor ou igual a 50.000,00.");
        } else {
            throw new OperacaoContaException("Erro: Essa conta a receber não pode ser Cancelada, seu valor é superior a 50.000,00");
            //System.out.println("Essa conta a receber NÃO pode ser cancelada, seu valor é superior a 50.000,00");
        }
    }

    @Override
    public void exibirDetalhes() {

    }
}
