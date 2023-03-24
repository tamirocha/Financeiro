package org.example;

public class ContaPagar extends Conta {


    public ContaPagar() {
    }



    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() throws OperacaoContaException {
        if (situacaoConta == SituacaoConta.PENDENTE) {
            System.out.println("Está conta está PENDENTE, prossiga com o pagamento!");
            this.situacaoConta = SituacaoConta.PAGA;
        } else {
            throw new OperacaoContaException("Erro: Esta conta já está paga ou já foi cancelada!");
            //System.out.println("Erro: Está conta não pode ser Paga! Já foi paga ou está cancelada!");
        }

        System.out.println("Contas à Pagar");
        System.out.println("-----------------------------");
        System.out.println("descrição: " + this.descricao + "\n" + "valor: " + this.valor + "\n" + "data de vencimento: " + this.dataVencimento + "\n" + "fornecedor: " + this.fornecedor.nome);
    }

    @Override
    public void exibirDetalhes() {

    }

       /*public void totalizador() {
        System.out.println("Total á pagar no mês: ");
        for (int i = 0; i < 9; i++);

    } */
}
