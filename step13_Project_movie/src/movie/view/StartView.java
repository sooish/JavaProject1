package movie.view;

import movie.controller.MovieController;
import movie.model.dto.Actor;
import movie.model.dto.Cinema;
import movie.model.dto.Director;
import movie.model.dto.Specification;
 

public class StartView {

	public static void main(String[] args) {
	
		MovieController controller = MovieController.getInstance();

		
		//���ο� ����
		Director director3 = new Director ("�ֱ���", 44, "����", "���� �ص���ȭ�� ������");
		//���ο� ���
		Actor actor3 = new Actor ("������", 50, "�λ�", "����");
		//���ο� ���λ���
		Specification specification3 = new Specification ("CJ�������θ�Ʈ", "���", "12��");
		//���ο� ��ȭ
		Cinema cinema3 = new Cinema ("�����ε��� ��", director3, actor3, specification3, 20181128);
	
		System.out.println();
		
		System.out.println("******************** CJ �������θ�Ʈ ��� �ֿ���ǰ ����Ʈ ******************** ");
		System.out.println();
		
		// ��� ��ȭ �˻�
		System.out.println("========================== 1. ��� ��ȭ �˻� ========================== ");
		controller.movieListView();
		
		System.out.println();
		
		System.out.println("========================== 2. Ư�� ��ȭ �˻� ========================== ");
		controller.movieView("�ư���");
		
		System.out.println();
	
		// ���ο� ��ȭ ����
		System.out.println("==================== 3. ���ο� ��ȭ ���� �� ��� ��ȭ �˻� ====================");
		controller.insertMovie(cinema3);
		controller.movieListView();		

		System.out.println();
		
		// Ư�� ��ȭ ���� �� �ش� ��ȭ �˻�(����ó�� Ȯ�ο�)
		
		System.out.println("================= 4. Ư����ȭ ������ �ش翵ȭ �˻�(����ó�� Ȯ�ο�) ==================");
		controller.deleteMovie("�����ε��� ��");
		controller.movieView("�����ε��� ��");
		
		System.out.println();
		
		// Ư�� ��ȭ ���� �� ��� ��ȭ �˻�
		
		System.out.println("======================== 5. Ư����ȭ ������ ��翵ȭ �˻� ========================");
		controller.movieListView();

		System.out.println();
		
		// Ư�� ��ȭ ������ Ư����ȭ �˻�
		System.out.println("=================== 6. Ư����ȭ ������ �ش翵ȭ �˻�(����ó�� Ȯ�ο�) ===================");
		controller.updateMovie("�ư���", new Actor ("������", 42, "�̱�", "���鷻"));
		controller.movieView("�ư���");
		
		System.out.println();
		
		// �����ϴ� ��ȭ ���� (����ó�� Ȯ�ο�)
		
		System.out.println("======================== 7. �����ϴ� ��ȭ ����(����ó����) ========================");
		controller.updateMovie("����", new Actor ("�ۻ���", 41, "����", "���"));
 
		System.out.println();
		
		// JSON ��� ��ȭ �˻�
		
		 System.out.println("========================== 8.JSON Ȱ���� ��� ��ȭ �˻� ==========================");
		 controller.allCastJason();
		 
		 System.out.println();
		 
		// JSON Ư�� ��ȭ �˻�		 

		 System.out.println("=========================== 9.JSON Ȱ���� Ư�� ��ȭ �˻� =========================");
		 controller.CastJason("�����");		 
		 
		}	
}	 

