package br.com.alura.rh;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.ReajustarSalarioService;
import br.com.alura.rh.service.ValidacaoPeriodicidade;
import br.com.alura.rh.service.ValidacaoReajuste;
import br.com.alura.rh.service.ValidacaoReajustePercentual;

public class Application {

	public static void main(String[] args) {

		
		ArrayList<ValidacaoReajuste> list = new ArrayList<>();
		ValidacaoPeriodicidade vp = new ValidacaoPeriodicidade();
		ValidacaoReajustePercentual vr = new ValidacaoReajustePercentual();
		list.add(vr);
		list.add(vp);
		Funcionario funcionario = new Funcionario("Vinicius", "45151454", Cargo.GERENTE, new BigDecimal("100"));
		funcionario.setDataUltimoReajuste(LocalDate.now());
		
		ReajustarSalarioService rs = new ReajustarSalarioService(list);
		rs.reajustarSalarioDoFuncionario(funcionario, new BigDecimal("5.0"));

	}

}
