package movie.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Director extends People{
	private String award;
	
	public Director(String name, int age, String birthPlace, String award) {
		super(name, age, birthPlace);
		this.award = award;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", ¼ö»óÀÛ : ");
		builder.append(award);		
		builder.append("]");
		return builder.toString();
	}
}
