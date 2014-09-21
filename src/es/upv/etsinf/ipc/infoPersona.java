package es.upv.etsinf.ipc;

import com.trolltech.qt.gui.*;

public class infoPersona extends QWidget {

    Ui_infoPersona ui = new Ui_infoPersona();
    Notepad myNotepad;
    
    public infoPersona() {
        ui.setupUi(this);
    }

    public infoPersona(QWidget parent,Notepad myNotepad) {
        super(parent);
        ui.setupUi(this);
        this.myNotepad = myNotepad;
        this.setWindowIcon(new QIcon("classpath:es/upv/etsinf/ipc/icons/person.png"));
        this.setWindowTitle("Información Personal");
        this.setConnects();
    }
    
    private void setConnects(){
    	ui.okButton.clicked.connect(this,"saveAllInPlainText()");
    	ui.closeButton.clicked.connect(this,"close()");
    }
    
    private void saveAllInPlainText(){
    	String res = "";
    	String nulls[] = new String[3];
    	String aux = "";
    	int i = 0;
    	// Guardar Nombre //
    	if(!(aux = ui.nameLineEdit.text().trim()).equals("")) res += "Name: " + aux + "\n";
    	else nulls[i++] = "Name";
    	// Guardar mail //
    	if(!(aux = ui.mailLineEdit.text().trim()).equals("")) res += "Mail: " + aux + "\n";
    	else nulls[i++] = "Mail";
    	// Guardar fecha nacimiento //
    	res += "Birthday: " + ui.birthDateEdit.date().toString() + "\n";
    	// Guardar sexo //
    	res += "Sex: " + ui.sexComboBox.currentText() + "\n";
    	// Guardar curso //
    	res += "Grade: " + ui.gradeComboBox.currentText() + "\n";
    	// Guardar créditos //
    	if(ui.creditsSpinBox.value()<=60) res += "Credits: " + ui.creditsSpinBox.value() + "\n";
    	else nulls[i++] = "Credits";
    	// Comprobar si hay algún campo inválido //
    	// Si lo hay sacar QMessageBox //
    	// Si no lo hay meter texto al QPlainTextEdit //
    	if(i!=0){
    		String campoBox = "Campos inválidos: ";
    		for(String c : nulls){
    			if(c!=null) campoBox += c + ",";
    		}
    		QMessageBox.critical(this,"Campos inválidos",campoBox);
    	}
    	else ((QPlainTextEdit)myNotepad.ui.tabWidget.currentWidget()).insertPlainText(res);	
    }
}
