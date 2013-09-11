package ema.client.place.index;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.IsWidget;

public class IndexPresenter {

	private IndexViewImpl view;

	public IndexPresenter() {
		view = new IndexViewImpl();
		// view.setButtonText("Hello World.");
		view.setClickHandler(new ClickHandler() {

			public void onClick(ClickEvent arg0) {
				Window.alert("hallo.");

			}
		});
	}

	public IsWidget asWidget() {
		return view.asWidget();

	}
}
