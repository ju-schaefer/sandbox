package com.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Sandbox implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		/*MyFlowPanel myFlowPanel = new MyFlowPanel();
		myFlowPanel.add(new HTML("row a"));
		myFlowPanel.add(new HTML("row b"));
		myFlowPanel.add(new HTML("row c"));
		
		RootPanel.get().add(myFlowPanel);*/
		
		/*MyCompositeWidget widget = new MyCompositeWidget();
		
		RootPanel.get().add(widget);*/

		MyResizeWidget resizeWidget = new MyResizeWidget();

		RootLayoutPanel.get().add(resizeWidget);
	}
	
}
