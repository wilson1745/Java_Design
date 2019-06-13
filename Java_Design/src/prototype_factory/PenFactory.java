package prototype_factory;

import java.util.Hashtable;
import java.util.Map;

public class PenFactory {

	private static Map<String, Pen> penMap = new Hashtable<>();

	public static void init() {
		Pen carbonPen = new CarbonPen("Carbon Pencil");
		penMap.put(CarbonPen.class.getName(), carbonPen);

		Pen pencil = new Pencil("Pencil");
		penMap.put(Pencil.class.getName(), pencil);
	}

	public static Pen getPen(Class<?> className) throws CloneNotSupportedException {
		Pen cachedShape = penMap.get(className.getName());
		return (Pen) cachedShape.clone();
	}
	
}
