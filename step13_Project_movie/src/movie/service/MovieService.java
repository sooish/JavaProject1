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
	//��� ��ȭ ��ȯ
	public ArrayList<Cinema> getAllMovies(){
		return movieVirtualData.getMovieList();
	}
	
	// Ư�� ��ȭ ��ȯ
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
			throw new NotExistException("�˻� ��û�Ͻ� ��ȭ�� �������� �ʽ��ϴ�.\n");
		}
		return film;		
	}
	
	// ��ȭ �߰�
	 public void movieInsert(Cinema film) {
		 movieVirtualData.insertMovie(film);
	 }
	 
	 // ��ȭ ����
	 public void movieDelete(String movieTitle) throws NotExistException {
		 Cinema film = null;
		 film = getCinema(movieTitle);
		 if(film == null) {
			 throw new NotExistException("���� ��û�Ͻ� ��ȭ�� �������� �ʽ��ϴ�.\n");
		 }
		 movieVirtualData.getMovieList().remove(film);
	 }
	 
	 // Ư����ȭ ���� - ��ȭ������ ���� �Ǵ� ��� ���� ����
	 
	 public void movieUpdate(String movieTitle, People people) throws NotExistException {
		 Cinema film = getCinema(movieTitle);
		 if(film == null) {
			 throw new NotExistException("�����Ͻ÷��� ��ȭ�� �������� �ʽ��ϴ�.\n");
		 }
		 if(people instanceof Director) {
			 film.setDirector((Director)people);
		 } else if (people instanceof Actor) {
			 film.setActor((Actor)people);
		 } else {
			 throw new NotExistException("�����Ͻ÷��� ����/��� ������ �������� �ʽ��ϴ�.\n");
		 }		 		 
	 }
	 
	 // ��� ��ȭ JSON ��ȯ 
	 
	 public JSONArray jsonAllCast() {
		 return JSONArray.fromObject(MovieModelVirtuaDB.getInstance().getMovieList());
	 }
	 
	 // Ư�� ��ȭ JSON ��ȯ
	 
	 public JSONArray jsonCast(String movieTitle) throws NotExistException {
		 Cinema film = null;
		 film = getCinema(movieTitle);
		 if (film == null) {
			 throw new NotExistException("��ȯ�ϰ��� �ϴ� ��ȭ�� �����մϴ�.\n");
		 }
		 return JSONArray.fromObject(film);
		 }
	 }
	 
 
 
	 
 
 