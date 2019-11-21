from tkinter import *
from test import Album
'''
Created on 20 Nov 2019

@author: rasmu
'''



if __name__ == '__main__':
    a1 = Album('Riverside','Wasteland')
    a1.album = 'High Definition Anno Domini'
    print('Album: ' + a1.album + '\nArtist: ' + a1.artist)
    