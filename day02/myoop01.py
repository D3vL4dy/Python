class Animal:
    def __init__(self):
        self.age = 0
    def getOld(self):
        self.age += 1
        
class Human(Animal):
    def __init__(self):
        super().__init__()
        self.skill_lang = 0
    def momstouch(self, stroke):
        self.skill_lang += stroke

if __name__ == '__main__':
    hum = Human()
    print("myoop01", hum.skill_lang)
    print("myoop01", hum.age)
    hum.getOld()
    hum.momstouch(10000)
    print("myoop01", hum.skill_lang) 
    print("myoop01", hum.age)