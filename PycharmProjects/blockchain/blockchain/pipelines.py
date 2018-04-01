# -*- coding: utf-8 -*-

# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://doc.scrapy.org/en/latest/topics/item-pipeline.html
import csv
import codecs
class BlockchainPipeline(object):
    def process_item(self, item, spider):
        str = item['area']
        if str == None:
            str = 'Unknown'
        else:

            str = str.strip().strip('"')
        str.encode('utf-8')
        str1 = item['name']
        if str1 == None:
            str1 = 'Unknown'
        else:

            str1 = str1.strip().strip('"')
        str1.encode('utf-8')
        with open('result.csv','a',encoding='utf-8',newline='') as rs:
            writer = csv.writer(rs,delimiter = ';')
            result = [str1,item['userID'].lstrip('/'),str]
            writer.writerow(result)
