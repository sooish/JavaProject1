package movie.controller;

import java.util.ArrayList;

import movie.model.dto.Cinema;
import movie.model.dto.People;
import movie.service.MovieService;
import movie.view.EndView;
import movie.view.FailView;
import movie.exception.NotExistException;

public class MovieController {

	private static MovieController instance = new MovieController();
	private MovieService service = MovieService.getInstance();
	
	private MovieController() {}
	
	public static MovieController getInstance() {
		return instance;
	}

	// ��� ��� ��ȭ �˻�
	public void movieListView() {
		ArrayList<Cinema> movieList = service.getAllMovies();
		if(movieList.size() != 0) {
			EndView.movieListView(movieList);
		} else {
			EndView.messageView("��޵� ��ȭ�� �������� �ʽ��ϴ�.");
		}
	}

	// Ư����ȭ �˻�
	public void movieView(String cinemaTitle) {
		try {
			Cinema film = service.getCinema(cinemaTitle);
			EndView.movieView(film);
		} catch(NotExistException e) {
			FailView.failMessageView(e.getMessage());
			
		}
	}
	
	// ���ο� ��ȭ �߰�
	public void insertMovie(Cinema newFilm) {
		service.movieInsert(newFilm);	
	}
	
	// Ư�� ��ȭ ����
	
	public void deleteMovie(String cinemaTitle) {
		try {
			service.movieDelete(cinemaTitle);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage()); 
		}			
	}

	// Ư�� ��ȭ ����
	 public void updateMovie(String movieTitle, People people) {
		 try {
			 service.movieUpdate(movieTitle, people);
		 } catch (NotExistException e) {
			 FailView.failMessageView(e.getMessage());
		 }
	 }
	 
	 // JSON Ȱ�� ��� ��ȭ ��¸��
	 public void allCastJason() {
		 EndView.jasonAllView(MovieService.getInstance().jsonAllCast());
	 }
	 

	 // JSON Ȱ�� Ư�� ��ȭ ��¸��
	 public void CastJason(String movieTitle) {
		 try {
			 EndView.jsonView(MovieService.getInstance().jsonCast(movieTitle));
		 } catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
	 }	
}	 