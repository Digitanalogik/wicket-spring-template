package web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;

@WicketHomePage
public class WicketTemplate extends WebPage {

    public WicketTemplate() {

        add(new Label("message", "Hello Wicket World!"));

    }
}

