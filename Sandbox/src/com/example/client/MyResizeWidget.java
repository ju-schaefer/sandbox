package com.example.client;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

public class MyResizeWidget extends ResizeComposite {
	
	private SplitLayoutPanel widget;

	public MyResizeWidget() {
		widget = new SplitLayoutPanel();
		
		widget.addWest(new HTML("navigation"), 128);
		widget.addNorth(new HTML("list"), 384);
		widget.add(new HTML("details"));
		
		initWidget(widget);
	}
	
}
