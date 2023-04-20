package quiz2;

public class Person {
	private String name;
	private Double height, weight, bmi;
	private String result;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getBmi() {
		return bmi;
	}

	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "BMI [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + ", result=" + result
				+ "]";
	}


	public Person(String name, Double height, Double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		calbmi();
		calresult();
	}

	public void calbmi() {
		this.bmi = this.weight / ((this.height / 100.0) * (this.height / 100.0));
	}

	public void calresult() {
		if(this.bmi < 18.5 ) {
			this.result = "저체중";
		}else if(this.bmi >=18.5 && this.bmi < 23.0) {
			this.result = "정상";
		}else if(this.bmi>=23.0) {
			this.result = "과체중";
		}else if(this.bmi >= 25) {
			this.result = "비만";
		}
	}
}
