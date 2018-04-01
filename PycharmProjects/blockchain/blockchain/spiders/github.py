# -*- coding: utf-8 -*-
import scrapy
from blockchain.items import BlockchainItem

class GithubSpider(scrapy.Spider):
    name = 'github'
    allowed_domains = ['github.com']
    template1 = 'https://github.com/search?o=desc&p='
    template2 = '&q=blockchain&s=followers&type=Users&utf8=%E2%9C%93'
    start_urls = []
    for num in [10,20,30,31,41,60,61,71,81,82,92,93]:
        url = template1 + str(num)+template2
        start_urls.append(url)


    def parse(self, response):
        project = response.xpath('//div[@class="user-list-info ml-2"]')
        for each_user in project:
            item = BlockchainItem()
            item['userID'] = each_user.xpath('./a/@href').extract()[0]
            #item['name'] = each_user.xpath('./span/text()').extract()[0]
            #item['area'] = each_user.xpath('./ul/li/text()').extract()[1]
            list = each_user.xpath('./span/text()').extract()
            if len(list)>0:
                item['name'] = list[0]
            else:
                item['name'] = None
            list = each_user.xpath('./ul/li/text()').extract()
            if len(list)>0:
                item['area'] = list[1]
            else:
                item['area'] = None
            yield item