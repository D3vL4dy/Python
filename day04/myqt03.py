#ui를 파이썬에 불러오기
#버튼을 눌렀을 때 두 숫자 더하기

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5 import uic

#UI파일 연결
form_class = uic.loadUiType("myqt03.ui")[0]

#화면을 띄우는데 사용되는 Class 선언
class MainClass(QMainWindow, form_class) :
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show();
        
    def myclick(self):
        a = self.le1.text()
        aa = int(a) 
        b = self.le2.text()
        bb = int(b)
        # print(aa, bb)
        self.le3.setText(str(aa + bb))
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    
    
