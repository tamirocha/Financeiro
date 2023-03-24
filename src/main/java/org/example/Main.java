package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Fornecedor[] fornecedor = new Fornecedor[8];
        fornecedor[0] = new Fornecedor("Condomínio");
        fornecedor[1] = new Fornecedor("Celesc");
        fornecedor[2] = new Fornecedor("Claro Net");
        fornecedor[3] = new Fornecedor("Claro Móvel");
        fornecedor[4] = new Fornecedor("Acupuntura Camargo");
        fornecedor[5] = new Fornecedor("Contabilizei");
        fornecedor[6] = new Fornecedor("Capitalização Santander");
        fornecedor[7] = new Fornecedor("Benfeitoria");

        Cliente[] cliente = new Cliente[2];
        cliente[0] = new Cliente("Compasso UOL");
        cliente[1] = new Cliente("Desempregada");

        Conta[] cp = new ContaPagar[8];
        cp[0] = new ContaPagar(fornecedor[0], "condomínio 03.2023", 233.00, "10/03/2023");
        cp[1] = new ContaPagar(fornecedor[1], "energia 02.2023", 118.34, "20/03/2023");
        cp[2] = new ContaPagar(fornecedor[2], "internet", 111.64, "15/03/2023");
        cp[3] = new ContaPagar(fornecedor[3], "celular", 57.62, "05/03/2023");
        cp[4] = new ContaPagar(fornecedor[4], "consulta e ervas", 250.00, "06/03/2023");
        cp[5] = new ContaPagar(fornecedor[5], "mensalidade 03/2023", 109.00, "15/03/2023");
        cp[6] = new ContaPagar(fornecedor[6], "título de capitaliz.", 116.91, "10/03/2023");
        cp[7] = new ContaPagar(fornecedor[7], "benfeitoria parc 02 de 10", 275.00, "10/03/2023");

        Conta[] cr = new ContaReceber[2];
        cr[0] = new ContaReceber(cliente[0], "salário mês 02/2023",3500.00, "06/03/2023");
        cr[1] = new ContaReceber(cliente[1], "sem salário", 0.00, "Sem data de vencimento");

        cr[1].setValor(73000.00);
        System.out.println("Você recebeu o valor de R$ " + cr[1].valor + " na sua conta-corrente.");
        try {
            cr[1].cancelar();
        } catch (OperacaoContaException e) {
            System.out.println(cr[1].situacaoConta);
        }


        Conta[] contas = Stream.concat(Arrays.stream(cr), Arrays.stream(cp)).toArray(Conta[]::new);
        RelatorioContas rc = new RelatorioContas();
        rc.exibirListagem(contas);

        //cp[0].pagar();
        //System.out.println(cp[0].getSituacaoConta());

        //cp[1].cancelar();
        //System.out.println(cp[1].situacaoConta);
        //cp[1].pagar();

        //cp[2].pagar();
        //System.out.println(cp[2].situacaoConta);
        //cp[2].pagar();

        //cp[3].pagar();
        //System.out.println(cp[3].situacaoConta);
        //cp[3].cancelar();

        //cr[0].receber();
        //cr[1].setValor(35000.00);
        //System.out.println("Você recebeu o valor de R$ " + cr[1].valor + " na sua conta-corrente.");
        //cr[1].cancelar();
        //System.out.println(cr[1].situacaoConta);

    }
}