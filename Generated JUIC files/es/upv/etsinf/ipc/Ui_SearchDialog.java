/********************************************************************************
** Form generated from reading ui file 'SearchDialog.jui'
**
** Created: dom 6. abr 16:57:26 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package es.upv.etsinf.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_SearchDialog implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget layoutWidget;
    public QVBoxLayout verticalLayout;
    public QLineEdit searchLineEdit;
    public QHBoxLayout horizontalLayout;
    public QPushButton prevButton;
    public QPushButton nextButton;
    public QPushButton exitButton;

    public Ui_SearchDialog() { super(); }

    public void setupUi(QWidget SearchDialog)
    {
        SearchDialog.setObjectName("SearchDialog");
        SearchDialog.resize(new QSize(500, 150).expandedTo(SearchDialog.minimumSizeHint()));
        SearchDialog.setMaximumSize(new QSize(500, 200));
        SearchDialog.setWindowIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/find.png")));
        layoutWidget = new QWidget(SearchDialog);
        layoutWidget.setObjectName("layoutWidget");
        layoutWidget.setGeometry(new QRect(90, 20, 331, 131));
        verticalLayout = new QVBoxLayout(layoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        searchLineEdit = new QLineEdit(layoutWidget);
        searchLineEdit.setObjectName("searchLineEdit");

        verticalLayout.addWidget(searchLineEdit);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setSpacing(6);
        horizontalLayout.setObjectName("horizontalLayout");
        prevButton = new QPushButton(layoutWidget);
        prevButton.setObjectName("prevButton");
        prevButton.setIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/prev.png")));
        horizontalLayout.addWidget(prevButton);

        nextButton = new QPushButton(layoutWidget);
        nextButton.setObjectName("nextButton");
        nextButton.setIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/next.png")));

        horizontalLayout.addWidget(nextButton);

        exitButton = new QPushButton(layoutWidget);
        exitButton.setObjectName("exitButton");
        exitButton.setIcon(new QIcon(new QPixmap("classpath:es/upv/etsinf/ipc/icons/cancel.png")));

        horizontalLayout.addWidget(exitButton);


        verticalLayout.addLayout(horizontalLayout);

        retranslateUi(SearchDialog);

        SearchDialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget SearchDialog)
    {
        SearchDialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("SearchDialog", "Buscar", null));
        searchLineEdit.setText(com.trolltech.qt.core.QCoreApplication.translate("SearchDialog", "B\u00fasqueda...", null));
        prevButton.setText(com.trolltech.qt.core.QCoreApplication.translate("SearchDialog", "Anterior", null));
        nextButton.setText(com.trolltech.qt.core.QCoreApplication.translate("SearchDialog", "Siguiente", null));
        exitButton.setText(com.trolltech.qt.core.QCoreApplication.translate("SearchDialog", "Cerrar", null));
    } // retranslateUi

}

