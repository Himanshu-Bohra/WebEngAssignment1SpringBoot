# WebEngAssignment1SpringBoot
Assignment 1 Web Eng

This program allows the user to get a JSON file for the Picture of the day endpoint from nasa on the local server (port 8080)

Following are the methods and parameters and their utility descriptions:
GET: https://api.nasa.gov/planetary/apod : 	Returns the Astronomy Picture of the Day for a given date.

api_key: String: This is just the unique API key from NASA, unique for this program.

date: String: This is the date of the picture in YYYY-MM-DD format. The default is current date.

## Way to use:
You can just use the curl command to use it:
curl https://api.nasa.gov/planetary/apod?api_key=(use your key)&date=(currentDate)
