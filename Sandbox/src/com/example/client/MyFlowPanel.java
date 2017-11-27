package com.example.client;

import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;

public class MyFlowPanel extends FlowPanel {

	public MyFlowPanel() {
		super();
		
		getElement().getStyle().setBorderColor("red");
		getElement().getStyle().setBorderStyle(BorderStyle.DOTTED);
		getElement().getStyle().setBorderWidth(2, Unit.PX);

	}
	
}
