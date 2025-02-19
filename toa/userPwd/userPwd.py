def authEvents(events):
    P = 131
    M = 10**9 + 7
    
    def hash_function(s):
        hash_value = 0
        power = 1
        for char in reversed(s):
            hash_value = (hash_value + ord(char) * power) % M
            power = (power * P) % M
        return hash_value
    
    results = []
    password_hash = None
    valid_hashes = set()
    
    for event in events:
        if event[0] == "setPassword":
            password = event[1]
            password_hash = hash_function(password)
            valid_hashes = {password_hash}
            for c in range(48, 58):  # '0'-'9'
                valid_hashes.add((password_hash * P + c) % M)
            for c in range(65, 91):  # 'A'-'Z'
                valid_hashes.add((password_hash * P + c) % M)
            for c in range(97, 123):  # 'a'-'z'
                valid_hashes.add((password_hash * P + c) % M)
        elif event[0] == "authorize":
            x = int(event[1])
            results.append(1 if x in valid_hashes else 0)
    
    return results