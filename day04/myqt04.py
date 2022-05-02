#ui를 파이썬에 불러오기
#버튼을 눌렀을 때 가위바위보

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5 import uic
from random import random

#UI파일 연결
form_class = uic.loadUiType("myqt04.ui")[0]

#화면을 띄우는데 사용되는 Class 선언
class MainClass(QMainWindow, form_class) :
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show();
        
    def myclick(self):
        a = self.le_mine.text()
        print(a)
        
        rnd = random() * 3
        if rnd == 0:
            self.le_com.setText("가위")
        elif rnd == 1:
            self.le_com.setText("바위")
        else:
            self.le_com.setText("보")
            
        b = self.le_com.text() 
        
        if (a == "가위" and b == "보") or (a == "바위" and b == "가위") or (a == "보" and b == "바위"):
            self.le_result.setText("이겼습니다.")
        elif (a == "가위" and b == "바위") or (a == "바위" and b == "보") or (a == "보" and b == "가위"):
            self.le_result.setText("졌습니다.")  
        else:
            self.le_result.setText("비겼습니다.")   
        
        

if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    
    
