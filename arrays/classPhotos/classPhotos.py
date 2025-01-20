def classPhotos(redShirtHeights, blueShirtHeights):
    redShirtHeights.sort()
    blueShirtHeights.sort()

    if (redShirtHeights[0] > blueShirtHeights[0]):
        for i in range (len(redShirtHeights)):
            if blueShirtHeights[i] >= redShirtHeights[i]:
                return False
    else:
        for i in range (len(redShirtHeights)):
            if redShirtHeights[i] >= blueShirtHeights[i]:
                return False
    
    return True