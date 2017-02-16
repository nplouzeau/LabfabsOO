package laiterie;

import java.util.logging.Logger;

public class AlerteBidon implements Alerte{

	@Override
	public void executer() {
		Logger.getGlobal().info("Ca déborde !!!");
	}

}
