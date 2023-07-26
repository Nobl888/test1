```python
from scrapy.crawler import CrawlerProcess
from cryptonews_scraper.spiders.cryptonews_spider import CryptonewsSpider

def run_spider():
    process = CrawlerProcess(settings={
        'FEED_FORMAT': 'json',
        'FEED_URI': 'result.json'
    })

    process.crawl(CryptonewsSpider)
    process.start()

if __name__ == "__main__":
    run_spider()
```