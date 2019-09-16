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
		movieList.add(new Cinema ("기생충",                                     
				                   new Director("봉준호", 51, "대구", "칸영화제 황금종려상"),
				                   new Actor("송강호", 53, "김해", "연극 동승"),
				                   new Specification ("CJ엔터테인먼트", "드라마", "15세"), 20190530));	
 
		movieList.add(new Cinema ("아가씨",                                     
				                   new Director("박찬욱", 57, "서울", "베를린영화제 황금곰상"),
				                   new Actor("김민희", 38, "서울", "학교2"),
				                   new Specification ("CJ엔터테인먼트", "스릴러", "청불"), 20160601));		
		
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
