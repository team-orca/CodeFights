def quadZip(q,w,e,r):
    s=""
    for x in range(0, 76):
        if x < len(q):
            s +=str(q[x])
        if x < len(w):
            s +=str(w[x])   
        if x < len(e):
            s +=str(e[x])
        if x < len(r):
            s +=str(r[x])
    
    return s
