package chapter06.item30;

//Enum type with constant-specific class bodies and data
public enum Operation2 {
	PLUS("+") {
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;

	Operation2(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}
	
	public static Operation2 fromString(String symbol) {
		return Operation2.valueOf(symbol);
	}


	abstract double apply(double x, double y);

}
