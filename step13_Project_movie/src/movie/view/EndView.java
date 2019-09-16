package movie.view;

import java.util.ArrayList;

import movie.model.dto.Cinema;
import net.sf.json.JSONArray;
 

public class EndView {

	// 모든 영화 출력
	public static void movieListView(ArrayList<Cinema> allCinema) {
		 
		for(int index = 0; index < allCinema.size(); index ++) {
			System.out.println("[영화" + ( index+1) + "]\n" + allCinema.get(index) + "\n");
		}
	}
	
	// 특정 영화 출력
	public static void movieView(Cinema film){
		System.out.println(film);		
	}
		
	// 예외 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}
	
	// 모든 영화 JSON 출력
	public static void jasonAllView(JSONArray jsonfilm) {
		System.out.println(jsonfilm);
	}
	
	// 개별 JSON 출력
	public static void jsonView(JSONArray jsonflim) {
		System.out.println(jsonflim);
	}
}
