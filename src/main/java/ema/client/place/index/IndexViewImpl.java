package ema.client.place.index;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class IndexViewImpl {

	public interface IndexViewImplUiBinder extends
			UiBinder<Widget, IndexViewImpl> {
	}

	@UiField
	Button sendButton;
	private Widget widget;

	public IndexViewImpl() {
		UiBinder<Widget, IndexViewImpl> uiBinder = GWT
				.create(IndexViewImplUiBinder.class);
		widget = uiBinder.createAndBindUi(this);
	}

	public void setButtonText(String buttonText) {
		sendButton.setText(buttonText);
	}

	public IsWidget asWidget() {
		return widget;
	}

	public void setClickHandler(ClickHandler handler) {
		sendButton.addClickHandler(handler);
	}

}
