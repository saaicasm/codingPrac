def tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest):
    total = 0
    if fastest == True:
        redShirtSpeeds.sort()
        blueShirtSpeeds.sort(reverse=True)
        for i in range(len(redShirtSpeeds)):
            total += max(blueShirtSpeeds[i], redShirtSpeeds[i])
    else:
        redShirtSpeeds.sort()
        blueShirtSpeeds.sort()
        for i in range(len(redShirtSpeeds)):
            total += max(blueShirtSpeeds[i], redShirtSpeeds[i])
    return total