package ema.client.place.index;

import com.google.gwt.user.client.ui.IsWidget;

public class IndexPresenter {

	private IndexViewImpl view;

	public IndexPresenter() {
		view = new IndexViewImpl();
		view.setButtonText("Hello World.");
	}

	public IsWidget asWidget() {
		return view.asWidget();

	}
}
