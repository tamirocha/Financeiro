package org.example;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("Relátio de Contas à Pagar");
        System.out.println("----------------------------------");
        for (int i = 0; i <= contas.length - 1; i++) {
            if (contas[i] instanceof ContaPagar) {
                ContaPagar cp =  (ContaPagar) contas[i];
                System.out.println("Descrição: " + cp.descricao + " Valor R$: " + cp.valor + " Data vencimento: " + cp.dataVencimento + " Fornecedor: " + cp.fornecedor.nome);

            } else {
                ContaReceber cr =  (ContaReceber) contas[i];
                System.out.println("Descrição: " + cr.descricao + " Valor R$: " + cr.valor + " Data vencimento: " + cr.dataVencimento + " Cliente: " + cr.cliente.nome);
            }
        }


    }
}
