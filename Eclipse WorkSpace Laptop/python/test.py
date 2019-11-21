'''
Created on 20 Nov 2019

@author: rasmu
'''


class Album(object):
    genre = 'Progressive metal' #Shared by all instances
   
   
    

    def __init__(self, artist, album):
        self.artist = artist
        self.album = album
        
        