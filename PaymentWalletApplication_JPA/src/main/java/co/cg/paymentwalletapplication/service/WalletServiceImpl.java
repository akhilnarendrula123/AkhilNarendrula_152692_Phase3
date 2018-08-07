package co.cg.paymentwalletapplication.service;



import co.cg.paymentwalletapplication.beans.Customer;
import co.cg.paymentwalletapplication.exception.IPaymentWalletException;
import co.cg.paymentwalletapplication.exception.PaymentWalletException;
import co.cg.paymentwalletapplication.repo.IWalletRepo;
import co.cg.paymentwalletapplication.repo.WalletRepoImpl;

public class WalletServiceImpl implements IWalletService{

	private static IWalletRepo repo = null;

	static {
		repo= new WalletRepoImpl();
	}

	public String createAccount(Customer customerBean) {
		return repo.createAccount(customerBean);
	}

	public Customer login(String mobileNum, String password) throws PaymentWalletException {
		return repo.login(mobileNum, password);
	}

	public Customer showBalance(String custContact) {
		return repo.showBalance(custContact);
	}

	public boolean withdrawAmount(double withdrawAmt, String custContact) {
		return repo.withdrawAmount(withdrawAmt, custContact);
	}

	public boolean depositAmount(double depositAmt, String custContact) {
		return repo.depositAmount(depositAmt, custContact);
	}

	public boolean fundTransfer(String senderCont, String receiverCont, double custBalance)
			throws PaymentWalletException {
		return repo.fundTransfer(senderCont, receiverCont, custBalance);
	}

	public StringBuilder printTransactions(String mob) {
		return repo.printTransactions(mob);
	}

	public boolean validateDetails(Customer customerBean) throws PaymentWalletException {
		boolean result = false;
		String regex = "[A-Z]{1}[a-z]+";
		String regex2 = "^[6-9]{1}[0-9]{9}$";
		String regex3 = "[a-z]{1}[a-z0-9_.]*@gmail.com";
		String regex4 = "[0-9]{2}";
		if (customerBean.getName().matches(regex)) {
			if (customerBean.getMobileNo().matches(regex2)) {
				if (customerBean.getEmailId().matches(regex3)) {
					if (String.valueOf(customerBean.getAge()).matches(regex4)) {
						if (customerBean.getGender().matches("male") || customerBean.getGender().matches("female")
								|| customerBean.getGender().matches("m") || customerBean.getGender().matches("f")) {
							result = true;
						} else
							throw new PaymentWalletException(IPaymentWalletException.ERROR5);
					} else
						throw new PaymentWalletException(IPaymentWalletException.ERROR4);
				} else
					throw new PaymentWalletException(IPaymentWalletException.ERROR3);
			} else
				throw new PaymentWalletException(IPaymentWalletException.ERROR2);
		} else
			throw new PaymentWalletException(IPaymentWalletException.ERROR1);
		return result;
	}

}
