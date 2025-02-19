def stockPairs(stocksProfit, target):
    seen = set()
    pairs = set()
    
    for profit in stocksProfit:
        complement = target - profit
        if complement in seen:
            pairs.add(tuple(sorted((profit, complement))))
        seen.add(profit)
    
    return len(pairs)
