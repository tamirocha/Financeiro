package org.example;

public abstract class Conta {

    public String descricao;
    public double valor;
    public String dataVencimento;
    public Fornecedor fornecedor;
    public Cliente cliente;
    public SituacaoConta situacaoConta;


    public Conta() {

        this.situacaoConta = SituacaoConta.PENDENTE;
    }


    public void cancelar() throws OperacaoContaException {
        if (situacaoConta == SituacaoConta.CANCELADA || situacaoConta == SituacaoConta.PAGA) {
            throw new OperacaoContaException("Erro: Esta conta não pode ser cancelada, já está paga ou já está cancelada!");
            //System.out.println("Erro: Está conta não pode ser Cancelada! Já está paga ou já foi cancelada anteriormente!");
        } else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("Conta cancelada com sucesso!");
        }
    }

    public abstract void exibirDetalhes();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void setSituacaoConta(SituacaoConta situacaoConta) {
        this.situacaoConta = situacaoConta;
    }
}
