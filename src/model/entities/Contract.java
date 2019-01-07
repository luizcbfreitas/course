package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date dateContract;
	private Double totalValue;

	private List<Installment> installments = new ArrayList<>();

	public Contract() {
	}

	public Contract(Integer number, Date dateContract, Double totalValue) {
		this.number = number;
		this.dateContract = dateContract;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installments;
	}

	public void addInstallment(Installment item) {

		installments.add(item);

	}

	public void removeInstallment(Installment item) {

		installments.remove(item);

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (Installment i : installments) {

			sb.append(i);

		}

		return sb.toString();

	}

}
