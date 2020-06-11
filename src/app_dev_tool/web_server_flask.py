#!/usr/bin/python
import subprocess

from flask import Flask, request

app = Flask("my_app1")

@app.route("/natbag")
def natbag2020():
    return subprocess.check_output(["java", "-classpath", "/home/liron/workspace/g1/bin", "NatbagMain", request.args.get('outFormat')])

app.run(port=8000, host="0.0.0.0")