package movie.model;

import java.util.ArrayList;

import movie.model.dto.Actor;
import movie.model.dto.Cinema;
import movie.model.dto.Director;
import movie.model.dto.Specification;
 

public class MovieModelVirtuaDB {	
	private static MovieModelVirtuaDB instance = new MovieModelVirtuaDB();
	private ArrayList<Cinema> movieList = new ArrayList<Cinema>();

	private MovieModelVirtuaDB() {
		movieList.add(new Cinema ("�����",                                     
				                   new Director("����ȣ", 51, "�뱸", "ĭ��ȭ�� Ȳ��������"),
				                   new Actor("�۰�ȣ", 53, "����", "���� ����"),
				                   new Specification ("CJ�������θ�Ʈ", "���", "15��"), 20190530));	
 
		movieList.add(new Cinema ("�ư���",                                     
				                   new Director("������", 57, "����", "��������ȭ�� Ȳ�ݰ���"),
				                   new Actor("�����", 38, "����", "�б�2"),
				                   new Specification ("CJ�������θ�Ʈ", "������", "û��"), 20160601));		
		
	}
	public static MovieModelVirtuaDB getInstance() {
		return instance;
	}
	
	public ArrayList<Cinema> getMovieList() {
		return movieList;
	}
	
	public void insertMovie(Cinema newCinema) {
		movieList.add(newCinema);
	}
}
