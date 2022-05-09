'''
Created on 2022. 5. 6.

'''

import pymysql

conn = pymysql.connect (host='127.0.0.1', user='root', password='python', db='python', charset='utf8', port=3305)

#cursor는 java의 statement
curs = conn.cursor()

sql = 'SELECT * FROM EMP'
curs.execute(sql)

rows = curs.fetchall()
print(rows)

for row in rows:
    print(row[0],row[1],row[2],row[3])

curs.close()
conn.close()
