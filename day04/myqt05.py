#ui를 파이썬에 불러오기
#버튼을 눌렀을 때 구구단

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5 import uic

#UI파일 연결
form_class = uic.loadUiType("myqt05.ui")[0]

#화면을 띄우는데 사용되는 Class 선언
class MainClass(QMainWindow, form_class) :
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show();
        
    def myclick(self):
        a = self.le.text()
        num = int(a)
        result = ""
        # result += "{}*{}={}\n".format(num, 1, 1*num)
        # result += "{}*{}={}\n".format(num, 2, 2*num)
        # result += "{}*{}={}\n".format(num, 3, 3*num)
        # result += "{}*{}={}\n".format(num, 4, 4*num)
        # result += "{}*{}={}\n".format(num, 5, 5*num)
        # result += "{}*{}={}\n".format(num, 6, 6*num)
        # result += "{}*{}={}\n".format(num, 7, 7*num)
        # result += "{}*{}={}\n".format(num, 8, 8*num)
        # result += "{}*{}={}\n".format(num, 9, 9*num)
        
        for i in range(1, 9+1):
            result += str(num) + "*" + str(i) + "=" + str(num*i)
            # result += "{} * {} = {}".format(num,i, num*i)+"\n"
            print(result)
        
        self.te.setText(result)
        
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    
    
