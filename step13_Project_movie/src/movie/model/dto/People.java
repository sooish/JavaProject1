package movie.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data; 
import lombok.NoArgsConstructor;
 

@NoArgsConstructor
@AllArgsConstructor
@Data
public class People {

		private String name;
		private int age;
		private String birthPlace;

		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("[�̸�: ");
			builder.append(name);
			builder.append(", ���� : ");
			builder.append(age);
			builder.append(", ��� : ");
			builder.append(birthPlace);
			return builder.toString();
		}
		
}

