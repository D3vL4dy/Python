#ui를 파이썬에 불러오기
#버튼을 눌렀을 때 별찍기

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5 import uic

#UI파일 연결
form_class = uic.loadUiType("myqt07.ui")[0]

#화면을 띄우는데 사용되는 Class 선언
class MainClass(QMainWindow, form_class) :
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show();
        
    def myclick(self):
        a = self.le_first.text()
        b = self.le_last.text()
        aa = int(a)
        bb = int(b)
        txt = ""
        for i in range(aa, bb+1):
            txt += self.drawStar(i)
        
        self.te.setText(txt)
        
    def drawStar(self, cnt):
        ret = ""
        for i in range(cnt):
            ret += "*"
        ret += "\n"
        return ret

if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    
    
