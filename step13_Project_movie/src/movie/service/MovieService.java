package movie.service;

import java.util.ArrayList;

import movie.model.dto.Actor;
import movie.model.dto.Cinema;
import movie.model.dto.Director;
import movie.model.dto.People;
import net.sf.json.JSONArray;
import movie.exception.NotExistException;
import movie.model.MovieModelVirtuaDB;

public class MovieService {

	private static MovieService instance = new MovieService();
	private MovieModelVirtuaDB movieVirtualData = MovieModelVirtuaDB.getInstance();
	
	private MovieService() {}
	public static MovieService getInstance() {
		return instance;
	}
	//모든 영화 반환
	public ArrayList<Cinema> getAllMovies(){
		return movieVirtualData.getMovieList();
	}
	
	// 특정 영화 반환
	public Cinema getCinema(String cinemaTitle) throws NotExistException {
		Cinema film = null;
		ArrayList<Cinema> movieList = movieVirtualData.getMovieList();
		int cCount = movieList.size();
		for (int i = 0; i < cCount; i++) {
			if (movieList.get(i).getMovieTitle().equals(cinemaTitle)) {
				film = movieList.get(i);
			}
		}
		if (film == null) {
			throw new NotExistException("검색 요청하신 영화는 존재하지 않습니다.\n");
		}
		return film;		
	}
	
	// 영화 추가
	 public void movieInsert(Cinema film) {
		 movieVirtualData.insertMovie(film);
	 }
	 
	 // 영화 삭제
	 public void movieDelete(String movieTitle) throws NotExistException {
		 Cinema film = null;
		 film = getCinema(movieTitle);
		 if(film == null) {
			 throw new NotExistException("삭제 요청하신 영화가 존재하지 않습니다.\n");
		 }
		 movieVirtualData.getMovieList().remove(film);
	 }
	 
	 // 특정영화 수정 - 영화명으로 감독 또는 배우 정보 수정
	 
	 public void movieUpdate(String movieTitle, People people) throws NotExistException {
		 Cinema film = getCinema(movieTitle);
		 if(film == null) {
			 throw new NotExistException("수정하시려는 영화가 존재하지 않습니다.\n");
		 }
		 if(people instanceof Director) {
			 film.setDirector((Director)people);
		 } else if (people instanceof Actor) {
			 film.setActor((Actor)people);
		 } else {
			 throw new NotExistException("수정하시려는 감독/배우 정보가 존재하지 않습니다.\n");
		 }		 		 
	 }
	 
	 // 모든 영화 JSON 변환 
	 
	 public JSONArray jsonAllCast() {
		 return JSONArray.fromObject(MovieModelVirtuaDB.getInstance().getMovieList());
	 }
	 
	 // 특정 영화 JSON 변환
	 
	 public JSONArray jsonCast(String movieTitle) throws NotExistException {
		 Cinema film = null;
		 film = getCinema(movieTitle);
		 if (film == null) {
			 throw new NotExistException("변환하고자 하는 영화가 부재합니다.\n");
		 }
		 return JSONArray.fromObject(film);
		 }
	 }
	 
 
 
	 
 
 