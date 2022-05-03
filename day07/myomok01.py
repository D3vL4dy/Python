#ui를 파이썬에 불러오기
#오목게임

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel
from PyQt5 import uic
from PyQt5.QtGui import QPixmap

#UI파일 연결
form_class = uic.loadUiType("myomok01.ui")[0]

#화면을 띄우는데 사용되는 Class 선언
class MainClass(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setWindowTitle("GUI")
        
        self.pixmap = QPixmap('0.png')
        
        for i in range(10):
            self.label = QLabel(self)
            self.label.setPixmap(self.pixmap)
            self.label.resize(self.pixmap.width(), self.pixmap.height())
            self.show()
            
        

if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()
    