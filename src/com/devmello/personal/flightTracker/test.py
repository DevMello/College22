import requests

params = {
    'access_key': '#####',
    'airline_name': 'Southwest Airlines',
    'flight_number': '2146',
}

api_result = requests.get('http://api.aviationstack.com/v1/flights', params)

api_response = api_result.json()
print(api_response)

for flight in api_response['data']:
    if flight['live'] is None:
        print(u'%s flight %s from %s (%s) to %s (%s) is in the air.' % (
            flight['airline']['name'],
            flight['flight']['iata'],
            flight['departure']['airport'],
            flight['departure']['iata'],
            flight['arrival']['airport'],
            flight['arrival']['iata']))