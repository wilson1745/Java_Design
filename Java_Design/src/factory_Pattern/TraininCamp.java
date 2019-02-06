package factory_Pattern;

import simple_Factory.Adventurer;

/**
 * 冒險者訓練營介面(Factory)-這邊只是一個概念或規範，要訓練什麼，怎麼訓練留給子類別實作
 */
public interface TraininCamp {

	// 訓練冒險者的過程，訓練後請給我一個冒險者
	public Adventurer trainAdventurer();
}
