# 네이버 검색 API예제는 블로그를 비롯 전문자료까지 호출방법이 동일하므로 blog검색만 대표로 예제를 올렸습니다.
# 네이버 검색 Open API 예제 - 블로그 검색
import os
import sys
import urllib.request
import json

from day12.dao_blog import DaoBlog

blog = DaoBlog()

client_id = "aRSCUwSHcrCv1a7ZKwPn"
client_secret = "b21nx5tenz"
encText = urllib.parse.quote("오류동맛집")
url = "https://openapi.naver.com/v1/search/blog?query=" + encText # json 결과
request = urllib.request.Request(url)
request.add_header("X-Naver-Client-Id",client_id)
request.add_header("X-Naver-Client-Secret",client_secret)
response = urllib.request.urlopen(request)
rescode = response.getcode()
response_body = response.read()
text = response_body.decode('utf-8')

jsonObject = json.loads(text)
jsonArray = jsonObject.get("items")

for list in jsonArray:
    title = list.get("title")
    link = list.get("link")
    description = list.get("description")
    bloggername = list.get("bloggername")
    bloggerlink = list.get("bloggerlink")
    postdate = list.get("postdate")
    
    cnt = blog.myinsert(title,link,description,bloggername,bloggerlink,postdate)
    print("cnt",cnt)