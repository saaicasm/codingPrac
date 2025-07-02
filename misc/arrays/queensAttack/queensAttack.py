def queensAttack(n, k, r_q, c_q, obstacles):
 # Convert to 0-based index
    queen_x, queen_y = r_q - 1, c_q - 1  
    
    # Convert obstacles to a set for quick lookup
    obstacle_set = {(r - 1, c - 1) for r, c in obstacles}  

    directions = [
        (-1, 0), (1, 0),  # Vertical (up, down)
        (0, -1), (0, 1),  # Horizontal (left, right)
        (-1, -1), (1, 1),  # Diagonal (top-left, bottom-right)
        (-1, 1), (1, -1)   # Diagonal (top-right, bottom-left)
    ]

    count = 0

    # Check all directions
    for dx, dy in directions:
        x, y = queen_x + dx, queen_y + dy
        while 0 <= x < n and 0 <= y < n and (x, y) not in obstacle_set:
            count += 1
            x += dx
            y += dy  # Move further in the direction

    return count
    