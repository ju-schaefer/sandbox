package com.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class MyCompositeWidget extends Composite {

	public MyCompositeWidget() {
		FlowPanel widget = new FlowPanel();
		widget.add(new HTML("row A"));
		widget.add(new HTML("row B"));
		widget.add(new HTML("row C"));
		
		initWidget(widget);
	}
	
}
