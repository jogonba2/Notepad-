package es.upv.etsinf.ipc;

import com.trolltech.qt.gui.*;
import java.awt.*;

import java.awt.Graphics;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.io.*;

import com.trolltech.qt.gui.QMessageBox.StandardButtons;
public class Notepad extends QMainWindow {

    Ui_Notepad ui = new Ui_Notepad();
    SearchDialog searchDialog = new SearchDialog();
    ReplaceDialog replaceDialog = new ReplaceDialog();
    boolean isCanceled = false;
    QMessageBox qms;

    public static void main(String[] args) {
        QApplication.initialize(args);
        Notepad testNotepad = new Notepad(null);
        testNotepad.show();

        QApplication.exec();
    }

    public Notepad() {
        ui.setupUi(this);
    }

    public Notepad(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        this.setWindowTitle("Notepad");
        this.setWindowIcon(new QIcon("classpath:es/upv/etsinf/ipc/icons/notepad.png"));
        setConnects();
    }
    
    private void setConnects(){
    	ui.newAction.triggered.connect(this,"newFile()");
    	ui.saveAction.triggered.connect(this,"saveFile()");
    	ui.openAction.triggered.connect(this,"openFile()");
    	ui.searchAction.triggered.connect(this,"searchDialog()");
    	ui.replaceAction.triggered.connect(this,"replaceDialog()");
    	ui.copyAction.triggered.connect(this,"copyText()");
    	ui.cutAction.triggered.connect(this,"cutText()");
    	ui.pasteAction.triggered.connect(this,"pasteText()");
    	ui.undoAction.triggered.connect(this,"undoAction()");
    	ui.redoAction.triggered.connect(this,"redoAction()");
    	ui.exitAction.triggered.connect(this,"exitAction()");
    	ui.infoAction.triggered.connect(this,"infoAction()");
    	ui.helpAction.triggered.connect(this,"helpAction()");
    	ui.htmlAction.triggered.connect(this,"htmlInterpreter()");
    	ui.plainTextAction.triggered.connect(this,"textPlainChange()");
    	ui.tabWidget.tabCloseRequested.connect(this,"closeFile(int)");
    	ui.printAction.triggered.connect(this,"printAction()");
    	ui.mayAction.triggered.connect(this,"mayAction()");
    	ui.minAction.triggered.connect(this,"minAction()");
    	ui.charAction.triggered.connect(this,"countCharacters()");
    	ui.wordAction.triggered.connect(this,"countWords()");
    	ui.lineAction.triggered.connect(this,"countLines()");
    	ui.origAction.triggered.connect(this,"changeOriginal()");
    	ui.underAction.triggered.connect(this,"changeUnder()");
    	ui.italAction.triggered.connect(this,"changeItal()");
    	ui.personAction.triggered.connect(this,"printPerson()");
    }
    
    private void printPerson(){
    	infoPersona infPerson = new infoPersona(null,this);
    	infPerson.show();
    }
    private void changeOriginal(){
    	QTextCursor auxCursor = ((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor();
    	if(auxCursor.hasSelection()){
    		String aux = auxCursor.selectedText();
    		auxCursor.removeSelectedText();
    		QTextCharFormat qtcf = new QTextCharFormat();
    		qtcf.setFontKerning(true);
    		auxCursor.insertText(aux,qtcf);  
    	}
    }
    
    private void changeUnder(){
    	QTextCursor auxCursor = ((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor();
    	if(auxCursor.hasSelection()){
    		String aux = auxCursor.selectedText();
    		auxCursor.removeSelectedText();
    		QTextCharFormat qtcf = new QTextCharFormat();
    		qtcf.setFontUnderline(true);
    		auxCursor.insertText(aux,qtcf);  
    	}
    }
    
    private void changeItal(){
    	QTextCursor auxCursor = ((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor();
    	if(auxCursor.hasSelection()){
    		String aux = auxCursor.selectedText();
    		auxCursor.removeSelectedText();
    		QTextCharFormat qtcf = new QTextCharFormat();
    		qtcf.setFontItalic(true);
    		auxCursor.insertText(aux,qtcf);  
    	}
    }
    
    private void mayAction(){
    	QTextCursor auxCursor = ((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor();
    	if(auxCursor.hasSelection()){
    		String toMay = auxCursor.selectedText().toUpperCase();
    		auxCursor.removeSelectedText();
    		auxCursor.insertText(toMay);    
    	}
    }
    
    private void minAction(){
    	QTextCursor auxCursor = ((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor();
    	if(auxCursor.hasSelection()){
    		String toMay = auxCursor.selectedText().toLowerCase();
    		auxCursor.removeSelectedText();
    		auxCursor.insertText(toMay);   
    	}
    }
    
    private void countCharacters(){
    	String auxText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	QMessageBox.about(this, "Caracteres", "Nº caracteres: "+auxText.length());
    	ui.statusbar.showMessage("Información mostrada correctamente",2000);
    }
    
    private void countWords(){
    	String auxText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	int numWords = (auxText.split(" ")).length;
    	int numLines = (auxText.split("\n")).length;
    	QMessageBox.about(this, "Palabras", "Nº palabras: "+(numWords+numLines-1));
    	ui.statusbar.showMessage("Información mostrada correctamente",2000);
    }
    
    private void countLines(){
    	String auxText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	int numLines = (auxText.split("\n")).length;
    	QMessageBox.about(this, "Lineas", "Nº lineas: "+numLines);
    	ui.statusbar.showMessage("Información mostrada correctamente",2000);
    }
    
    private void htmlInterpreter(){
    	String actText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).setPlainText("");
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).appendHtml(actText);
    }
    
    
    // Inicio Printer (No testeado -solo comprobado diálogos-)
    class PrintObject implements Printable {
    	private String message;
    	PrintObject(String message){ this.message = message; }
    	public int print(Graphics g,PageFormat f,int pageIndex){
			  if(pageIndex==0){
				  g.drawString(message,40,40);
				  return PAGE_EXISTS;
			  }else return NO_SUCH_PAGE;
			  }
	}

    private void printAction(){
    	PrinterJob pjob = PrinterJob.getPrinterJob();
    	pjob.setPrintable(new PrintObject(((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText()));
    	PageFormat pageFormat = new PageFormat();
    	pageFormat = pjob.pageDialog(pageFormat);
    	if(pjob.printDialog()){
    		try{
    			pjob.print();
    		}catch(PrinterException e){ QMessageBox.critical(this,"Error imprimiendo",e.getMessage()); }

    	}
    }
    // End Printer
    private void textPlainChange(){
    	String actText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).setPlainText("");
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).appendPlainText(actText);
    }
    
    private void newFile(){
    	int newIndex = ui.tabWidget.addTab(new QPlainTextEdit(),"Archivo nuevo");
    	ui.tabWidget.setCurrentIndex(newIndex);
    	ui.statusbar.showMessage("Archivo nuevo abierto correctamente",2000);
    }
    
    // Save hace función de guardar como
    private void saveFile(){
    	try{
    		String actText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    		QFileDialog qfd = new QFileDialog();
    		String nFile = null;
    		nFile = qfd.getSaveFileName();
    		PrintWriter pw = new PrintWriter(new File(nFile));
    		BufferedWriter bfw = new BufferedWriter(pw);
    		bfw.write(actText);
    		bfw.close();
    		ui.statusbar.showMessage("Archivo: " + nFile + " guardado correctamente",2000);
    		ui.tabWidget.setTabText(ui.tabWidget.currentIndex(),nFile.split("/")[(nFile.split("/").length-1)]);
    	}
    	catch(IOException e){ QMessageBox.critical(this,"Error Guardando","No ha sido seleccionado un nombre para guardar"); }
    }
    
    private void openFile(){
    	try{
    		QFileDialog qfd = new QFileDialog();
    		String nFile = qfd.getOpenFileName();
    		FileReader fd = new FileReader(new File(nFile));
    		BufferedReader bfd = new BufferedReader(fd);
    		String auxLine = "";
    		String textCharged = "";
    		while((auxLine = bfd.readLine()) != null){
    			textCharged += auxLine;
    		}
    		int newIndex = ui.tabWidget.addTab(new QPlainTextEdit(), nFile.split("/")[(nFile.split("/").length-1)]);
        	ui.tabWidget.setCurrentIndex(newIndex);
    		((QPlainTextEdit)ui.tabWidget.currentWidget()).appendPlainText(textCharged);
    		ui.statusbar.showMessage(nFile+" abierto correctamente",2000);
    	}catch(IOException e){ QMessageBox.critical(this,"Error Opening",e.getMessage()); }   	
    }
    
    private void closeFile(int e){
    	String actTab = ui.tabWidget.tabText(e);
    	if(actTab.equals("Archivo nuevo")){
    		QPushButton saveFile = new QPushButton("Guardar");
    		QPushButton withoutSave = new QPushButton("Cerrar sin guardar");
    		QPushButton cancelSave = new QPushButton("Cancelar");
    		qms = new QMessageBox();
    		qms.addButton(saveFile,QMessageBox.ButtonRole.AcceptRole);
    		qms.addButton(withoutSave,QMessageBox.ButtonRole.RejectRole);
    		qms.addButton(cancelSave,QMessageBox.ButtonRole.RejectRole);
    		qms.setWindowTitle("¿Guardar?");
    		qms.setText("El archivo no ha sido guardado, ¿guardar?");
    		saveFile.clicked.connect(this,"saveFile()");
    		cancelSave.clicked.connect(this,"closeMessage()");
    		withoutSave.clicked.connect(qms,"close()");
    		qms.exec();		
    	}
    	if(!isCanceled){
    		ui.tabWidget.removeTab(e);   
    		ui.statusbar.showMessage(actTab+" Cerrado correctamente",2000);
    	}
    	isCanceled = false;
    }
    
    private void closeMessage(){
    	isCanceled = true;
    	qms.close();
    }
    
    private void replaceDialog(){
    	replaceDialog.ui.replaceNext.clicked.connect(this,"replaceUnique()");
    	replaceDialog.ui.replaceAll.clicked.connect(this,"replaceAll()");
    	replaceDialog.ui.exitButton.clicked.connect(replaceDialog,"close()");
    	replaceDialog.show();
    }
    
    private void replaceUnique(){
       	String textToSearch = replaceDialog.ui.searchLineEdit.text();
       	String textToReplace = replaceDialog.ui.replaceLineEdit.text();
    	String actText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	actText = actText.replaceFirst(textToSearch,textToReplace);
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).setPlainText(actText);
    }
    
    private void replaceAll(){
       	String textToSearch = replaceDialog.ui.searchLineEdit.text();
       	String textToReplace = replaceDialog.ui.replaceLineEdit.text();
    	String actText = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	actText = actText.replaceAll(textToSearch,textToReplace);
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).setPlainText(actText);
    }
    
    private void searchDialog(){
        searchDialog.ui.nextButton.clicked.connect(this,"nextTerm()");
        searchDialog.ui.prevButton.clicked.connect(this,"prevTerm()");
        searchDialog.ui.exitButton.clicked.connect(searchDialog,"close()");
        searchDialog.show();
    }
    
    private void nextTerm(){
    	String textToSearch = searchDialog.ui.searchLineEdit.text();
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).find(textToSearch);
    }
    
    // Coge bien las apariciones anteriores, pero no posiciona correctamente el cursor
    private void prevTerm(){
    	String textToSearch = searchDialog.ui.searchLineEdit.text();
    	int actPosCursor = ((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor().position();
    	int lastIndex = 0;
    	System.out.println(actPosCursor);
    	int ant = 0;
    	int count = 0;
    	String text = ((QPlainTextEdit)ui.tabWidget.currentWidget()).toPlainText();
    	while(lastIndex<actPosCursor && lastIndex!=-1){
    		ant = lastIndex;
    		lastIndex = text.indexOf(textToSearch,lastIndex+1);
    		count++;
    	}
    	System.out.println(ant);
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor().setPosition(ant,QTextCursor.MoveMode.MoveAnchor);
   		//((QPlainTextEdit)ui.tabWidget.currentWidget()).textCursor().setPosition(ant-1);
    }
      
    private void undoAction(){
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).undo();
    	ui.statusbar.showMessage("Deshecho correctamente",2000);
    }
    
    private void redoAction(){
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).redo();
    	ui.statusbar.showMessage("Rehecho correctamente",2000);
    }
    
    private void pasteText(){
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).paste();
    	ui.statusbar.showMessage("Pegado correctamente",2000);
    }
    
    private void copyText(){
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).copy();
    	ui.statusbar.showMessage("Copiado correctamente",2000);
    }
    
    private void cutText(){
    	((QPlainTextEdit)ui.tabWidget.currentWidget()).cut();
    	ui.statusbar.showMessage("Cortado correctamente",2000);
    }
    
    private void exitAction(){
    	System.exit(0);
    }
    
    private void infoAction(){
    	String boxContent = "Notepad para IPC (práctica 2)";
    	QMessageBox.about(this, "Información", boxContent);
    	ui.statusbar.showMessage("Información mostrada correctamente",2000);
    }
    
    private void helpAction(){
    	// Abrir un nuevo diálogo explicando las acciones, de momento QMessageBox
    	QMessageBox.about(this,"Ayuda","F1 : Ayuda\nCtrl+A : Abrir archivo\n...");
    	ui.statusbar.showMessage("Ayuda mostrada correctamente",2000);
    }
}

