package prototype_factory;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		
		PenFactory.init();
		
		IntStream.range(0, 2).forEach(i -> {
			try {
				System.out.println(PenFactory.getPen(CarbonPen.class).getClass());
				System.out.println(PenFactory.getPen(Pencil.class).getClass());
				System.out.println(" ... ");
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		});
		
	}
	
}
