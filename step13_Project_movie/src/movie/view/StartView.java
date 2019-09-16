package movie.view;

import movie.controller.MovieController;
import movie.model.dto.Actor;
import movie.model.dto.Cinema;
import movie.model.dto.Director;
import movie.model.dto.Specification;
 

public class StartView {

	public static void main(String[] args) {
	
		MovieController controller = MovieController.getInstance();

		
		//새로운 감독
		Director director3 = new Director ("최국희", 44, "서울", "우디네 극동영화제 관객상");
		//새로운 배우
		Actor actor3 = new Actor ("김혜수", 50, "부산", "깜보");
		//새로운 세부사항
		Specification specification3 = new Specification ("CJ엔터테인먼트", "드라마", "12세");
		//새로운 영화
		Cinema cinema3 = new Cinema ("국가부도의 날", director3, actor3, specification3, 20181128);
	
		System.out.println();
		
		System.out.println("******************** CJ 엔터테인먼트 배급 주요작품 리스트 ******************** ");
		System.out.println();
		
		// 모든 영화 검색
		System.out.println("========================== 1. 모든 영화 검색 ========================== ");
		controller.movieListView();
		
		System.out.println();
		
		System.out.println("========================== 2. 특정 영화 검색 ========================== ");
		controller.movieView("아가씨");
		
		System.out.println();
	
		// 새로운 영화 저장
		System.out.println("==================== 3. 새로운 영화 저장 후 모든 영화 검색 ====================");
		controller.insertMovie(cinema3);
		controller.movieListView();		

		System.out.println();
		
		// 특정 영화 삭제 후 해당 영화 검색(예외처리 확인용)
		
		System.out.println("================= 4. 특정영화 삭제후 해당영화 검색(예외처리 확인용) ==================");
		controller.deleteMovie("국가부도의 날");
		controller.movieView("국가부도의 날");
		
		System.out.println();
		
		// 특정 영화 삭제 후 모든 영화 검색
		
		System.out.println("======================== 5. 특정영화 삭제후 모든영화 검색 ========================");
		controller.movieListView();

		System.out.println();
		
		// 특정 영화 수정후 특정영화 검색
		System.out.println("=================== 6. 특정영화 수정후 해당영화 검색(예외처리 확인용) ===================");
		controller.updateMovie("아가씨", new Actor ("하정우", 42, "미국", "마들렌"));
		controller.movieView("아가씨");
		
		System.out.println();
		
		// 부재하는 영화 수정 (예외처리 확인용)
		
		System.out.println("======================== 7. 부재하는 영화 수정(예외처리용) ========================");
		controller.updateMovie("진범", new Actor ("송새벽", 41, "서울", "고백"));
 
		System.out.println();
		
		// JSON 모든 영화 검색
		
		 System.out.println("========================== 8.JSON 활용한 모든 영화 검색 ==========================");
		 controller.allCastJason();
		 
		 System.out.println();
		 
		// JSON 특정 영화 검색		 

		 System.out.println("=========================== 9.JSON 활용한 특정 영화 검색 =========================");
		 controller.CastJason("기생충");		 
		 
		}	
}	 

