const fetch = require('node-fetch');
fetch("https://pms-scusd-ca.schoolloop.com/portal/login?etarget=login_form", {
    "headers": {
        "accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
        "accept-language": "en-US,en;q=0.9",
        "cache-control": "max-age=0",
        "content-type": "application/x-www-form-urlencoded",
        "sec-ch-ua": "\" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"",
        "sec-ch-ua-mobile": "?0",
        "sec-ch-ua-platform": "\"Windows\"",
        "sec-fetch-dest": "document",
        "sec-fetch-mode": "navigate",
        "sec-fetch-site": "same-origin",
        "sec-fetch-user": "?1",
        "upgrade-insecure-requests": "1",
        "cookie": "G_ENABLED_IDPS=google; slid=1651714459185; JSESSIONID=1wgxeod78fuyriakcjt005o83; __cfruid=aa56afac86d73a9f0ff5ad0e4fceda88f76701a4-1656641536",
        "Referer": "https://pms-scusd-ca.schoolloop.com/portal/login",
        "Referrer-Policy": "strict-origin-when-cross-origin"
    },
    "body": "login_name={py2019}&password=&redirect=&forward=&login_form_reverse=&form_data_id=40468131051109014&sort=&reverse=&login_form_sort=&event_override=login&login_form_filter=&login_form_letter=&return_url=&login_form_page_index=&login_form_page_item_count=",
    "method": "POST"
}).then(res => console.log(res));