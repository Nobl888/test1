1. Scrapy: All the files share the Scrapy library as a dependency. Scrapy is used for creating the web scraper and handling the HTTP requests and responses.

2. CryptonewsItem: This is a data schema defined in "items.py" and used in "cryptonews_spider.py" to structure the scraped data.

3. JsonExportPipeline: This is a pipeline defined in "pipelines.py" and used in "cryptonews_spider.py" and "settings.py" to handle the storage of scraped data in JSON format.

4. Settings: The settings defined in "settings.py" are shared across "cryptonews_spider.py", "pipelines.py", and "middlewares.py" to configure the behavior of the Scrapy spider.

5. Middlewares: The middlewares defined in "middlewares.py" are used in "settings.py" and "cryptonews_spider.py" to handle the requests and responses.

6. CryptonewsSpider: This is the main spider class defined in "cryptonews_spider.py" and used in "run.py" to start the scraping process.

7. DOM Elements: The id names of DOM elements used in "cryptonews_spider.py" to identify the data to be scraped from the website.

8. start_requests, parse, parse_page: These are function names used in "cryptonews_spider.py" for sending HTTP requests and handling the responses.

9. run.py: This file uses the CryptonewsSpider class from "cryptonews_spider.py" to start the scraping process.