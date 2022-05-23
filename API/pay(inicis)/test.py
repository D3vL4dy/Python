from flask import Flask
from flask.templating import render_template
from day10 import dao_emp
from flask_cors.extension import CORS

app = Flask(__name__)
CORS(app)

de = dao_emp.DaoEmp()
@app.route("/test")
def emp():
    return render_template('test.html')




if __name__ == '__main__':
    app.run(debug=True, host="0.0.0.0")