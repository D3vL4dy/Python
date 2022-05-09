'''
Created on 2022. 5. 9.

'''

import pymysql

conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python', port=3305, charset='utf8')
 
curs = conn.cursor(pymysql.cursors.DictCursor)
e_id = "5"

#f-string 포맷 (%s 대신)
sql = f""" delete from emp where e_id='{e_id}' """ 

cnt = curs.execute(sql)

print("cnt", cnt)

conn.commit() 
 
curs.close();
conn.close()