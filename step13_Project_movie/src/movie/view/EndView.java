package movie.view;

import java.util.ArrayList;

import movie.model.dto.Cinema;
import net.sf.json.JSONArray;
 

public class EndView {

	// ��� ��ȭ ���
	public static void movieListView(ArrayList<Cinema> allCinema) {
		 
		for(int index = 0; index < allCinema.size(); index ++) {
			System.out.println("[��ȭ" + ( index+1) + "]\n" + allCinema.get(index) + "\n");
		}
	}
	
	// Ư�� ��ȭ ���
	public static void movieView(Cinema film){
		System.out.println(film);		
	}
		
	// ���� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}
	
	// ��� ��ȭ JSON ���
	public static void jasonAllView(JSONArray jsonfilm) {
		System.out.println(jsonfilm);
	}
	
	// ���� JSON ���
	public static void jsonView(JSONArray jsonflim) {
		System.out.println(jsonflim);
	}
}
