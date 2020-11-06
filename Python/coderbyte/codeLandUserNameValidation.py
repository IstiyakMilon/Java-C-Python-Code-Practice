# -*- coding: utf-8 -*-
"""
Created on Tue Nov  3 21:00:59 2020

@author: Milon
"""
import re

# def isXGreaterThanY(x, y):
    # return (x > y)


# print(isXGreaterThanY(10, 1))
    
import re
def CodelandUsernameValidation(strParam):

  # code goes here
  
  if len(strParam)>4 or len(strParam)<25:
    if not re.match('/[a-z]/i', strParam[0]):
        return 'false'
    elif not re.match('/^[0-9a-zA-Z_]+$/', strParam):
        return 'false'
    elif strParam[len(strParam)-1]=='_':
        return 'false'
    return 'true'
  

# keep this function call here 
print(CodelandUsernameValidation(input()))