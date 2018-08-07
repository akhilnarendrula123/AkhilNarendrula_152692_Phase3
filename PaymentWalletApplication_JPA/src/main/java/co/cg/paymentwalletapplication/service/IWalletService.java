package co.cg.paymentwalletapplication.service;



import co.cg.paymentwalletapplication.beans.Customer;
import co.cg.paymentwalletapplication.exception.PaymentWalletException;


public interface IWalletService {
	public String createAccount(Customer customerBean);

	public Customer showBalance(String custContact);

	public boolean withdrawAmount(double withdrawAmt, String custContact);

	public boolean depositAmount(double depositAmt, String custContact);

	public boolean fundTransfer(String senderCont, String receiverCont, double custBalance)
			throws PaymentWalletException;

	public StringBuilder printTransactions(String mob);

	public boolean validateDetails(Customer customerBean) throws PaymentWalletException;

	public Customer login(String id, String password) throws PaymentWalletException;
}
