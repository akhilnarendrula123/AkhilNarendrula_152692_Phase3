package co.cg.paymentwalletapplication.repo;

import co.cg.paymentwalletapplication.beans.Customer;
import co.cg.paymentwalletapplication.exception.PaymentWalletException;

public interface IWalletRepo {
	public String createAccount(Customer customerBean);

	public Customer showBalance(String custContact);

	public boolean withdrawAmount(double withdrawAmt, String custContact);

	public boolean depositAmount(double depositAmt, String custContact);

	public boolean fundTransfer(String senderCont, String receiverCont, double custAmount)
			throws PaymentWalletException;

	public StringBuilder printTransactions(String mob);

	public Customer login(String mobileNum, String password) throws PaymentWalletException;

	public Customer getCustomerDetails(String mob);
}
