package com.vw.ide.client.ui.windowspanel;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.sencha.gxt.widget.core.client.menu.Item;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.menu.MenuItem;
import com.sencha.gxt.widget.core.client.menu.SeparatorMenuItem;
import com.vw.ide.client.Resources;
import com.vw.ide.client.event.uiflow.ProjectMenuEvent;
import com.vw.ide.client.presenters.Presenter;
import com.vw.ide.client.projects.FilesTypesEnum;
import com.vw.ide.shared.OperationTypes;
import com.vw.ide.shared.servlet.remotebrowser.FileItemInfo;

public class WindowsPanelContextMenu extends Menu {
	private MenuItem insertFringe;
	public Presenter presenter;

	public SelectionHandler<Item> selectionHandler = new SelectionHandler<Item>() {
		@Override
		public void onSelection(SelectionEvent<Item> event) {
			if (event.getSelectedItem().getParent() instanceof WindowsPanelContextMenu) {
				WindowsPanelContextMenu menu = (WindowsPanelContextMenu) event.getSelectedItem().getParent();
				if (menu.presenter != null) {
					menu.presenter.fireEvent(new ProjectMenuEvent(event.getSelectedItem().getItemId()));
				}
			}
		}
	};

	public WindowsPanelContextMenu() {
		insertFringe = new MenuItem();
		insertFringe.setItemId(OperationTypes.CLEAR_CONSOLE_WINDOW.getName());
		insertFringe.setText("Clear");
		insertFringe.setIcon(Resources.IMAGES.new_con_en());
		insertFringe.addSelectionHandler(selectionHandler);
		this.add(insertFringe);
	}

	public void associatePresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	public int calcItemsWidth() {
		return insertFringe.getElement().getClientWidth();
	}

}
