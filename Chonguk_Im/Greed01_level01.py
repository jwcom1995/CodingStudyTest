def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()
    nlost = set(lost) - set(reserve)
    nreserve = set(reserve) - set(lost)
    answer = n-len(nlost)
      
    
    for i in nlost:
        if (i-1) in nreserve:
            nreserve.remove(i-1)
            answer += 1
        elif (i+1) in nreserve:
            nreserve.remove(i+1)
            answer += 1
                              
    return answer
