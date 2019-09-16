package movie.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Actor extends People {
	
	 private String debutMovie;
	 
	 public Actor(String name, int age, String birthPlace, String debutMovie) {
		 super(name, age, birthPlace);
		 this.debutMovie = debutMovie;		 
	 }
	 
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(super.toString());
			builder.append(", µ•∫ﬂ¿€ : ");
			builder.append(debutMovie);
			builder.append("]");
			return builder.toString();
		}
	 
	
}
