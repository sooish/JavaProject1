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
	private String movieTitle;//��ȭ����
	private Director director;//����
	private Actor actor;//���
	private Specification specification;//���λ���
	private int release; //������
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ��ȭ���� : ");
		builder.append(movieTitle);
		builder.append("\n2. ���� : ");
		builder.append(director);
		builder.append("\n3. ���: ");
		builder.append(actor);
		builder.append("\n4. ���λ���: ");
		builder.append(specification);
		builder.append("\n5. ������ : ");
		builder.append(release);
		return builder.toString(); 
	}
}
