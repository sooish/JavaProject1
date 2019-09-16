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
	private String distribution; //��޻�
	private String genre;//�帣
	private String rating;//���

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[��޻� : ");
		builder.append(distribution);
		builder.append(", �帣 : ");
		builder.append(genre);
		builder.append(", ��� : ");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
}
