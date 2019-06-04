package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

public class AvaiPage {

	public AvaiPage() {
		super();
		System.out.println("A new page Dispo has been created");
	}

	public void run() {
		peformActions();
	}

	private void peformActions() {
		System.out.println("on va faire les actions de la DispoPage");
		AvaiPageActions actions = new AvaiPageActions();
		actions.clickContinueButton();
	}
}
