'''
Created on 2022. 5. 9.

'''

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello Python'

if __name__ == '__main__':
    app.run(debug=True)