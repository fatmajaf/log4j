package service;
import org.apache.log4j.*;
public class AffichageLog {
	private static final Logger l = Logger.getLogger(AffichageLog.class);

	public static void main(String[] args) {
		AffichageLog al = new AffichageLog();
		al.getAllPrducts();
	}

	public void getAllPrducts() {
		try {
			l.info("In getAllPrducts() : ");
			l.debug("Je vais lancer la divsion.");
			int i = 1 / 0;
			l.debug("Je viens de lancer la divsion. " + i);
			l.debug("Je viens de finir l'op�ration X.");
			l.info("Out getAllPrducts() without errors.");
		} catch (Exception e) {
			l.error("Erreur dans getAllPrducts() : " + e);
		}
	}
}