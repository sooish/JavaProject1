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

	// 모든 배급 영화 검색
	public void movieListView() {
		ArrayList<Cinema> movieList = service.getAllMovies();
		if(movieList.size() != 0) {
			EndView.movieListView(movieList);
		} else {
			EndView.messageView("배급된 영화는 존재하지 않습니다.");
		}
	}

	// 특정영화 검색
	public void movieView(String cinemaTitle) {
		try {
			Cinema film = service.getCinema(cinemaTitle);
			EndView.movieView(film);
		} catch(NotExistException e) {
			FailView.failMessageView(e.getMessage());
			
		}
	}
	
	// 새로운 영화 추가
	public void insertMovie(Cinema newFilm) {
		service.movieInsert(newFilm);	
	}
	
	// 특정 영화 삭제
	
	public void deleteMovie(String cinemaTitle) {
		try {
			service.movieDelete(cinemaTitle);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage()); 
		}			
	}

	// 특정 영화 수정
	 public void updateMovie(String movieTitle, People people) {
		 try {
			 service.movieUpdate(movieTitle, people);
		 } catch (NotExistException e) {
			 FailView.failMessageView(e.getMessage());
		 }
	 }
	 
	 // JSON 활용 모든 영화 출력명령
	 public void allCastJason() {
		 EndView.jasonAllView(MovieService.getInstance().jsonAllCast());
	 }
	 

	 // JSON 활용 특정 영화 출력명령
	 public void CastJason(String movieTitle) {
		 try {
			 EndView.jsonView(MovieService.getInstance().jsonCast(movieTitle));
		 } catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
	 }	
}	 