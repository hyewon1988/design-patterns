# -*- coding: utf-8 -*-
"""
Created on Tue Apr 17 23:33:01 2018

@author: HYEWON
"""

class Dog:
    def  __init__(self, name):
        self._name = name
        
    def speak(self):
        return "Woof!"
    
class Cat:
    def  __init__(self, name):
        self._name = name
        
    def speak(self):
        return "Meow!"
    
def get_pet(pet="dog"):
    
    """ The factory method"""
    pets = dict(dog=Dog("dog1"), cat=Cat("cat1"))
    
    return pets[pet]


d = get_pet("dog")

print(d.speak())

c = get_pet("cat")

print(c.speak())
