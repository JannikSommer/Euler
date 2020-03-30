def main():
    radiatorstatus = 1
    t_room = 12
    price = 0
    A = [[0.95, 0], 
        [0, 1]]
    Xvec = [t_room, price]
    b = [1.1,5]
    u = radiatorstatus
    for i in range(50):
        if Xvec[0] < 20:
            u = 1
        elif Xvec[0] > 20:
            u = 0
        Bu = [b[0]*u, b[1]*u]
        Xvec = vectorvector(matirxvectormult(A,Xvec),Bu)
        print(str(Xvec))

def matirxvectormult(a,x):
    q = [0]
    index = 0

    for i in range(len(a)-1):
        q.append(0)

    for i in a:
        for j in i:
            q[index] += j*x[index] 
        index += 1
    return q
    
def vectorvector(a,b):
    q=a
    index = 0
    for i in b:
        q[index] += i
        index += 1
    return q

main()
