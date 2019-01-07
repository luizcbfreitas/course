package model.service;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class PaymentService {

	private Integer numInstallments;

	private CalculateInstallment installmentValueOfService;

	public PaymentService() {

	}

	public PaymentService(Integer numInstallments, CalculateInstallment installmentValueOfService) {
		this.numInstallments = numInstallments;
		this.installmentValueOfService = installmentValueOfService;
	}

	public void processInstallment(Contract contract) {

		double amount = contract.getTotalValue() / numInstallments;

		for (int i = 1; i <= numInstallments; i++) {

			double amountCalculated = installmentValueOfService.installmentValueOfService(amount, i);

			Calendar cal = Calendar.getInstance();

			cal.setTime(contract.getDateContract());

			cal.add(Calendar.MONTH, i);
 
			contract.addInstallment(new Installment(cal.getTime(), amountCalculated));

		}

	}

}
