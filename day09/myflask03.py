'''
Created on 2022. 5. 9.

'''

from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return render_template("forward.html")

if __name__ == '__main__':
    app.run(debug=True)