package movie.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cinema {
	private String movieTitle;//영화제목
	private Director director;//감독
	private Actor actor;//배우
	private Specification specification;//세부사항
	private int release; //개봉일
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 영화제목 : ");
		builder.append(movieTitle);
		builder.append("\n2. 감독 : ");
		builder.append(director);
		builder.append("\n3. 배우: ");
		builder.append(actor);
		builder.append("\n4. 세부사항: ");
		builder.append(specification);
		builder.append("\n5. 개봉일 : ");
		builder.append(release);
		return builder.toString(); 
	}
}
