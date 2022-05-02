#ui를 파이썬에 불러오기
#버튼을 눌렀을 때 로또 생성하기

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5 import uic

#UI파일 연결
form_class = uic.loadUiType("myqt06.ui")[0]

#화면을 띄우는데 사용되는 Class 선언
class MainClass(QMainWindow, form_class) :
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show();
        
    def myclick(self):
        arr45 = []
        for i in range(1, 45+1):
            arr45[]

if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    
    
