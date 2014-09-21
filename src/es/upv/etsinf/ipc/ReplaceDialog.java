package es.upv.etsinf.ipc;

import com.trolltech.qt.gui.*;

public class ReplaceDialog extends QWidget {

    Ui_ReplaceDialog ui = new Ui_ReplaceDialog();

    public ReplaceDialog() {
        ui.setupUi(this);
    }

    public ReplaceDialog(QWidget parent) {
        super(parent);
        ui.setupUi(this);
    }
}
