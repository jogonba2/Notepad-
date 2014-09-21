package es.upv.etsinf.ipc;

import com.trolltech.qt.gui.*;

public class SearchDialog extends QWidget {

    Ui_SearchDialog ui = new Ui_SearchDialog();

    public SearchDialog() {
        ui.setupUi(this);
    }

    public SearchDialog(QWidget parent) {
        super(parent);
        ui.setupUi(this);
    }
}
