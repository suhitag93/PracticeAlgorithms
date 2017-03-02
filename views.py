from django.shortcuts import render

import csv

try:
    import json
except ImportError:
    import simplejson as json

# Import the necessary methods from "twitter" library
#from twitter import Twitter, OAuth, TwitterHTTPError, TwitterStream

import csv
import tweepy

# Create your views here.
from django.http import HttpResponse

def index(request):
	return HttpResponse("<h2>HEY!</h2>")

def print_stuff(request):

	Access_token = "1656072950-RJFyIBI8JQRKH8DwrdB66TfjibaRV0uds3X62kP"
	Access_secret = "scPMTHO0YMFcxTDuvgJYERC5SmDLJuSfjlnxbKVsiv5TN"
	Consumer_key = "1lJ9ioOr10ZoFzu8iGhFqDIQb"
	Consumer_secret = "PFwG0WSpl5V4EiwwxbLoVMIKcq40pujLIvDGaMd5Cva32opLwf"

	auth = tweepy.OAuthHandler(Consumer_key, Consumer_secret)
	auth.set_access_token(Access_token, Access_secret)
	api = tweepy.API(auth)
	with
	public_tweets = api.trends_place(1)			#2459115
	for tweet in public_tweets:
		print(tweet['trends'])


	return HttpResponse("Hi")
