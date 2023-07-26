```python
import scrapy
from cryptonews_scraper.items import CryptonewsItem

class CryptonewsSpider(scrapy.Spider):
    name = "cryptonews"
    allowed_domains = ["cryptonews.net"]
    start_urls = ["https://cryptonews.net/"]

    def parse(self, response):
        for article in response.css('div.cn-tile.article'):
            item = CryptonewsItem()
            item['title'] = article.css('h5 a::text').get()
            item['url'] = article.css('h5 a::attr(href)').get()
            item['date'] = article.css('span.date::text').get()
            yield item

        next_page = response.css('a.next::attr(href)').get()
        if next_page is not None:
            yield response.follow(next_page, self.parse)
```