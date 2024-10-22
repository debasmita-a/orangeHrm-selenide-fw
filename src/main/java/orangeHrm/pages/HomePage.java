package orangeHrm.pages;

import pagecomponents.LeftMenuComponent;

public class HomePage {
	
	private LeftMenuComponent leftMenuComponent;
	
	public HomePage() {
		this.leftMenuComponent = new LeftMenuComponent();
	}

	public LeftMenuComponent getLeftMenuComponent() {
		return leftMenuComponent;
	}
}
