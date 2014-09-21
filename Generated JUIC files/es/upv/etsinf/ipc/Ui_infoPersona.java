/********************************************************************************
** Form generated from reading ui file 'infoPersona.jui'
**
** Created: mié 30. abr 22:58:33 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package es.upv.etsinf.ipc;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_infoPersona implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget widget;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QSpacerItem horizontalSpacer_2;
    public QLineEdit nameLineEdit;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_2;
    public QSpacerItem horizontalSpacer_3;
    public QLineEdit mailLineEdit;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_3;
    public QSpacerItem horizontalSpacer_7;
    public QDateEdit birthDateEdit;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_4;
    public QSpacerItem horizontalSpacer_4;
    public QComboBox sexComboBox;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_5;
    public QSpacerItem horizontalSpacer_5;
    public QComboBox gradeComboBox;
    public QHBoxLayout horizontalLayout_6;
    public QLabel label_6;
    public QSpacerItem horizontalSpacer_6;
    public QSpinBox creditsSpinBox;
    public QWidget widget1;
    public QHBoxLayout horizontalLayout_7;
    public QPushButton okButton;
    public QPushButton closeButton;

    public Ui_infoPersona() { super(); }

    public void setupUi(QWidget infoPersona)
    {
        infoPersona.setObjectName("infoPersona");
        infoPersona.resize(new QSize(446, 238).expandedTo(infoPersona.minimumSizeHint()));
        widget = new QWidget(infoPersona);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(0, 0, 440, 181));
        verticalLayout = new QVBoxLayout(widget);
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        horizontalSpacer_2 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout.addItem(horizontalSpacer_2);

        nameLineEdit = new QLineEdit(widget);
        nameLineEdit.setObjectName("nameLineEdit");

        horizontalLayout.addWidget(nameLineEdit);


        verticalLayout.addLayout(horizontalLayout);

        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");

        horizontalLayout_2.addWidget(label_2);

        horizontalSpacer_3 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer_3);

        mailLineEdit = new QLineEdit(widget);
        mailLineEdit.setObjectName("mailLineEdit");

        horizontalLayout_2.addWidget(mailLineEdit);


        verticalLayout.addLayout(horizontalLayout_2);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_3 = new QLabel(widget);
        label_3.setObjectName("label_3");

        horizontalLayout_3.addWidget(label_3);

        horizontalSpacer_7 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_3.addItem(horizontalSpacer_7);

        birthDateEdit = new QDateEdit(widget);
        birthDateEdit.setObjectName("birthDateEdit");

        horizontalLayout_3.addWidget(birthDateEdit);


        verticalLayout.addLayout(horizontalLayout_3);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_4 = new QLabel(widget);
        label_4.setObjectName("label_4");

        horizontalLayout_4.addWidget(label_4);

        horizontalSpacer_4 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_4.addItem(horizontalSpacer_4);

        sexComboBox = new QComboBox(widget);
        sexComboBox.setObjectName("sexComboBox");

        horizontalLayout_4.addWidget(sexComboBox);


        verticalLayout.addLayout(horizontalLayout_4);

        horizontalLayout_5 = new QHBoxLayout();
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_5 = new QLabel(widget);
        label_5.setObjectName("label_5");

        horizontalLayout_5.addWidget(label_5);

        horizontalSpacer_5 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_5.addItem(horizontalSpacer_5);

        gradeComboBox = new QComboBox(widget);
        gradeComboBox.setObjectName("gradeComboBox");

        horizontalLayout_5.addWidget(gradeComboBox);


        verticalLayout.addLayout(horizontalLayout_5);

        horizontalLayout_6 = new QHBoxLayout();
        horizontalLayout_6.setObjectName("horizontalLayout_6");
        label_6 = new QLabel(widget);
        label_6.setObjectName("label_6");

        horizontalLayout_6.addWidget(label_6);

        horizontalSpacer_6 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_6.addItem(horizontalSpacer_6);

        creditsSpinBox = new QSpinBox(widget);
        creditsSpinBox.setObjectName("creditsSpinBox");

        horizontalLayout_6.addWidget(creditsSpinBox);


        verticalLayout.addLayout(horizontalLayout_6);

        widget1 = new QWidget(infoPersona);
        widget1.setObjectName("widget1");
        widget1.setGeometry(new QRect(280, 194, 158, 41));
        horizontalLayout_7 = new QHBoxLayout(widget1);
        horizontalLayout_7.setObjectName("horizontalLayout_7");
        okButton = new QPushButton(widget1);
        okButton.setObjectName("okButton");

        horizontalLayout_7.addWidget(okButton);

        closeButton = new QPushButton(widget1);
        closeButton.setObjectName("closeButton");

        horizontalLayout_7.addWidget(closeButton);

        retranslateUi(infoPersona);

        infoPersona.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget infoPersona)
    {
        infoPersona.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Name", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Email", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Birthday", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Sex", null));
        sexComboBox.clear();
        sexComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Male", null));
        sexComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Female", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Grade", null));
        gradeComboBox.clear();
        gradeComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "1st", null));
        gradeComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "2nd", null));
        gradeComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "3rd", null));
        gradeComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "4th", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Credits", null));
        okButton.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "OK", null));
        closeButton.setText(com.trolltech.qt.core.QCoreApplication.translate("infoPersona", "Close", null));
    } // retranslateUi

}

