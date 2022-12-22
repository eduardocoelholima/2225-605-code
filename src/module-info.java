module Gui {
    requires transitive javafx.controls;
    requires java.rmi;
    exports gui.basics;
    exports gui.events;
    exports gui.layouts;
    exports gui.mvc;

}
