from inspect import _void


class point:
    def __init__(self, name:str, unit_price:float, quantity_on_hand:int):
        self.name=name
        self.unit_price = unit_price
        self.quantity_on_hand = quantity_on_hand

    def getquan(self)->int:
        return self.quantity_on_hand

    def addquan(self,q1:int)->None:
        self.quantity_on_hand+=q1

q=point("45",4.5,6)
q.addquan(10)
print(q.getquan())

