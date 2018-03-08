class Calculator implements java.io.Serializable {
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double result;
	public Calculator() {
	}
	public void setOperandOne(double n) {
		operandOne = n;
	}
	public void setOperation(String n) {
		operation = n;
	}
	public void setOperandTwo(double n) {
		operandTwo = n;
	}
	public void performOperation() {
		if(operation.equals("+")) {
			result = operandOne + operandTwo;
		}
		else {
			result = operandOne - operandTwo;
		}
	}
	public double getResults() {
		return result;
	}
}
