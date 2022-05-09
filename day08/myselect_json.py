'''
Created on 2022. 5. 9.

'''

import pymysql

conn = pymysql.connect (host='127.0.0.1', user='root', password='python', db='python', charset='utf8', port=3305)

#cursor는 java의 statement
#DictCursor : 사전 배열
curs = conn.cursor(pymysql.cursors.DictCursor)

sql = 'SELECT * FROM EMP'
curs.execute(sql)

rows = curs.fetchall()
print(rows)

curs.close()
conn.close()
