import json
import os

read_dir = os.path.join(os.getcwd(), 'configuration')
with open(read_dir, 'r') as load_json:
    load_dict = json.load(load_json)
    print(load_dict["two"]["epochs"])