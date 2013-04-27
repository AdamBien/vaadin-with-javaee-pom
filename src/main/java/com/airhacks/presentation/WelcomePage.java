package com.airhacks.presentation;

import com.airhacks.business.welcome.boundary.ReceptionService;
import com.vaadin.cdi.Root;
import com.vaadin.cdi.VaadinUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import javax.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
@Root
@VaadinUI
public class WelcomePage extends UI {

    @Inject
    ReceptionService service;

    @Override
    protected void init(VaadinRequest request) {
        setSizeFull();
        String message = service.welcome();
        Label label = new Label(message);
        setContent(new HorizontalLayout(label));
    }
}
