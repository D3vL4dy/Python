'''
Created on 2022. 5. 9.

'''

import pymysql

conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python', port=3305, charset='utf8')
 
cur = conn.cursor(pymysql.cursors.DictCursor)
 
sql = """insert into emp(e_id,e_name,sex,addr) 
            values(%s,%s,%s,%s)"""
            
cnt = cur.execute(sql,('5','5','5','5'))

print("cnt", cnt)

conn.commit() 
 
cur.close();
conn.close()

