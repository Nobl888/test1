```python
import scrapy

class CryptonewsItem(scrapy.Item):
    # define the fields for your item here like:
    title = scrapy.Field()
    link = scrapy.Field()
    date = scrapy.Field()
    content = scrapy.Field()
```