package hu.unideb.prog2;

public class Iris {
	
	double sepalLength, sepalWidth, petalLength, petalWidth;
	String type;
	
	public Iris(String sepalLength, String sepalWidth, 
			String petalLength, String petalWidth, String type) {
		this.sepalLength = Double.parseDouble(sepalLength);
		this.sepalWidth = Double.parseDouble(sepalWidth);
		this.petalLength = Double.parseDouble(petalLength);
		this.petalWidth = Double.parseDouble(petalWidth);
		this.type = type;
	}
	
	

	@Override
	public String toString() {
		return "Iris [sepalLength=" + sepalLength + ", sepalWidth=" + sepalWidth + ", petalLength=" + petalLength
				+ ", petalWidth=" + petalWidth + ", type=" + type + "]";
	}

	public double getSepalLength() {
		return sepalLength;
	}

	public void setSepalLength(double sepalLength) {
		this.sepalLength = sepalLength;
	}

	public double getSepalWidth() {
		return sepalWidth;
	}

	public void setSepalWidth(double sepalWidth) {
		this.sepalWidth = sepalWidth;
	}

	public double getPetalLength() {
		return petalLength;
	}

	public void setPetalLength(double petalLength) {
		this.petalLength = petalLength;
	}

	public double getPetalWidth() {
		return petalWidth;
	}

	public void setPetalWidth(double petalWidth) {
		this.petalWidth = petalWidth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
