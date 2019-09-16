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
			builder.append("[이름: ");
			builder.append(name);
			builder.append(", 나이 : ");
			builder.append(age);
			builder.append(", 출신 : ");
			builder.append(birthPlace);
			return builder.toString();
		}
		
}

