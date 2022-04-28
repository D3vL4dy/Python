class LeeJY:
    def __init__(self):
        self.money = 10
    def shout(self, angry):
        self.money += angry
    
class KimJU:
    def __init__(self):
        self.cnt_nuclear = 10
    def aoji(self):
        self.cnt_nuclear += 1

class LeeUC(LeeJY, KimJU):
    def __init__(self):
        LeeJY.__init__(self)
        KimJU.__init__(self)
    
ljy = LeeUC()
print(ljy.cnt_nuclear)
print(ljy.money)
ljy.shout(1)
ljy.aoji()
print(ljy.cnt_nuclear)
print(ljy.money)
