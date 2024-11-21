C = 21  # Number of consonants
V = 5   # Number of vowels

#MAX_VOWELS = 0 # Remove this line
#res = 0 # Remove this line

def get_num_of_unique_words(word_len, max_vowels):
    global res # Declare res as global
    res = 0  # Initialize res to 0 here
    #MAX_VOWELS = max_vowels # Remove this line
    word = [C] * word_len  # Use 21 for consonants by default
    backtrack(word, 0, max_vowels, max_vowels)  # Pass max_vowels to backtrack
    return res

def backtrack(word, index, max_vowels_allowed, max_vowels):
    global res  # Access the global res
    # If the word is complete, calculate the product and add to the result
    if index == len(word):
        count = 1
        for num in word:
            count *= num
        res += count
        return

    # If there are no more vowel credits, continue with consonants
    if max_vowels_allowed == 0:
        backtrack(word, index + 1, max_vowels, max_vowels) # Use original max_vowels
        return

    # Option 1: Select a vowel at this position
    word[index] = V
    backtrack(word, index + 1, max_vowels_allowed - 1, max_vowels)  # Decrease vowel credits
    word[index] = C  # Reset the choice

    # Option 2: Leave as consonant
    backtrack(word, index + 1, max_vowels_allowed, max_vowels)

wordLen = 21
maxVow = 5



ans = get_num_of_unique_words(wordLen, maxVow)

print(ans)
