'''
Created on 2022. 5. 9.

'''

import pymysql

conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python', port=3305, charset='utf8')
 
curs = conn.cursor(pymysql.cursors.DictCursor)
e_id = "5"
e_name = "6"
sex = "6"
addr = "6"

#f-string 포맷 (%s 대신)
sql = f"""
        update emp 
        set e_name='{e_name}', sex='{sex}', addr='{addr}'
        where e_id='{e_id}'
    """

cnt = curs.execute(sql)

print("cnt", cnt)

conn.commit() 
 
curs.close();
conn.close()