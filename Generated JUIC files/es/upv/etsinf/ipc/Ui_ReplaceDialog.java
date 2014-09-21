/********************************************************************************
** Form generated from reading ui file 'ReplaceDialog.jui'
**
** Created: mar 8. abr 09:15:04 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package es.upv.etsinf.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_ReplaceDialog implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget layoutWidget;
    public QHBoxLayout horizontalLayout;
    public QPushButton replaceNext;
    public QPushButton replaceAll;
    public QPushButton exitButton;
    public QWidget layoutWidget1;
    public QVBoxLayout verticalLayout;
    public QLineEdit searchLineEdit;
    public QLineEdit replaceLineEdit;

    public Ui_ReplaceDialog() { super(); }

    public void setupUi(QWidget ReplaceDialog)
    {
        ReplaceDialog.setObjectName("ReplaceDialog");
        ReplaceDialog.resize(new QSize(489, 126).expandedTo(ReplaceDialog.minimumSizeHint()));
        ReplaceDialog.setWindowIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/replace.png")));
        layoutWidget = new QWidget(ReplaceDialog);
        layoutWidget.setObjectName("layoutWidget");
        layoutWidget.setGeometry(new QRect(100, 80, 289, 51));
        horizontalLayout = new QHBoxLayout(layoutWidget);
        horizontalLayout.setObjectName("horizontalLayout");
        replaceNext = new QPushButton(layoutWidget);
        replaceNext.setObjectName("replaceNext");
        replaceNext.setIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/next.png")));

        horizontalLayout.addWidget(replaceNext);

        replaceAll = new QPushButton(layoutWidget);
        replaceAll.setObjectName("replaceAll");
        replaceAll.setIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/all.png")));

        horizontalLayout.addWidget(replaceAll);

        exitButton = new QPushButton(layoutWidget);
        exitButton.setObjectName("exitButton");
        exitButton.setIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/cancel.png")));

        horizontalLayout.addWidget(exitButton);

        layoutWidget1 = new QWidget(ReplaceDialog);
        layoutWidget1.setObjectName("layoutWidget1");
        layoutWidget1.setGeometry(new QRect(121, 1, 251, 71));
        verticalLayout = new QVBoxLayout(layoutWidget1);
        verticalLayout.setObjectName("verticalLayout");
        searchLineEdit = new QLineEdit(layoutWidget1);
        searchLineEdit.setObjectName("searchLineEdit");

        verticalLayout.addWidget(searchLineEdit);

        replaceLineEdit = new QLineEdit(layoutWidget1);
        replaceLineEdit.setObjectName("replaceLineEdit");

        verticalLayout.addWidget(replaceLineEdit);

        retranslateUi(ReplaceDialog);

        ReplaceDialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget ReplaceDialog)
    {
        ReplaceDialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("ReplaceDialog", "Reemplazar", null));
        replaceNext.setText(com.trolltech.qt.core.QCoreApplication.translate("ReplaceDialog", "Siguiente", null));
        replaceAll.setText(com.trolltech.qt.core.QCoreApplication.translate("ReplaceDialog", "Todos", null));
        exitButton.setText(com.trolltech.qt.core.QCoreApplication.translate("ReplaceDialog", "Cerrar", null));
        searchLineEdit.setText(com.trolltech.qt.core.QCoreApplication.translate("ReplaceDialog", "B\u00fasqueda...", null));
        replaceLineEdit.setText(com.trolltech.qt.core.QCoreApplication.translate("ReplaceDialog", "Reemplazo...", null));
    } // retranslateUi

}

