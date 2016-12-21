public class FixedDepositController2 {
	private FixedDepositService fixedDepositService;

	public FixedDepositController(FixedDepositService service) {
		this.fixedDepositeService = service;
	}

	public boolean submit() {
		//-- save the fixed deposit details
		fixedDepositeService.save(...);
	}
}
