# -*- coding: utf-8 -*-
"""
Created on Fri Nov  6 07:12:33 2020

@author: Milon
"""


import requests
# result=requests.get("https://coderbyte.com/api/challenges/json/counting/")
result={'data': 'key=ddsdfgdf, age=54, key=gdfg, age=45, key=qwer, age=24, key=ipio, age=29, key=ljkjk, age=39, key=ljkjk, age=41, key=ljkjk, age=22'
        }
print(result)

res_data=result["data"].split(", ")
count=0

for data in res_data:
    split_data=data.split("=")
    if split_data[0]=='age' and int(split_data[1])>30:
        count+=1;
        
        
print(count)