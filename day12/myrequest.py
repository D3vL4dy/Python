from bs4 import BeautifulSoup
import requests

url = "http://127.0.0.1:5000/list"
html = requests.get(url)

soup = BeautifulSoup(html.text, 'html.parser')
print(soup)


