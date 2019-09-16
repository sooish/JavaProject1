package movie.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Specification {
	private String distribution; //배급사
	private String genre;//장르
	private String rating;//등급

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[배급사 : ");
		builder.append(distribution);
		builder.append(", 장르 : ");
		builder.append(genre);
		builder.append(", 등급 : ");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
}
