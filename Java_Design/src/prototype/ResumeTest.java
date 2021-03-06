package prototype;

import org.junit.Test;

public class ResumeTest {
	
	@Test
	public void test() throws CloneNotSupportedException {
		System.out.println("===============Test Start===============");
		System.out.println();

		Resume resume = new Resume("Lex Tsai", "Senior Engineer", 1);
		resume.setExperience("2017/06/09", "CyberSoft");
		
		Resume resume2 = (Resume) resume.clone();
		resume2.setLevel(2);
		resume2.setExperience("2019/05/25", "Apple Inc");
		
		Resume resume3 = (Resume) resume2.clone();
		resume3.setLevel(99);
		resume3.setProfession("Killing the White Ghosts");
		resume3.setExperience("2199/11/18", "Game of the Thrones");
		
		System.out.println("==========The First Resume==========");
		resume.display();
		
		System.out.println("==========The Second Resume (from the first resume)==========");
		resume2.display();
		
		System.out.println("==========The Third Resume (from the second resume)==========");
		resume3.display();
		
		System.out.println("===============Test End===============");
		
	}

}
