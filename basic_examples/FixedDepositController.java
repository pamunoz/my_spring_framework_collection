public class FixedDepositController {
	private FixedDepositService fixedDepositService;

	public FixedDepositController(){
		fixedDepositService = new FixedDepositService();
	}

	public boolean submit(){
		//-- save the fixed deposit details
		fixedDepositService.save(....);
	}	

}
